package exercises.technology;

public class SmartPhone extends Computer{
    private String provider;

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public SmartPhone(String name, double screenSize, double memory, String provider) {
        super(name, screenSize, memory);
        this.provider = provider;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "provider='" + provider + '\'' +
                ", screenSize=" + screenSize +
                ", memory=" + memory +
                ", numApps=" + numApps +
                ", memoryUsed=" + memoryUsed +
                ", name='" + name + '\'' +
                '}';
    }

    public String makeCall(String contact) {
        return "Calling" + contact;
    }
}
