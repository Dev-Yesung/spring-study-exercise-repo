import dao.RoleDao;
import dto.Role;
import java.util.List;

public class JdbcExam5 {

    public static void main(String[] args) {
        RoleDao dao = new RoleDao();
        List<Role> list = dao.getRoles();
        list.forEach(System.out::println);
    }
}
