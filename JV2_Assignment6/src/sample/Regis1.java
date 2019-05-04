package sample;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import java.sql.ResultSet;
public class Regis1 {
    public void Login() throws Exception{
        Parent list=FXMLLoader.load(getClass().getResource("Login.fxml"));
        Main.mainStage.getScene().setRoot(list);
    }
}
