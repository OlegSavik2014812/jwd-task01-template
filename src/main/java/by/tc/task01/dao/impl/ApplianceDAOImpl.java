package by.tc.task01.dao.impl;

import by.tc.task01.constant.ConstantForProject;
import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.factory.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.parser.FindCorrectLineAction;

import java.io.*;

public class ApplianceDAOImpl implements ApplianceDAO {


    @Override
    public <E> Appliance find(Criteria<E> criteria) {
        // you may add your own code here
        Appliance appliance;
        try {
            FindCorrectLineAction findCorrectLineAction = new FindCorrectLineAction(ConstantForProject.PATH_OF_INPUT_FILE);
            ApplianceCreator applianceCreator = ConstantForProject.APPLIANCE_CREATOR_MAP.get(criteria.getApplianceType());
            appliance = applianceCreator.createAppliance(findCorrectLineAction.findCorrectLine(criteria));
            return appliance;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    // you may add your own code here
}

//you may add your own new classes
