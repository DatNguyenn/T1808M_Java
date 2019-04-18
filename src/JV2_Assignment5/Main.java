package JV2_Assignment5;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");

            String URL="jdbc:mysql://localhost:3306/t1808m";
            Connection connection=DriverManager.getConnection(URL,"t1808m","t1808m");

            Statement statement=connection.createStatement();

            String AddInFo="INSERT INTO User(username,email,password,status) VALUES ('NguyenVanE','enguyenvan1122@gmail.com','nguyenvane','1')";
            statement.executeUpdate(AddInFo);
//            String del="DELETE FROM User WHERE id=";
//            statement.executeUpdate(del);

            String DelSql="DELETE FROM User WHERE id=3";
            statement.executeUpdate(DelSql);



            String sql="SELECT * FROM User";
            ResultSet resultSet=statement.executeQuery(sql);

            while (resultSet.next()){
                System.out.println("ID: "+resultSet.getString("id"));
                System.out.println("UserName: "+resultSet.getString("username"));
                System.out.println("Email: "+resultSet.getString("email"));
                System.out.println("Password: "+resultSet.getString("password"));
                System.out.println("Status: "+resultSet.getString("status"));
            }
        }catch (Exception e){}
    }
}
