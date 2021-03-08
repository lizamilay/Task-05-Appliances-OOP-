package service;

import bean.User;

public interface ClientService {
	
	boolean logination(String login, String password) throws ServiceException;
	boolean changeProfile(User user) throws ServiceException;
}
