package sample;

import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Controller  {
    public TextField username;
    public TextField password;
    public class Conector  {
        public Connection conect;
        public void main(String[] args) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String URL="jdbc:mysql://locahost:8888/t1808m";
                this.conect= DriverManager.getConnection(URL,"t1808m","t1808m");
            }catch (Exception e ){
                e.printStackTrace();
            }
        }
        public ResultSet getQuery(String sql) throws Exception{
            Statement sttm=conect.createStatement();
            return sttm.executeQuery(sql);
        }
        public Integer updateQuery(String sql)throws Exception{
            Statement sttm=conect.createStatement();
            return sttm.executeUpdate(sql);
        }
    }

    public  void button(Connection conect) throws Exception {
        String x=username.getText();
        String y=password.getText();

        Statement sttm = conect.createStatement();
        String sql = "SELECT * FROM user WHERE username = '" + x
                + "'AND password = '" + y+"'";
        ResultSet rs = sttm.executeQuery(sql);



    }
}
