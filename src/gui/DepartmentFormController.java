package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constrains;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class DepartmentFormController implements Initializable{

	@FXML
	private TextField txtId;
	@FXML
	private TextField txtName;
	@FXML
	private Label labelError;
	@FXML
	private Button btnSave;
	@FXML
	private Button btnCancel;
	
	@FXML
	public void onBtnSave() {
		System.out.println("Botao 2");
	}
	
	@FXML
	public void onBtnCancel() {
		System.out.println("Botao C");
	}
	
	public void initializeNodes() {
		Constrains.setTextFieldMaxLength(txtName, 30);
		Constrains.setTextFielInteger(txtId);
	}

	
	@Override
	public void initialize(URL url, ResourceBundle rd) {
		// TODO Auto-generated method stub
		
	}
	
}
