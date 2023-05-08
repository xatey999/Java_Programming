import java.lang.*;
import java.sql.*;
public class JdbcConnectionMySql{

    public static void main(String[] args) throws Exception{
        // Step - I​
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Step - IImysql​

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jmc", "root", "");
        // Step -III​
        Statement stmt = con.createStatement();
        // Step - IV​
        ResultSet rs = stmt.executeQuery("select * from student");
        // Step - V​
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
        // Step - VI​
        rs.close();
        stmt.close();
        con.close();
    }
}