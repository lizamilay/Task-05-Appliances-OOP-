package dao.impl;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import bean.Appliance;
import dao.FindApplianceDAO;

public class FileFindApplianceDAO implements FindApplianceDAO {

	@Override
	public List<Appliance> findByCategory(String name) {
		String path = "resources/appliances.db";
		String line;
		String[] temp;

		List<Appliance> result = new ArrayList<>();

		try {

			File file = new File(path);
			BufferedReader reader = new BufferedReader(new FileReader(file));
			while ((line = reader.readLine()) != null) {

				temp = line.split("\\s+:\\s+");

				if (temp[0].equals(name)) {

					result.add(new Appliance());

				}

			}

		} catch (FileNotFoundException e) {// помнишь, мы разбирали, что нельзя просто так гасить исключения - это ошибка кодирования.
			// вызывающий код, получается, не может ничего сделать, хотя верных данных и не получит
			// нужно выбратьвать сервисам свое исключения слоя дао

			System.out.println(e.getLocalizedMessage());

		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}

}
