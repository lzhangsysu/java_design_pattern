package demo1.model;

public class MySQLDAOFactory extends DAOFactory {
	@Override
	public MySQLPersonDAO getPersonDAO() {
		return new MySQLPersonDAO();
	}
	
	@Override
	public MySQLLogDAO getLogDAO() {
		return new MySQLLogDAO();
	}
}
