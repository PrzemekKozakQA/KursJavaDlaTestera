import model.Bug;
import model.BugReporter;
import model.User;
import model.computer.*;

import java.util.*;
import java.util.stream.Collectors;

public class MainApp {

    public static void main(String[] args) {

        Map<Integer, String> names = new HashMap<>();
        names.put(1, "kowalski1");
        names.put(10, "kowalski2");
        names.put(2, "kowalski3");
        names.put(5, "kowalski4");

        for (Map.Entry<Integer, String> myEntry: names.entrySet()) {
            System.out.println(myEntry.getKey()+" "+ myEntry.getValue());
        }
    }

}
