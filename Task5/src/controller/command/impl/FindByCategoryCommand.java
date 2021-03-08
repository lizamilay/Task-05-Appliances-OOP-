package controller.command.impl;

import bean.Appliance;
import controller.command.Command;
import service.ServiceException;
import service.ServiceProvider;
import service.WarehouseService;

import java.util.List;

public class FindByCategoryCommand implements Command {
    @Override
    public String execute(String request) {
        //// "findbycategory _|_ category = Oven";
        ServiceProvider provider = ServiceProvider.getInstance();
        WarehouseService warehouseService = provider.getWarehouseService();

        String response ="";
        StringBuilder sb = new StringBuilder();
        String[] params;

        params = request.split("\\s+_\\|_\\s+");
        // check params
        String category;
        category = params[1].split("\\s+=\\s+")[1];
        try {
            List<Appliance> appliances = warehouseService.findByCategory(category);
            for( Appliance app : appliances){
               sb.append(app.toString());
               sb.append('\n');
            }
            response = sb.toString();

        } catch (ServiceException e) {
            response = "Error";
        }
        return response;
    }
}
