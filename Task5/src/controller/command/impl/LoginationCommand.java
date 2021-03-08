package controller.command.impl;

import controller.command.Command;
import service.ClientService;
import service.ServiceException;
import service.ServiceProvider;

public class LoginationCommand implements Command {

    //// "logination _|_ login = aa _|_ password = bb";

    @Override
    public String execute(String request) {
        ServiceProvider provider = ServiceProvider.getInstance();
        ClientService clientService = provider.getClientService();

        String[] params;

        params = request.split("\\s+_\\|_\\s+");
        // check params
        String login;
        String password;
        boolean result;
        String response;
        login = params[1].split("\\s+=\\s+")[1];
        password = params[2].split("\\s+=\\s+")[1];

        try {
            result = clientService.logination(login, password);
            if (result) {
                response = "Login successful";
            } else {
                response = "Wrong login or password, please try again";
            }
        } catch (ServiceException e) {
            response = "Error 618";
        }
        return response;

    }
}
