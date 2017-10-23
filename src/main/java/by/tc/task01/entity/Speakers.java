package by.tc.task01.entity;

public class Speakers extends Appliance {
    // you may add your own code here
    private int powerConsumption;
    private int numberOfSpeakers;
    private String frequencyRange;
    private int cordLenght;

    public Speakers(int powerConsumption, int numberOfSpeakers, String frequencyRange, int cordLenght) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLenght = cordLenght;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public int getCordLenght() {
        return cordLenght;
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", cordLenght=" + cordLenght +
                '}';
    }
}
