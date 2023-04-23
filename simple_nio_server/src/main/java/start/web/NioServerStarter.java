package start.web;

import java.io.IOException;

public class NioServerStarter {

    public static void main(String[] args) {
        NioServer nioServer = new NioServer(8080);

        System.out.println("---------------------------------------");
        System.out.println("|| Welcome to simple java nio server ||\n"
                                   + "|| Host name : " + nioServer.getHostName() + "             ||\n"
                                   + "|| Port : " + nioServer.getPort() + "                       ||\n"
                                   + "|| written by Dev-Yesung             ||\n"
                                   + "|| {\\___/}                           ||\n"
                                   + "|| ( -__• ᡕᠵ᠊ᡃ່࡚ࠢ࠘ ⸝່ࠡࠣ᠊߯᠆ࠣ࠘ᡁࠣ࠘᠊᠊ࠢ࠘\uD802\uDC4F >    >       >    💥\n"
                                   + "|| / ᡕᠵ᠊ᡃ່࡚ࠢ࠘ ⸝່ࠡࠣ᠊߯᠆ࠣ࠘ᡁࠣ࠘᠊᠊ࠢ࠘\uD802\uDC4F       >        >     > 💥");
        System.out.println("---------------------------------------");

        try {
            nioServer.start();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println();
            System.out.println("Shut down the server");
            System.out.println("Print stack trace");
            e.getStackTrace();
        }
    }
}
