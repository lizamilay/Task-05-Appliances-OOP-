package bean;

import java.io.Serializable;

public class HouseholdAppliance extends Appliance implements Serializable {
    private static final long serialVersionUID = 18L;

    private int powerConsumption;

    public HouseholdAppliance(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public HouseholdAppliance() {
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + powerConsumption;
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
        HouseholdAppliance other = (HouseholdAppliance) obj;
        if (powerConsumption != other.powerConsumption)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "HouseholdAppliance [powerConsumption=" + powerConsumption + "]";

    }
}
