package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.parser.FindCorrectString;

import java.io.*;

public class ApplianceDAOImpl implements ApplianceDAO {
    @Override
    public <E> Appliance find(Criteria<E> criteria) {
        // you may add your own code here
        try {
            String path = "src/main/resources/appliances_db.txt";
            FindCorrectString findCorrectString = new FindCorrectString(path);
            return new Appliance().createApp(findCorrectString.findCorrectString(criteria));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    // you may add your own code here
}

//you may add your own new classes
