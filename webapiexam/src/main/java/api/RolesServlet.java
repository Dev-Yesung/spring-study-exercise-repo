package api;

import api.dao.RoleDao;
import api.dto.Role;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/roles")
public class RolesServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;


    public RolesServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json");

        RoleDao dao = new RoleDao();

        List<Role> list = dao.getRoles();

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(list);

        PrintWriter out = resp.getWriter();
        out.println(json);
        out.close();
    }
}
