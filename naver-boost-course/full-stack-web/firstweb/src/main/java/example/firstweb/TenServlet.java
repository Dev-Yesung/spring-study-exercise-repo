package example.firstweb;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ten")
public class TenServlet extends HttpServlet {

    public TenServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print("<h1>1~10까지 출력!!</h1>");
        out.print("<ul>");
        for (int i = 1; i <= 10; i++) {
            out.print("<li>" + i + "</li>");
        }
        out.print("</ul>");
        out.close();
    }
}
