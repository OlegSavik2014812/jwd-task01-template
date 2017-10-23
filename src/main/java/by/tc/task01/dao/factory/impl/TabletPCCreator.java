package by.tc.task01.dao.factory.impl;

import by.tc.task01.dao.factory.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.parser.ParsingOfParameters;

import java.util.List;

public class TabletPCCreator implements ApplianceCreator {
    @Override
    public Appliance createAppliance(String lineForCreation) {
        List<String> listWithArgs;
        listWithArgs = ParsingOfParameters.getParams(lineForCreation);
        TabletPC tabletPC = new TabletPC(Integer.parseInt(listWithArgs.get(0)), Integer.parseInt(listWithArgs.get(1)), Integer.parseInt(listWithArgs.get(2)), Integer.parseInt(listWithArgs.get(3)), listWithArgs.get(4));
        return tabletPC;
    }
}
