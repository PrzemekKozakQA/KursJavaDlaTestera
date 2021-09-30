import model.Bug;
import model.BugReporter;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        //new Bug list
        List<Bug> bugList = new ArrayList<>();

        bugList.add(new Bug("Opis testowy błędu nr 5", new BugReporter("Jan", "Nowak", "Jn@test.pl"), 1));
        bugList.add(new Bug("Opis testowy błędu nr 5", new BugReporter("Jan", "Nowak", "Jn@test.pl"), 1));
        bugList.add(new Bug("Opis testowy błędu nr 3", new BugReporter("Jan", "Nowak", "Jn@test.pl"), 1));
        bugList.add(new Bug("Opis testowy błędu nr 2", new BugReporter("Jan", "Nowak", "Jn@test.pl"), 1));
        bugList.add(new Bug("Opis testowy błędu nr 2", new BugReporter("Jan", "Nowak", "Jn@test.pl"), 1));
        bugList.add(new Bug("Opis testowy błędu nr 1", new BugReporter("Jan", "Nowak", "Jn@test.pl"), 1));
        bugList.add(new Bug("Opis testowy błędu nr 4", new BugReporter("Jan", "Nowak", "Jn@test.pl"), 1));
        bugList.add(new Bug("Opis testowy błędu nr 1", new BugReporter("Jan", "Nowak", "Jn@test.pl"), 1));

        System.out.println("List of bugs");
        for (Bug bug : bugList) {
            System.out.println(bug);
        }

        //take unique value
        Set<Bug> bugSet = new HashSet<>(bugList);

        System.out.println("Set of unique bugs");
        for (Bug bug : bugSet) {
            System.out.println(bug);
        }

        System.out.println("Set of unique bugs sorted by description");
        Set<Bug> bugSortedSet = new TreeSet<>(bugSet);


        for (Bug bug : bugSortedSet) {
            System.out.println(bug);
        }

    }

}
