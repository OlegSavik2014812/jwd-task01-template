package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Appliance appliance;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        /*Criteria<Oven> criteriaOven = new Criteria<Oven>();
        criteriaOven.setApplianceType("Oven");
        criteriaOven.add(Oven.CAPACITY, 32);
        appliance = service.find(criteriaOven);*/

/*        if (appliance.getClass() == by.tc.task01.entity.Oven.class) {
        }
        by.tc.task01.entity.Oven oven = (by.tc.task01.entity.Oven) appliance;*/
        //if(oven.getCapacity() == 3) {}

        /*PrintApplianceInfo.print(appliance);*/

        Criteria<Oven> criteriaOven = new Criteria<>();
        criteriaOven.setApplianceType("Oven");
        criteriaOven.add(Oven.HEIGHT, 45.5);
        criteriaOven.add(Oven.DEPTH, 60);
        appliance = service.find(criteriaOven);
        PrintApplianceInfo.print(appliance);
        //////////////////////////////////////////////////////////////////

        Criteria<Laptop> criteriaLaptop = new Criteria<>();
        criteriaLaptop.setApplianceType("Laptop");
        criteriaLaptop.add(Laptop.MEMORY_ROM, 8000);
        appliance = service.find(criteriaLaptop);
        PrintApplianceInfo.print(appliance);


        //////////////////////////////////////////////////////////////////

        Criteria<TabletPC> criteriaTabletPC = new Criteria<>();
        criteriaTabletPC.setApplianceType("TabletPC");
        criteriaTabletPC.add(TabletPC.COLOR, "blue");
        criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);
        criteriaTabletPC.add(TabletPC.MEMORY_ROM, 8000);
        appliance = service.find(criteriaTabletPC);
        PrintApplianceInfo.print(appliance);
    }

}
