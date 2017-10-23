package by.tc.task01.dao.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.parser.ParsingParameters;

import java.util.List;

public class RefrigeratorCreator implements ApplianceCreator {
    @Override
    public Appliance create(String s) {
        List<String> list;
        list = ParsingParameters.getParams(s);
        Refrigerator refrigerator = new Refrigerator(Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1)), Integer.parseInt(list.get(2)), Double.parseDouble(list.get(3)), Integer.parseInt(list.get(4)), Integer.parseInt(list.get(5)));
        return refrigerator;
    }
}
