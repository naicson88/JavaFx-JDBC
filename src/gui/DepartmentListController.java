package gui;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Department;
import model.service.DepartmentService;

public class DepartmentListController implements Initializable {

	private DepartmentService service;

	@FXML
	private TableView<Department> tableViewDepartment;
	@FXML
	private TableColumn<Department, Integer> tableColumnID;
	@FXML
	private TableColumn<Department, String> tableColumnName;
	@FXML
	private Button btNovo;

	private ObservableList <Department> obslist;

	@FXML
	public void onbtNovoAction() {
		System.out.println("On bt new action!");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
	}

	public void setDeptService(DepartmentService service) {
		this.service = service;
	}

	private void initializeNodes() {
		tableColumnID.setCellValueFactory(new PropertyValueFactory<>("id"));
		tableColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));

		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewDepartment.prefHeightProperty().bind(stage.heightProperty());

	}

	public void updateTableView() {
		if (service == null) {
			throw new IllegalStateException("Service est� nulo");
		}

		List<Department> list = service.findAll();
		obslist = FXCollections.observableArrayList(list);
		tableViewDepartment.setItems(obslist);
	}
}