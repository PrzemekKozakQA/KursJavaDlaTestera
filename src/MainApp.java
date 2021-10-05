import model.computer.*;

import java.util.*;
import java.util.stream.Collectors;

public class MainApp {

    public static void main(String[] args) {

        List<Computer> computers = new ArrayList<>();
        computers.add(new Laptop("MB PRO 1", "PRO 2", new Hdd("HP", 500), new Ram("HP", 128), 100));
        computers.add(new Laptop("MB PRO 1", "PRO 1", new Hdd("HP", 500), new Ram("HP", 128), 100));
        computers.add(new Laptop("MB PRO 3", "PRO 3", new Hdd("HP", 256), new Ram("HP", 128), 100));
        computers.add(new Laptop("MB PRO 4", "PRO 4", new Hdd("HP", 500), new Ram("HP", 128), 100));
        computers.add(new PC("PC 1", "BBB", new Hdd("HP", 500), new Ram("HP", 128)));
        computers.add(new PC("PC 1", "AAA", new Hdd("HP", 256), new Ram("HP", 256)));
        computers.add(new PC("PC 3", "PRO 3", new Hdd("HP", 500), new Ram("HP", 128)));

        //1.Count all computers with more than 128 GB of RAM
        long numberOfBigRamComputers = computers.stream()
                .filter(com -> com.getRam().getSize() > 128)
                .count();
        System.out.println("Number of computers with more that 128GB RAM: " + numberOfBigRamComputers);

        //2. Display all types of computers on the console
        System.out.println("\nTypes of computer:");
        computers.stream()
                .map(Computer::getType)
                .forEach(type -> System.out.println("Computer type: " + type));

        //3. Display the computer that has the most RAM
        System.out.println("\nComputer with largest RAM memory is: ");
        computers.stream()
                .max(Comparator.comparingInt(com -> com.getRam().getSize()))
                .stream().findFirst()
                .ifPresent(System.out::println);


        //4. Create a new collection with computers that have a hard drive smaller than 500 GB

        List<Computer> smallHddComputers = computers.stream()
                .filter(com -> com.getHdd().getSize() < 500)
                .collect(Collectors.toList());

        System.out.println("\nList of computers with hard drive smaller than 500 GB");
        for (Computer computer : smallHddComputers) {
            System.out.println(computer);
        }

        //5.Sort computers by name and type
        System.out.println("\nList of computers sorted by name and type");
        computers.stream()
                .sorted(Comparator.comparing(Computer::getName).thenComparing(Computer::getType))
                .forEach(System.out::println);

        //6. Practice Optional

        Optional<Computer> firstComp = computers.stream()
                .max(Comparator.comparing(Computer::getName));
        if (firstComp.isPresent()) {
            System.out.println(firstComp.get());
        }

        String pcName = computers.stream()
                .map(Computer::getName)
                .filter(str -> str.contains("PC"))
                .findFirst()
                .orElse("Default name");
        System.out.println("\nOne of PC name is: " + pcName);

        computers.stream()
                .map(Computer::getType)
                .filter(str -> str.contains("PRO"))
                .findFirst()
                .ifPresentOrElse(str -> System.out.println("\nOne of PRO type is: " + str), () -> System.out.println("No type PRO available"));

    }

}
