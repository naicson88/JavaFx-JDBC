package model.service;

import java.util.List;

import model.DAO.DAOFactory;
import model.DAO.DepartmentDAO;
import model.entities.Department;

public class DepartmentService {
	
	private DepartmentDAO dao = DAOFactory.createDepartmentDAO();
	
	public List<Department> findAll(){
		return dao.findAll();
	}
}
