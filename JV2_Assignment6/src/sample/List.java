package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class List implements Initializable  {
   public TableView<user> tbView;
   public TableColumn<user,Integer> txtId;
    public TableColumn<user,Integer> txtUsername;
    public TableColumn<user,Integer> txtEmail;
    public TableColumn<user,Integer> txtPassword;
    public TableColumn<user,Integer> txtStatus;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtId.setCellValueFactory(new PropertyValueFactory<>("id"));
        txtUsername.setCellValueFactory(new PropertyValueFactory<>("username"));
        txtEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        txtPassword.setCellValueFactory(new PropertyValueFactory<>("password"));
        txtStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        ObservableList<user> usersList= FXCollections.observableArrayList();
       Conector conector=new Conector();
       String sql="Select *From user";
       try {
           ResultSet rs=conector.getQuery(sql);
           while (rs.next()){
               usersList.add(new user(
                       rs.getInt("id"),
                       rs.getString("username"),
                       rs.getString("email"),
                       rs.getString("password"),
                       rs.getInt("status")

               ));
           }
       }catch (Exception e){}
        tbView.setItems(usersList);
    }
}
