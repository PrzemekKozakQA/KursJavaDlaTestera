public class MainApp {

    public static void main(String[] args) {
        Bug firstBug = new Bug("Błąd testowy", "autor@bug.com", 2);

        firstBug.showAllBugInfo();

        firstBug.showBugReportAuthorEmail();

        firstBug.showBugStatus();

        firstBug.bugPriority = firstBug.getBugPriority() + 1;
        firstBug.bugStatus = true;

        firstBug.showAllBugInfo();
    }

}
