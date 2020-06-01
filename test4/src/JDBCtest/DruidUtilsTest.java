package JDBCtest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DruidUtilsTest {
    public static void main(String[] args) throws SQLException {
        //获取数据库连接池
        DataSource ds=JDBCUtilsDruid.getDataSourse();
        //通过连接池获取连接对象
        Connection conn=ds.getConnection();
        //编写sql并执行
        String sql="insert into student values(10,'zjq',100)";
        Statement stmt=conn.createStatement();
        int count=stmt.executeUpdate(sql);
        System.out.println(count);
        //释放资源
        JDBCUtilsDruid.close(stmt,conn);
    }
}
