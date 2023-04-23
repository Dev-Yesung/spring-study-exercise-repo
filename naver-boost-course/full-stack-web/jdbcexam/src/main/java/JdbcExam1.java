import dao.RoleDao;
import dto.Role;

public class JdbcExam1 {

    public static void main(String[] args) {
        RoleDao dao = new RoleDao();
        Role result = dao.getRole(3);
        System.out.println(result);
    }
}
