package JDBCtest;

import java.sql.*;

public class utilstest {
    public static void main(String[] args) throws SQLException {
        JDBCUtils utils=new JDBCUtils();
        Connection conn=utils.getConnection();
       String sql="select * from student where num=?";
        PreparedStatement ptmt=conn.prepareStatement(sql);
        ptmt.setInt(1,1);
        ResultSet rs=ptmt.executeQuery();
        while(rs.next()){
            System.out.print("学号："+rs.getInt(1)+"---");
            System.out.print("姓名："+rs.getString(2)+"---");
            System.out.println("成绩："+rs.getInt(3));
        }
        utils.close(rs,ptmt,conn);
    }
}
