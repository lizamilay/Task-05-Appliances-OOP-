package dao;

import java.util.List;

import bean.Appliance;

public interface FindApplianceDAO {

	List<Appliance> findByCategory(String name) throws DAOException;
}
