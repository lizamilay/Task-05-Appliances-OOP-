package controller.command.impl;

import bean.User;
import controller.command.Command;
import service.ClientService;
import service.ServiceException;
import service.ServiceProvider;

public class ChangeProfileCommand implements Command {
    @Override
    public String execute(String request) {

        //// "changeprofile _|_ login = aa _|_ password = bb _|_ name = ivan _|_ familyName = ivanov";
        ServiceProvider provider = ServiceProvider.getInstance();
        ClientService clientService = provider.getClientService();
        String[] params;

        params = request.split("\\s+_\\|_\\s+");
        // check params
        String login;
        String password;
        String name;
        String familyName;
        String response;

        login = params[1].split("\\s+=\\s+")[1];
        password = params[2].split("\\s+=\\s+")[1];
        name = params[3].split("\\s+=\\s+")[1];
        familyName = params[4].split("\\s+=\\s+")[1];

        try {
          if(clientService.changeProfile(new User(name, familyName, login, password))) {
              response = "User has been successfully changed";
          }
          else{
              response = "User has NOT been successfully changed";
          }

        } catch (ServiceException e) {
            response = "Error";
        }
        return response;
    }
}
