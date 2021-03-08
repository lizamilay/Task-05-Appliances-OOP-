package dao;

import bean.User;

public interface UserDAO {

	String logination(String login, String password) throws DAOException;
	void changeProfile(User user) throws DAOException;
	
}
