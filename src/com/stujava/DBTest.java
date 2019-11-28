package com.stujava;
import java.sql.*;
/**
 * @author: Administrator
 * @date: 2019/11/28
 * @description: 测试连接 mariaDB 数据库
 */

public class DBTest {
    public static void main(String[] args) {
        try {
            String driver="org.mariadb.jdbc.Driver";
            String url ="jdbc:mariadb://localhost:3306/test";
            String user="root";
            String pass="xxx";

            Class.forName(driver);
            Connection conn=DriverManager.getConnection(url,user,pass);
            Statement stmt=conn.createStatement();

            ResultSet rs=stmt.executeQuery("select * from school.stu");
            while (rs.next()){
                System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)
                +"\t\t"+rs.getString(3));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
