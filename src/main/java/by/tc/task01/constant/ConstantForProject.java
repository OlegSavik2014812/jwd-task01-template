package by.tc.task01.constant;

import by.tc.task01.dao.factory.*;
import by.tc.task01.dao.factory.impl.*;
import by.tc.task01.entity.*;

import java.util.HashMap;
import java.util.Map;

public final class ConstantForProject {
    public final static String PATH_OF_INPUT_FILE = "src/main/resources/appliances_db.txt";
    public final static String PATH_OF_OUTPUT_FILE = "src/main/resources/appliances_db_out.txt";
    public final static Map<String, ApplianceCreator> APPLIANCE_CREATOR_MAP = new HashMap<>();

    static {
        APPLIANCE_CREATOR_MAP.put(Oven.class.getSimpleName(), new OvenCreator());
        APPLIANCE_CREATOR_MAP.put(Laptop.class.getSimpleName(), new LaptopCreator());
        APPLIANCE_CREATOR_MAP.put(Refrigerator.class.getSimpleName(), new RefrigeratorCreator());
        APPLIANCE_CREATOR_MAP.put(Speakers.class.getSimpleName(), new SpeakersCreator());
        APPLIANCE_CREATOR_MAP.put(TabletPC.class.getSimpleName(), new TabletPCCreator());
        APPLIANCE_CREATOR_MAP.put(VacuumCleaner.class.getSimpleName(), new VacuumCleanerCreator());
    }
}
