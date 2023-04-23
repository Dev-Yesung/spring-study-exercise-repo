package example.firstweb;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet("/logic")
public class LogicServlet extends HttpServlet {

    public LogicServlet() {
        super();
    }

    @Override
    public void service(ServletRequest req, ServletResponse res)
            throws ServletException, IOException {
        int ranVal1 = (int) (Math.random() * 100) + 1;
        int ranVal2 = (int) (Math.random() * 100) + 1;
        int result = ranVal1 + ranVal2;

        req.setAttribute("ranVal1", ranVal1);
        req.setAttribute("ranVal2", ranVal2);
        req.setAttribute("result", result);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/result.jsp");
        requestDispatcher.forward(req, res);
    }
}
