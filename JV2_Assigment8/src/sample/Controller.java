package sample;

import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

import java.util.Locale;
import java.util.ResourceBundle;



public class Controller {
    public Button btnLogin;
    public Button btnRegister;
    public Button btnListing;
    public Button btnExit;
    public RadioButton rdEN;
    public RadioButton rdVN;

    public void setLanguage(){
        ResourceBundle resourceBundle=ResourceBundle.getBundle("sample.Messege");
        btnLogin.setText(resourceBundle.getString("Login"));
        btnRegister.setText(resourceBundle.getString("Register"));
        btnListing.setText(resourceBundle.getString("Listing"));
        btnExit.setText(resourceBundle.getString("Exit"));
    }
    public void changeVN(){
        Locale vi=new Locale("vi","VN");
        Locale.setDefault(vi);
        setLanguage();

        rdEN.setSelected(false);
        rdVN.setSelected(true);
    }

    public void changeEN(){
        Locale.setDefault(Locale.US);
        setLanguage();
        rdEN.setSelected(true);
        rdVN.setSelected(false);
    }
}
