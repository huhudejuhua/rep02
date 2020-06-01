package JDBCtest;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    private static String url;
    private static String user;
    private static String password;
    private static String driver;

    static {
        Properties pro=new Properties();//创建properties集合类
        //获取src路径下的文件的方式(ClassLoader类加载器)
        ClassLoader classLoader=JDBCUtils.class.getClassLoader();
        URL res=classLoader.getResource("jdbc.properties");
        String path=res.getPath();
        System.out.println(path);
        //加载文件
        try {
            pro.load(new FileReader(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //数据赋值
        url=pro.getProperty("url");
        user=pro.getProperty("user");
        password=pro.getProperty("password");
        driver=pro.getProperty("driver");
        //注册驱动
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //获取连接的方法
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    //释放资源1
    public static void close(Statement stmt,Connection conn){
        if(stmt!=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //释放资源2
    public static void close(ResultSet rs, Statement stmt, Connection conn){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(stmt!=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
