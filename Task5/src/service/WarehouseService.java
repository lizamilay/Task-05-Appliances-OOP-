package service;

import java.util.List;

import bean.Appliance;

public interface WarehouseService {
	
	List<Appliance> findByCategory(String name) throws  ServiceException;

}
