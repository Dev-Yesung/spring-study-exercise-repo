package api.dao;

import api.dto.Role;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoleDao {

    private static final String dbUrl = "jdbc:mysql://localhost:3306/connectdb";
    private static final String dbUser = "root";
    private static final String dbPassword = "ye159159";
    private Role role = null;
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public int addRole(Role role) {
        int insertCount = 0;

        try {
            getConnection();

            sql = "INSERT INTO role (role_id, description) VALUES (?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, role.getRoleId());
            ps.setString(2, role.getDescription());

            insertCount = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            resetVariables();
            handleExceptions();
        }

        return insertCount;
    }


    public Role getRole(Integer roleId) {
        try {
            getConnection();

            sql = "SELECT role_id, description FROM role WHERE role_id = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, roleId);
            rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("role_id");
                String description = rs.getString("description");
                role = new Role(id, description);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            resetVariables();
            handleExceptions();
        }

        return role;
    }

    public List<Role> getRoles() {
        List<Role> list = new ArrayList<>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        sql = "SELECT role_id, description FROM role ORDER BY role_id DESC";
        try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            ps = conn.prepareStatement(sql);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("role_id");
                    String description = rs.getString("description");
                    Role role = new Role(id, description);
                    list.add(role);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return list;
    }

    public int deleteRole(Integer roleId) {
        int deleteCount = 0;

        try {
            getConnection();

            sql = "DELETE FROM role WHERE role_id = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, roleId);

            deleteCount = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            resetVariables();
            handleExceptions();
        }

        return deleteCount;
    }

    public int updateRole(Role role) {
        int updateCount = 0;

        try {
            getConnection();

            sql = "UPDATE role SET description = ? WHERE role_id = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, role.getDescription());
            ps.setInt(2, role.getRoleId());

            updateCount = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            resetVariables();
            handleExceptions();
        }

        return updateCount;
    }

    private void getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
    }

    private void resetVariables() {
        conn = null;
        ps = null;
        rs = null;
        sql = null;
    }

    private void handleExceptions() {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
