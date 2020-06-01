package JDBCtest;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class c3p0Test {
    public static void main(String[] args) throws SQLException {
        //创建数据库连接池对象
        DataSource ds=new ComboPooledDataSource();
        //获取连接对象
        Connection conn=ds.getConnection();
        System.out.println(conn);
        String sql="insert into student values(4,'wyq',50)";
        Statement stmt=conn.createStatement();
        stmt.execute(sql);
        stmt.close();
        conn.close();
    }
}
