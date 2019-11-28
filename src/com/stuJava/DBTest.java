package com.stuJava;
import java.sql.*;

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
//            System.out.println("Success");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
