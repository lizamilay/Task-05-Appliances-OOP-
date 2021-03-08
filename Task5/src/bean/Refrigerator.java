package bean;

import java.io.Serializable;

public class Refrigerator extends HouseholdAppliance implements Serializable {
    private static final long serialVersionUID = 18L;

    private int weight;
    private int freezerCapacity;
    private double overallCapacity;
    private int height;
    private int width;

    public Refrigerator() {
        super();

    }

    public Refrigerator(int powerConsumption) {
        super(powerConsumption);

    }

    public Refrigerator(int weight, int freezerCapacity, double overallCapacity, int height, int width) {
        super();
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    public Refrigerator(int powerConsumption, int weight, int freezerCapacity, double overallCapacity, int height, int width) {
        super(powerConsumption);
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }


    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }


    public int getFreezerCapacity() {
        return freezerCapacity;
    }
    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }


    public double getOverallCapacity() {
        return overallCapacity;
    }
    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }


    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }


    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }




    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + freezerCapacity;
        result = prime * result + height;
        result = prime * result + (int) overallCapacity;
        result = prime * result + weight;
        result = prime * result + width;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Refrigerator other = (Refrigerator) obj;
        if (freezerCapacity != other.freezerCapacity)
            return false;
        if (height != other.height)
            return false;
        if (overallCapacity != other.overallCapacity)
            return false;
        if (weight != other.weight)
            return false;
        if (width != other.width)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Refrigerator [weight =" + weight + ", freezerCapacity =" + freezerCapacity + ", overallCapacity ="
                + overallCapacity + ", height =" + height + ", width =" + width + "]";
    }


}
