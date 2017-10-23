package by.tc.task01.constant;

import by.tc.task01.dao.factory.*;
import by.tc.task01.entity.*;

import java.util.HashMap;
import java.util.Map;

public final class Constant {
    public final static String PATH = "src/main/resources/appliances_db.txt";
    public final static Map<String, ApplianceCreator> APPLIANCE_CREATOR = new HashMap<>();

    static {
        APPLIANCE_CREATOR.put(Oven.class.getSimpleName(), new OvenCreator());
        APPLIANCE_CREATOR.put(Laptop.class.getSimpleName(), new LaptopCreator());
        APPLIANCE_CREATOR.put(Refrigerator.class.getSimpleName(), new RefrigeratorCreator());
        APPLIANCE_CREATOR.put(Speakers.class.getSimpleName(), new SpeakersCreator());
        APPLIANCE_CREATOR.put(TabletPC.class.getSimpleName(), new TabletPCCreator());
        APPLIANCE_CREATOR.put(VacuumCleaner.class.getSimpleName(), new VacuumCleanerCreator());
    }
}
