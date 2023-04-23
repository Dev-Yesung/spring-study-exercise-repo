package example.firstweb;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/applicationScope02")
public class ApplicationScope02 extends HttpServlet {

    public ApplicationScope02() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();

        ServletContext application = getServletContext();
        try {
            int value = (Integer) application.getAttribute("value");
            value++;
            application.setAttribute("value", value);

            out.println("<h1>value : " + value + "</h1>");
        } catch (NullPointerException e) {
            out.println("value의 값이<strong>설정되지 않았습니다!!</strong>");
        }
    }
}
