package exercises.technology;

public class Laptop extends Computer {
    public double batteryLife = 100;

    public Laptop(String name, double screenSize, double memory, double batteryLife) {
        super(name, screenSize, memory);
        this.batteryLife = batteryLife;
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "Name=" + super.name +
                "Screen Size=" + super.screenSize +
                ", Memory=" + super.memory +
                ", Number of Apps=" + super.numApps +
                ", Memory Used=" + super.memoryUsed +
                "batteryLife=" + batteryLife +
                '}';
    }

    public double checkBattery(double time) {
        double batteryUsed = (time/8)*100;
        batteryLife = batteryLife - batteryUsed;
        return batteryLife;
    }
}
