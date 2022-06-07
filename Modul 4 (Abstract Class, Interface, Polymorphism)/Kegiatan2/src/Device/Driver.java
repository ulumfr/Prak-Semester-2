package Kegiatan2.src.Device;

public class Driver {
    public static void main(String[] args) {
        Laptop s = new Laptop("Asus Vivobook Ultra 14 M413DA","AMD Ryzen 7 3700U Mobile Processor");
        Specs Specs = new Specs("AMD Ryzen 7 3700U Mobile Processor","Windows 11 Home","Memory 8GB", s);

        System.out.println("\nLaptop Specifications\n");
        System.out.println("Laptop " + Specs.getLaptop().getName());
        System.out.println("Specs 1 : " + Specs.getSpecs1().getSpecss1());
        System.out.println("Specs 2 : " + Specs.getSpecs2());
        System.out.println("Specs 3 : " + Specs.getSpecs3());
    }
}