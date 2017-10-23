package by.tc.task01.dao.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.parser.ParsingParameters;

import java.util.List;

public class VacuumCleanerCreator implements ApplianceCreator {
    @Override
    public Appliance create(String s) {
        List<String> list;
        list= ParsingParameters.getParams(s);
        VacuumCleaner vacuumCleaner=new VacuumCleaner(Integer.parseInt(list.get(0)), list.get(1), list.get(2), list.get(3), Integer.parseInt(list.get(4)), Integer.parseInt(list.get(5)));
        return vacuumCleaner;
    }
}
