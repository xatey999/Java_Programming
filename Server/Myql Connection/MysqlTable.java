import java.lang.*;
import java.sql.*;

public class MysqlTable {
    public static void main(String[] args) throws Exception {
       Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jmc", "root", "");
Statement stmt = con.createStatement();
String student = “create table student ( stud_id integer,stud_name varchar(20),stud_address varchar(30) )”;

stmt.execute(student);
         stmt.close();
        con.close();
    }
}

