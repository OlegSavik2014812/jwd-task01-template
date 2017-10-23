package by.tc.task01.dao.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.parser.ParsingParameters;

import java.util.List;

public class TabletPCCreator implements ApplianceCreator {
    @Override
    public Appliance create(String s) {
        List<String> list;
        list = ParsingParameters.getParams(s);
        TabletPC tabletPC = new TabletPC(Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1)), Integer.parseInt(list.get(2)), Integer.parseInt(list.get(3)), list.get(4));
        return tabletPC;
    }
}
