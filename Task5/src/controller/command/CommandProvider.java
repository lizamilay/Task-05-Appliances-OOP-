package controller.command;

import controller.command.impl.ChangeProfileCommand;
import controller.command.impl.FindByCategoryCommand;
import controller.command.impl.LoginationCommand;
import controller.command.impl.NoFoundCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private Map<String, Command> commands = new HashMap<>();

    public CommandProvider() {
        commands.put("logination", new LoginationCommand());
        commands.put("changeprofile", new ChangeProfileCommand());
        commands.put("findbycategory", new FindByCategoryCommand());
        commands.put("nocommand", new NoFoundCommand());
    }

    public Command getCommand(String commandName) {
        Command command;

        command = commands.get(commandName);
        if(command == null) {
            command = commands.get("nocommand");
        }

        return command;

    }
}
