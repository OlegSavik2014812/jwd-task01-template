package by.tc.task01.entity;

import java.util.ArrayList;
import java.util.List;

public class Appliance {
    // you may add your own code here
    public Appliance createApp(String s) {
        String[] strings = s.split(" ");
        List<String> list = getParams(s);
        if (strings[0].equals("Oven")) {
            return new Oven(Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1)), Integer.parseInt(list.get(2)), Integer.parseInt(list.get(3)), Double.parseDouble(list.get(4)), Double.parseDouble(list.get(5)));
        }
        if (strings[0].equals("Laptop")) {
            return new Laptop(Double.parseDouble(list.get(0)), list.get(1), Integer.parseInt(list.get(2)), Integer.parseInt(list.get(3)), Double.parseDouble(list.get(4)), Integer.parseInt(list.get(5)));

        }
        if (strings[0].equals("Refrigerator")) {

            return new Refrigerator(Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1)), Integer.parseInt(list.get(2)), Double.parseDouble(list.get(3)), Integer.parseInt(list.get(4)), Integer.parseInt(list.get(5)));
        }
        if (strings[0].equals("Speakers")) {

            return new Speakers(Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1)), list.get(2), Integer.parseInt(list.get(3)));
        }
        if (strings[0].equals("TabletPC")) {

            return new TabletPC(Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1)), Integer.parseInt(list.get(2)), Integer.parseInt(list.get(3)), list.get(4));
        }
        if (strings[0].equals("VacuumCleaner")) {

            return new VacuumCleaner(Integer.parseInt(list.get(0)), list.get(1), list.get(2), list.get(3), Integer.parseInt(list.get(4)), Integer.parseInt(list.get(5)));
        }
        return null;
    }

    private List<String> getParams(String s) {
        String[] strings = s.split(" ");
        List<String> list = new ArrayList<>();
        int i = 2;
        do {
            list.add(strings[i]);
            i = i + 2;
        } while (i < strings.length);
        return list;
    }

    @Override
    public String toString() {
        return "Appliance{}";
    }
}
