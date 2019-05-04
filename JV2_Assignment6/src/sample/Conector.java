package sample;

import java.sql.*;
public class Conector {
    public Connection conn;
    public Conector(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String URL="jdbc:mysql://localhost:3306/t1808m";
            conn= DriverManager.getConnection(URL,"t1808m","t1808m");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public ResultSet getQuery(String sql) throws Exception{
        Statement statement = conn.createStatement();
        return statement.executeQuery(sql);
    }
}

