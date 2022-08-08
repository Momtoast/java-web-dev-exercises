package exercises.technology;

public class Program {
    public static void main(String args[]) {
        Computer desktop = new Computer("Office 1", 21, 32);
        Laptop lenovo = new Laptop("Mel's", 15, 8,100);
        SmartPhone galaxy = new SmartPhone("Mom's", 4, 4, "Verizon");

        System.out.println(desktop.toString());
        System.out.println(lenovo.toString());
        System.out.println(galaxy.toString());

        System.out.println(desktop.addApp(5));
        System.out.println(lenovo.checkBattery(3));
        System.out.println(galaxy.addApp(1));
        System.out.println(galaxy.makeCall("Mom"));

    }
}
