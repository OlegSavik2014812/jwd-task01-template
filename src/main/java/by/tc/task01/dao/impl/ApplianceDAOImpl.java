package by.tc.task01.dao.impl;

import by.tc.task01.constant.Constant;
import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.factory.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.parser.FindCorrectString;

import java.io.*;

public class ApplianceDAOImpl implements ApplianceDAO {


    @Override
    public <E> Appliance find(Criteria<E> criteria) {
        // you may add your own code here
        Appliance appliance;
        try {
            FindCorrectString findCorrectString = new FindCorrectString(Constant.PATH);
            String stringForCreation = findCorrectString.findCorrectString(criteria);
            ApplianceCreator applianceCreator = Constant.APPLIANCE_CREATOR.get(criteria.getApplianceType());
            appliance = applianceCreator.create(stringForCreation);
            return appliance;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    // you may add your own code here
}

//you may add your own new classes
