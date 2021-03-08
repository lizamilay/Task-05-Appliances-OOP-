package bean;

import java.io.Serializable;

public class Oven extends  HouseholdAppliance implements Serializable {
    private static final long serialVersionUID = 18L;

    private int weight;
    private int capacity;
    private int depth;
    private double height;
    private double width;

    public Oven() {
        super();

    }
    public Oven(int powerConsumption) {
        super(powerConsumption);

    }
    public Oven(int weight, int capacity, int depth, double height, double width) {
        super();
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public Oven(int powerConsumption, int weight, int capacity, int depth, double height, double width) {
        super(powerConsumption);
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public int getDepth() {
        return depth;
    }
    public void setDepth(int depth) {
        this.depth = depth;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + capacity;
        result = prime * result + depth;
        result = prime * result + (int) height ;
        result = prime * result + weight;
        result = prime * result + (int) width;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Oven other = (Oven) obj;
        if (capacity != other.capacity)
            return false;
        if (depth != other.depth)
            return false;
        if (height !=other.height)
            return false;
        if (weight != other.weight)
            return false;
        if (width != other.width)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Oven [weight =" + weight + ", capacity =" + capacity + ", depth =" + depth + ", height =" + height
                + ", width =" + width + "powerConsumption =" + getPowerConsumption() + "]";
    }
}
