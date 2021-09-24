import model.computer.Computer;
import model.computer.Laptop;
import model.computer.PC;

public class MainApp {

    public static void main(String[] args) {

        Computer officeComputer = new PC("Office computer 1", "HP", 500, 128);

        System.out.println(officeComputer.volumeUp());
        System.out.println(officeComputer.volumeUp(100));

        System.out.println(officeComputer.volumeDown(50));
        System.out.println(officeComputer.volumeDown());
        System.out.println(officeComputer.volumeDown(50));

        Computer gamingLaptop = new Laptop("Gaming laptop 1", "HP", 500, 128, 50);

        System.out.println(gamingLaptop.volumeUp());
        System.out.println(gamingLaptop.volumeUp(100));

        System.out.println(gamingLaptop.volumeDown(50));
        System.out.println(gamingLaptop.volumeDown());
        System.out.println(gamingLaptop.volumeDown(50));
    }

}
