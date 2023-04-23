import dao.RoleDao;

public class JdbcExam3 {
    public static void main(String[] args) {
        RoleDao dao = new RoleDao();
        int result = dao.deleteRole(500);
        System.out.println(result);
    }
}
