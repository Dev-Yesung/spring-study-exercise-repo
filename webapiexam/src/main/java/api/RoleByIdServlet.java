package api;

import api.dao.RoleDao;
import api.dto.Role;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/roles/*")
public class RoleByIdServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public RoleByIdServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json");

        String pathInfo = req.getPathInfo();
        String[] pathParts = pathInfo.split("/");
        String idStr = pathParts[1];
        int id = Integer.parseInt(idStr);

        RoleDao dao = new RoleDao();
        Role role = dao.getRole(id);

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(role);

        PrintWriter out = resp.getWriter();
        out.println(json);
        out.close();
    }
}
