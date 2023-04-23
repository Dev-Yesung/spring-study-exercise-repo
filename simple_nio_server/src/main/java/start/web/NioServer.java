package start.web;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;

public class NioServer {

    private Selector selector;
    private ServerSocketChannel serverSocketChannel;
    private String hostName = "localhost";
    private int port = 8080;

    public NioServer() {
    }

    public NioServer(int port) {
        this.port = port;
    }

    public void start() throws IOException {
        init();
        SelectionKey acceptKey = serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while (acceptKey.selector().select() > 0) {
            Iterator keyIter = selector.selectedKeys().iterator();

            while (keyIter.hasNext()) {
                SelectionKey selectionKey = (SelectionKey) keyIter.next();
                keyIter.remove();

                if (selectionKey.isAcceptable()) {
                    accept(selectionKey);
                }
                if (selectionKey.isReadable()) {
                    readMessage(selectionKey);
                }
                if (selectionKey.isWritable()) {
                    sendMessage(selectionKey);
                }
            }
        }
    }

    public String getHostName() {
        return hostName;
    }

    public int getPort() {
        return port;
    }

    private void init() throws IOException {
        selector = Selector.open();
        serverSocketChannel = ServerSocketChannel.open();
        // 입출력에 대한 설정 -> true : 동기처리, false : 비동기처리
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.socket().bind(new InetSocketAddress(hostName, port));
    }

    private void accept(SelectionKey key) throws IOException {
        try (ServerSocketChannel sChannel = (ServerSocketChannel) key.channel()) {
            SocketChannel socketChannel = sChannel.accept();
            socketChannel.configureBlocking(false);
            socketChannel.register(selector, SelectionKey.OP_READ);
        } catch (IOException e) {
            throw new IOException("[ERROR] can not accept the request");
        }
    }

    private void readMessage(SelectionKey key) throws IOException {
        ByteBuffer buf = ByteBuffer.allocateDirect(1024);
        StringBuffer sBuf;

        try (SocketChannel socketChannel = (SocketChannel) key.channel()) {
            socketChannel.configureBlocking(false);
            socketChannel.read(buf);
            buf.flip();

            Charset charset = StandardCharsets.UTF_8;
            CharsetDecoder decoder = charset.newDecoder();
            CharBuffer charBuffer = decoder.decode(buf);

            sBuf = new StringBuffer(charBuffer.toString());
            socketChannel.register(selector, SelectionKey.OP_WRITE, sBuf);
        } catch (IOException e) {
            throw new IOException("[ERROR] can not read the message");
        }
    }

    private void sendMessage(SelectionKey key) throws IOException {
        StringBuffer sBuf;

        try (SocketChannel socketChannel = (SocketChannel) key.channel()) {
            socketChannel.configureBlocking(false);
            sBuf = (StringBuffer) key.attachment();
            socketChannel.write(ByteBuffer.wrap(sBuf.toString().getBytes(StandardCharsets.UTF_8)));
            socketChannel.register(selector, SelectionKey.OP_READ, sBuf);
        } catch (IOException e) {
            throw new IOException("[ERROR] can not write the message");
        }
    }
}
