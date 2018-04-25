package by.tc.task01.entity;

public class Laptop implements Appliance {
    private int batteryCapacity;
    private String os;
    private int memoryRom;
    private int systemMemory;
    private double cpu;
    private int displayInchs;

    public Laptop() {
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public void setDisplayInchs(int displayInchs) {
        this.displayInchs = displayInchs;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Laptop laptop = (Laptop) obj;

        if (batteryCapacity != laptop.batteryCapacity) return false;
        if (memoryRom != laptop.memoryRom) return false;
        if (systemMemory != laptop.systemMemory) return false;
        if (Double.compare(laptop.cpu, cpu) != 0) return false;
        if (displayInchs != laptop.displayInchs) return false;
        return os.equals(laptop.os);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = batteryCapacity;
        result = 31 * result + os.hashCode();
        result = 31 * result + memoryRom;
        result = 31 * result + systemMemory;
        temp = Double.doubleToLongBits(cpu);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + displayInchs;
        return result;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", os='" + os + '\'' +
                ", memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displayInchs=" + displayInchs +
                '}';
    }
}