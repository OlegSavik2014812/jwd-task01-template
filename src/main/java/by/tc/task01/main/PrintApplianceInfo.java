package by.tc.task01.main;

import by.tc.task01.constant.ConstantForProject;
import by.tc.task01.entity.Appliance;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PrintApplianceInfo {

    public static void print(Appliance appliance) {
        // you may add your own code here
        System.out.println(appliance.toString());
        writeApplianceToFile(appliance);
    }

    // you may add your own code here
    private static void writeApplianceToFile(Appliance appliance) {

        try {
            FileWriter fileWriter=new FileWriter(ConstantForProject.PATH_OF_OUTPUT_FILE,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String infoAboutAppliance = appliance.toString();
            bufferedWriter.write(infoAboutAppliance);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
