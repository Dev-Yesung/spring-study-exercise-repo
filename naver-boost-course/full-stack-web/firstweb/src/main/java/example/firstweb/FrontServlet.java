package example.firstweb;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet("/front")
public class FrontServlet extends HttpServlet {

    public FrontServlet() {
        super();
    }

    @Override
    public void service(ServletRequest req, ServletResponse res)
            throws ServletException, IOException {
        int diceValue = (int) (Math.random() * 6) + 1;
        req.setAttribute("dice", diceValue);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/next");
        requestDispatcher.forward(req, res);
    }
}
