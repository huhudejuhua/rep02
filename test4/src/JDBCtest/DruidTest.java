package JDBCtest;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Properties;

public class DruidTest {
    public static void main(String[] args) throws Exception {
        //加载配置文件
        Properties pro=new Properties();
        InputStream is=DruidTest.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(is);
        //获取连接池对象ds
        DataSource ds= DruidDataSourceFactory.createDataSource(pro);
        //获取连接
        Connection conn=ds.getConnection();

        Statement stmt=conn.createStatement();
        String sql="insert into student values(8,'harry',0)";

        int count=stmt.executeUpdate(sql);
        System.out.println(count);

        stmt.close();
        conn.close();
    }
}
