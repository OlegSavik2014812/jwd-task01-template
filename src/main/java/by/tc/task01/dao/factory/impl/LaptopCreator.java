package by.tc.task01.dao.factory.impl;

import by.tc.task01.dao.factory.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.parser.ParsingOfParameters;

import java.util.List;

public class LaptopCreator implements ApplianceCreator {
    @Override
    public Appliance createAppliance(String lineForCreation) {
        List<String> listWithArgs;
        listWithArgs = ParsingOfParameters.getParams(lineForCreation);
        Laptop laptop = new Laptop(Double.parseDouble(listWithArgs.get(0)), listWithArgs.get(1), Integer.parseInt(listWithArgs.get(2)), Integer.parseInt(listWithArgs.get(3)), Double.parseDouble(listWithArgs.get(4)), Integer.parseInt(listWithArgs.get(5)));
        return laptop;
    }
}
