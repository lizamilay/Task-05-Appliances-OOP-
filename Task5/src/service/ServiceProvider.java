package service;

import service.impl.ClientServiceImpl;
import service.impl.WarehouseServiceImpl;

public final class ServiceProvider {
    private static final ServiceProvider instance = new ServiceProvider();

    private final ClientService clientService = new ClientServiceImpl();
    private final WarehouseService warehouseService = new WarehouseServiceImpl();

    public ServiceProvider() {
    }

    public static ServiceProvider getInstance() {
        return instance;
    }

    public ClientService getClientService() {
        return clientService;
    }

    public WarehouseService getWarehouseService() {
        return warehouseService;
    }
}
