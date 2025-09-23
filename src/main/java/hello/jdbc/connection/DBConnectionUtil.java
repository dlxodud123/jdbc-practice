package hello.jdbc.connection;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static hello.jdbc.connection.ConnectionConst.*;

// 로그를 위해
@Slf4j
public class DBConnectionUtil {
    public static Connection getConnection(){
        try {
            // 해당 URL변수를 ConnectionConst에서 가져오려고 import static을 하려면 Alt + enter 사용
            // 새 변수로 만드는 방법 : Ctrl + Alt + v
            // DriverManager.getConnection()은 라이브러리에 있는 DB 드라이버(H2)를 찾아서 connection 반환
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            log.info("get connection={}, class={}", connection, connection.getClass());
            return connection;
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
}
