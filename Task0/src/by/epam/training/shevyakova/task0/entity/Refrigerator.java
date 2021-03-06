package by.epam.training.shevyakova.task0.entity;

public class Refrigerator implements Appliance {
    private int powerConsumption;
    private int weight;
    private int freezerCapacity;
    private int overallCapacity;
    private int height;
    private int width;

    public Refrigerator() {
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public void setOverallCapacity(int overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Refrigerator that = (Refrigerator) o;

        if (powerConsumption != that.powerConsumption) return false;
        if (weight != that.weight) return false;
        if (freezerCapacity != that.freezerCapacity) return false;
        if (overallCapacity != that.overallCapacity) return false;
        if (height != that.height) return false;
        return width == that.width;
    }

    @Override
    public int hashCode() {
        int result = powerConsumption;
        result = 31 * result + weight;
        result = 31 * result + freezerCapacity;
        result = 31 * result + overallCapacity;
        result = 31 * result + height;
        result = 31 * result + width;
        return result;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
