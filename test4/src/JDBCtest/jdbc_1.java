package JDBCtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc_1 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");//注册驱动
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");//获取数据库连接对象
        String sql="insert into student values(2,'zyw',90)";//定义sql语句
        Statement stmt=conn.createStatement();//获取执行sql的对象statement
        int count=stmt.executeUpdate(sql);//执行sql
        System.out.println(count);//处理结果
        stmt.close();
        conn.close();//释放资源
    }
}
