package controller;

import controller.command.Command;
import controller.command.CommandProvider;

public class ApplianceController  implements Controller{
    private final CommandProvider provider = new CommandProvider();

    @Override
    public String doAction(String request) {
        String commandName;
        commandName = request.split("\\s+_\\|_\\s+",2)[0];

        Command command;
        command = provider.getCommand(commandName);

        String response;
        response = command.execute(request);

        return response;
    }
}
