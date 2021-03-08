package main;

import controller.ApplianceController;
import controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new ApplianceController();

        String request;
        String response;

        request = "logination _|_ login = aa _|_ password = bb";

        response = controller.doAction(request);

        System.out.println(response);

        request = "logination _|_ login = iii _|_ password = 1234";

        response = controller.doAction(request);

        System.out.println(response);

        request = "changeprofile _|_ login = aa _|_ password = bb _|_ name = ivan _|_ familyName = ivanov";

        response = controller.doAction(request);

        System.out.println(response);

        request = "changeprofile _|_ login = iii _|_ password = 1234 _|_ name = ivan11 _|_ familyName = ivanov11";

        response = controller.doAction(request);

        System.out.println(response);

        request = "findbycategory _|_ category = Oven";

        response = controller.doAction(request);

        System.out.println(response);
    }
}
