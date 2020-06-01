package JDBCtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc_resultset {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql:///testdb","root","root");
        String sql="select * from student";
        Statement stmt=conn.createStatement();
        ResultSet result=stmt.executeQuery(sql);
        while(result.next()){
            System.out.print("学号："+result.getInt(1)+"---");
            System.out.print("姓名："+result.getString(2)+"---");
            System.out.println("成绩："+result.getInt(3));
        }
        result.close();
        stmt.close();
        conn.close();
    }
}
