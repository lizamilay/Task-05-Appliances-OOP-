package controller.command.impl;

import controller.command.Command;

public class NoFoundCommand implements Command {
    @Override
    public String execute(String request) {
        String result;
        String response;

        result = request.split("\\s+:\\s+")[0];

        response =  result + " command was not found";
        return response;
    }
}
