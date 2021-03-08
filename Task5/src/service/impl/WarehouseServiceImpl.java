package service.impl;

import bean.Appliance;
import dao.DAOException;
import dao.DAOProvider;
import dao.FindApplianceDAO;
import service.ServiceException;
import service.WarehouseService;

import java.util.ArrayList;
import java.util.List;

public class WarehouseServiceImpl implements WarehouseService {
    @Override
    public List<Appliance> findByCategory(String name) throws ServiceException {
        if(name == null || "".equals(name)) {
            return null;
        }

        List<Appliance> appliances = new ArrayList<Appliance>();
        DAOProvider provider = DAOProvider.getInstance();
        FindApplianceDAO applianceDAO = provider.getFindApplianceDAO();
        try {
           appliances = applianceDAO.findByCategory(name);
        }
        catch (DAOException e){
            throw new ServiceException(e);
        }
        return appliances;
    }
}
