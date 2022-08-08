package exercises.technology;

import java.util.Objects;

public class Computer {
    public double screenSize;
    public double memory;
    public int numApps = 0;
    public double memoryUsed = 0;
    public String name;

    public Computer(String name, double screenSize, double memory) {
        super();
        this.name = name;
        this.screenSize = screenSize;
        this.memory = memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public double getMemory() {
        return memory;
    }

    public int getNumApps() {
        return numApps;
    }

    public double getMemoryUsed() {
        return memoryUsed;
    }

    public String getName() {
        return name;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return getName().equals(computer.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "Name=" + name +
                "Screen Size=" + screenSize +
                ", Memory=" + memory +
                ", Number of Apps=" + numApps +
                ", Memory Used=" + memoryUsed +
                '}';
    }

    public String addApp(double size) {
        if (memory - memoryUsed < size) {
            return "Not enough memory";
        } else {
            memoryUsed = memoryUsed + size;
            numApps = numApps + 1;
            return "App added";
        }
    }

    public String deleteApp(double size) {
        memoryUsed = memoryUsed - size;
        numApps = numApps - 1;
        return "App deleted";
    }
}
