
package mypkg;
import java.sql.Connection;
import java.sql.DriverManager;
public class Data {
    public static Connection connect()throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/ecomdb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        Connection con=DriverManager.getConnection(url, "root", "");
        return con;
    }
}
