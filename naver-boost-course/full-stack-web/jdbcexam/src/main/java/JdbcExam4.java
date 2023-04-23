import dao.RoleDao;
import dto.Role;

public class JdbcExam4 {

    public static void main(String[] args) {
        Role role = new Role(1, "PPAP");
        RoleDao dao = new RoleDao();
        int result = dao.updateRole(role);
        System.out.println(result);
    }

}
