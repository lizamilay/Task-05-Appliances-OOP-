package dao.impl;

import bean.User;
import dao.DAOException;
import dao.UserDAO;

import java.io.*;
import java.util.Scanner;

public class FileUserDAO implements UserDAO{

	private static final String filePath = "resources/users.db";
	
	@Override
	public String logination(String login, String password) throws DAOException {

		String line;
		String[] temp;

		try {

			File file = new File(filePath);
			BufferedReader reader = new BufferedReader(new FileReader(file));
			while ((line = reader.readLine()) != null) {

				temp = line.split(" ");

				if (temp[2].equals(login) && temp[3].equals(password)) {

					return line;

				}

			}

			reader.close();

		} catch (FileNotFoundException e) {
			throw new DAOException(e);
		} catch (IOException e) {
			throw new DAOException(e);
		}

		return null;
	}

	@Override
	public void changeProfile(User user) throws DAOException{

		try {
			String oldUser = logination(user.getLogin(),user.getPassword());
			if( oldUser != null){
				File file = new File(filePath);
				Scanner sc = new Scanner(file);
				StringBuffer buffer = new StringBuffer();
				while (sc.hasNextLine()) {
					buffer.append(sc.nextLine()+System.lineSeparator());
				}
				String fileContents = buffer.toString();
				String newUser = user.getName() + " "  + user.getFamilyName() + " " + user.getLogin() + " " + user.getPassword();
				fileContents = fileContents.replaceAll(oldUser, newUser);
				FileWriter writer = new FileWriter(filePath);
				writer.append(fileContents);
				writer.flush();
				sc.close();
			}
			else{
				throw new DAOException("No user found for this login+password");
			}
		} catch (IOException e) {
			throw new DAOException(e);
		}

	}

}
