import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Compliant {
    private Connection connection;

    public void doPrivilegedAction(
            String username, char[] password
    ) throws SQLException {
        Connection connection = getConnection();
        if (connection == null) {
// Handle error
        }
        try {
            String pwd = hashpassword(password);
// Validate username length
            if (username.length() > 8) {
// Handle error
            }
            String sqlString =
                    "select * from db_user where username=? and password=?";
            PreparedStatement stmt = connection.prepareStatement(sqlString);
            stmt.setString(1, username);
            stmt.setString(2, pwd);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                throw new SecurityException("User name or password incorrect");
            }
// Authenticated; proceed
        } finally {
            try {
                connection.close();
            } catch (SQLException x) {
// Forward to handler
            }
        }
    }


    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
