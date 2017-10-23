package by.tc.task01.dao.factory.impl;


import by.tc.task01.dao.factory.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.parser.ParsingOfParameters;

import java.util.List;

public class VacuumCleanerCreator implements ApplianceCreator {
    @Override
    public Appliance createAppliance(String lineForCreation) {
        List<String> listWithArgs;
        listWithArgs= ParsingOfParameters.getParams(lineForCreation);
        VacuumCleaner vacuumCleaner=new VacuumCleaner(Integer.parseInt(listWithArgs.get(0)), listWithArgs.get(1), listWithArgs.get(2), listWithArgs.get(3), Integer.parseInt(listWithArgs.get(4)), Integer.parseInt(listWithArgs.get(5)));
        return vacuumCleaner;
    }
}
