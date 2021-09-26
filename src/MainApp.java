import model.Bug;
import model.BugReporter;
import model.User;
import model.computer.*;

public class MainApp {

    public static void main(String[] args) {

        Bug bug = new Bug("Testowe zgłoszenie", new BugReporter("Jan", "Nowak",
                "j@test.pl"), 1);

        System.out.println(bug.toString());

        bug.getBugReporter().setEmail("j-test-pl");

        bug.getBugReporter().setEmail("jn@test.pl");

        bug.showBugStatus();

        bug.setBugStatusIsOpen(true);

        bug.setBugStatusIsOpen(false);

        bug.showAllBugInfo();

    }

}
