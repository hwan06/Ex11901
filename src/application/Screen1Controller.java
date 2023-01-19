package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Screen1Controller implements Initializable {

	@FXML Button btnSecond, btnClose;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

	public void btnSecondAction(ActionEvent event) {
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Screen2.fxml"));
			Stage stage = new Stage();
			stage.setScene(new Scene(root,600,400));
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
		
	public void btnCloseAction(ActionEvent event) {
		
		Stage stage = (Stage) btnClose.getScene().getWindow();
		stage.close();
		
	}
	
}
	

