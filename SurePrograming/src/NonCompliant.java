import javax.swing.*;
import java.sql.*;
import java.util.Objects;
import java.util.Properties;
import java.util.logging.LogManager;
import java.util.logging.Logger;


    public class Login<privite> {
        private Object String;

        public Connection getConnection() throws SQLException {
            DriverManager.registerDriver(new SQLServerDriver() {
                @Override
                public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
                    return new DriverPropertyInfo[0];
                }

                @Override
                public int getMajorVersion() {
                    return 0;
                }

                @Override
                public int getMinorVersion() {
                    return 0;
                }

                @Override
                public boolean jdbcCompliant() {
                    return false;
                }

                @Override
                public Logger getParentLogger() throws SQLFeatureNotSupportedException {
                    return null;
                }
            });
            LogManager propertyManager = null;
            String dbConnection = propertyManager.getProperty("db.connection");
// Can hold some value like
// "jdbc:microsoft:sqlserver://<HOST>:1433,<UID>,<PWD>"
            return DriverManager.getConnection(dbConnection);
        }
        String hashPassword(char[] password) {
// Create hash of password
            return null;
        }
        public void doPrivilegedAction(
                String username, char[] password
        ) throws SQLException {
            Connection connection = getConnection();

                if (connection == null) {
// Handle error
                }
                String pwd = hashPassword(password);
                String sqlString = "select * from db_user where username=" + username + " and password =" + pwd;
                PreparedStatement stmt = Objects.requireNonNull(connection).prepareStatement((java.lang.String) String);
                ResultSet rs = stmt.executeQuery();
                else" without "if" (!rs.next()) ;
                throw new SecurityException("User name or password incorrect");
// Authenticated; proceed
            }
            // Forward to handler;
        }

        privite abstract static class SQLServerDriver implements Driver {
            @Override
            public Connection connect(String url, Properties info) throws SQLException {
                return getConnection();
            }

    private Connection getConnection() {
        return null;
    }

    @Override
            public boolean acceptsURL(String url) throws SQLException {
                return false;
            } ;
        } ;

}
