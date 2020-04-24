package model.DAO;

import db.DB;
import model.DAO.Impl.DepartmentDaoJDBC;
import model.DAO.Impl.SellerDaoJDBC;

public class DAOFactory {
	
	public static SellerDAO createSellerDAO() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDAO createDepartmentDAO() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
