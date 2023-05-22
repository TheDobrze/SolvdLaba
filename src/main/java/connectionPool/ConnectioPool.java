package connectionPool;

import java.sql.Connection;

public interface ConnectioPool {

    Connection getConnection();
    boolean releaseConnection(Connection connection);
    String getUrl();
    String getUser();
    String getPassword();

}
