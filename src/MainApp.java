import enums.Gender;
import model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Adam", "NowaK", "jn@test.pl", 18, Gender.MALE));
        users.add(new User("Katarzyna", "Nowak", "kn@test.pl", 19, Gender.FEMALE));
        users.add(new User("Anna", "Kowalska", "ak@test.pl", 21, Gender.FEMALE));
        users.add(new User("Tomasz", "Kowalski", "ak@test.pl", 22, Gender.MALE));
        users.add(new User("Jakub", "Nowakowski", "jn@test.pl", 30, Gender.MALE));
        users.add(new User("Urszula", "Nowakowska", "un@test.pl", 30, Gender.FEMALE));

        users.stream()
                .filter(usr -> usr.getGender().equals(Gender.FEMALE))
                .forEach(System.out::println);


        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("names.txt")));
            bufferedWriter.write("Kasia");
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> namesFromFile = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("names.txt"));

            String line = bufferedReader.readLine();

            while (line != null) {
                namesFromFile.add(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String firstNameFromList = namesFromFile.stream()
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("List of names from file is empty"));
        System.out.println(firstNameFromList);
    }

}
