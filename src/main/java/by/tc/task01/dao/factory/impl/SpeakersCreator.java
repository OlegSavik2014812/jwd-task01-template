package by.tc.task01.dao.factory.impl;
import by.tc.task01.dao.factory.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;
import by.tc.task01.parser.ParsingOfParameters;
import java.util.List;

public class SpeakersCreator implements ApplianceCreator {
    @Override
    public Appliance createAppliance(String lineForCreation) {
        List<String> listWithArgs;
        listWithArgs= ParsingOfParameters.getParams(lineForCreation);
        Speakers speakers=new Speakers(Integer.parseInt(listWithArgs.get(0)), Integer.parseInt(listWithArgs.get(1)), listWithArgs.get(2), Integer.parseInt(listWithArgs.get(3)));
        return speakers;
    }
}
