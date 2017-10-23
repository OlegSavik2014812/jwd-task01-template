package by.tc.task01.dao.factory.impl;

import by.tc.task01.dao.factory.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.parser.ParsingOfParameters;

import java.util.List;

public class OvenCreator implements ApplianceCreator {
    @Override
    public Appliance createAppliance(String lineForCreation) {
        List<String> listWithArgs;
        listWithArgs = ParsingOfParameters.getParams(lineForCreation);
        Oven oven = new Oven(Integer.parseInt(listWithArgs.get(0)), Integer.parseInt(listWithArgs.get(1)), Integer.parseInt(listWithArgs.get(2)), Integer.parseInt(listWithArgs.get(3)), Double.parseDouble(listWithArgs.get(4)), Double.parseDouble(listWithArgs.get(5)));
        return oven;
    }
}
