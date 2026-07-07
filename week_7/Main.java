public class Main {

    public static void main(String[] args) {

        Appliance wm = new WashingMachine("LG");
        wm.displayBrand();
        wm.turnOn();
        wm.operate();
        wm.turnOff();

        System.out.println();

        Appliance fridge = new Refrigerator("Panasonic");
        fridge.displayBrand();
        fridge.turnOn();
        fridge.operate();
        fridge.turnOff();
    }
}
