package by.tc.task01.dao.factory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;
import by.tc.task01.parser.ParsingParameters;
import java.util.List;

public class SpeakersCreator implements ApplianceCreator {
    @Override
    public Appliance create(String s) {
        List<String> list;
        list= ParsingParameters.getParams(s);
        Speakers speakers=new Speakers(Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1)), list.get(2), Integer.parseInt(list.get(3)));
        return speakers;
    }
}
