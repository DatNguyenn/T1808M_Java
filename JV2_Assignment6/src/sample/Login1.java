package sample;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

import java.sql.ResultSet;

public class Login1 {
    public TextField txtUsername;
    public TextField txtPassword;
    public void buttun() throws Exception{
      String username=txtUsername.getText();
      String password=txtPassword.getText();
        Conector conector =new Conector();
        String sql="SELECT *FROM user WHERE username LIKE '"+username+"' AND password LIKE '"+ password+"'";
        ResultSet rs=conector.getQuery(sql);
        if(rs.next()){
            Parent list= FXMLLoader.load(getClass().getResource(sql));
            Main.mainStage.getScene().setRoot(list);
        }
        else {
            System.out.println("Sai username hoac password");
        }
    }
    public void changeRegister() throws Exception{
        Parent list=FXMLLoader.load(getClass().getResource("FormDkyASS5.fxml"));
        Main.mainStage.getScene().setRoot(list);
    }

}
