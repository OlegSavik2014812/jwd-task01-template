package by.tc.task01.dao.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.parser.ParsingParameters;

import java.util.List;

public class LaptopCreator implements ApplianceCreator {
    @Override
    public Appliance create(String s) {
        List<String> list;
        list = ParsingParameters.getParams(s);
        Laptop laptop = new Laptop(Double.parseDouble(list.get(0)), list.get(1), Integer.parseInt(list.get(2)), Integer.parseInt(list.get(3)), Double.parseDouble(list.get(4)), Integer.parseInt(list.get(5)));
        return laptop;
    }
}
