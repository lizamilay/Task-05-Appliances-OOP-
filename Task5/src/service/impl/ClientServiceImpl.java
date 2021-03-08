package service.impl;

import bean.User;
import dao.DAOException;
import dao.DAOProvider;
import dao.UserDAO;
import service.ClientService;
import service.ServiceException;

public class ClientServiceImpl implements ClientService{


	@Override
	public boolean logination(String login, String password) throws ServiceException {
		// validation
		if(login == null || "".equals(login)) {
			return false;
		}
		
		DAOProvider provider = DAOProvider.getInstance();
		UserDAO userDAO = provider.getUserDAO();
		
		String result;
		try {
			result = userDAO.logination(login, password);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		
		return (result != null);
	}


	@Override
	public boolean changeProfile(User user) throws ServiceException {
		if (user.getName() == null || "".equals(user.getName())) {
			return false;
		} else if (user.getFamilyName() == null || "".equals(user.getFamilyName())) {
			return false;
		} else if (user.getLogin() == null || "".equals(user.getLogin())) {
			return false;
		} else if (user.getPassword() == null || "".equals(user.getPassword())) {
			return false;
		} else {
			DAOProvider provider = DAOProvider.getInstance();
			UserDAO userDAO = provider.getUserDAO();
			try {
				userDAO.changeProfile(user);
			} catch (DAOException e) {
				throw new ServiceException(e);
			}
			return true;
		}
	}
}
