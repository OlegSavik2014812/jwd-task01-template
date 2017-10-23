package by.tc.task01.dao.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.parser.ParsingParameters;

import java.util.List;

public class OvenCreator implements ApplianceCreator {
    @Override
    public Appliance create(String s) {
        List<String> list;
        list = ParsingParameters.getParams(s);
        Oven oven = new Oven(Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1)), Integer.parseInt(list.get(2)), Integer.parseInt(list.get(3)), Double.parseDouble(list.get(4)), Double.parseDouble(list.get(5)));
        return oven;
    }
}
