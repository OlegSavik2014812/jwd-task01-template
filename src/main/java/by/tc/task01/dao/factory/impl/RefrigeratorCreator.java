package by.tc.task01.dao.factory.impl;

import by.tc.task01.dao.factory.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.parser.ParsingOfParameters;

import java.util.List;

public class RefrigeratorCreator implements ApplianceCreator {
    @Override
    public Appliance createAppliance(String lineForCreation) {
        List<String> listWithArgs;
        listWithArgs = ParsingOfParameters.getParams(lineForCreation);
        Refrigerator refrigerator = new Refrigerator(Integer.parseInt(listWithArgs.get(0)), Integer.parseInt(listWithArgs.get(1)), Integer.parseInt(listWithArgs.get(2)), Double.parseDouble(listWithArgs.get(3)), Integer.parseInt(listWithArgs.get(4)), Integer.parseInt(listWithArgs.get(5)));
        return refrigerator;
    }
}
