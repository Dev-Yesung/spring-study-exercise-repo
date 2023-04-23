package example.firstweb;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/next")
public class NextServlet extends HttpServlet {

    public NextServlet() {
        super();
    }

    @Override
    public void service(ServletRequest req, ServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<head><title>form</title></head>");
        out.println("<body>");

        int dice = (Integer) req.getAttribute("dice");
        out.println("dice : <em>" + dice + "</em>");
        for (int i = 0; i < dice; i++) {
            out.println("<h3>Hello!</h3>");
        }
        out.println("</body>");
        out.println("</html>");
    }
}
