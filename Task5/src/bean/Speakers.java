package bean;

import java.io.Serializable;
import java.util.Arrays;

public class Speakers extends Appliance implements Serializable {
    private static final long serialVersionUID = 1L;

    private int powerConsumption;
    private int numberOfSpeakers;
    private double[] frequencyRange;
    private int cordLength;

    public Speakers() {
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public double[] getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(double[] frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    public Speakers(int powerConsumption, int numberOfSpeakers, double[] frequencyRange, int cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(frequencyRange);
        result = prime * result + numberOfSpeakers;
        result = prime * result + powerConsumption;
        result = prime * result + cordLength;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Speakers other = (Speakers) obj;
        if (!Arrays.equals(frequencyRange, other.frequencyRange))
            return false;
        if (numberOfSpeakers != other.numberOfSpeakers)
            return false;
        if (powerConsumption != other.powerConsumption)
            return false;
        if (cordLength != other.cordLength)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Speakers [powerConsumption =" + powerConsumption + ", numberOfSpeakers =" + numberOfSpeakers
                + ", frequencyRange =" + Arrays.toString(frequencyRange) + "cordLength =" + cordLength + "]";
    }
}
