public class MainApp {

    public static void main(String[] args) {
        Bug firstBug = new Bug("Błąd testowy", "autor@bug.com", 1);

        firstBug.showAllBugInfo();

        firstBug.showBugReportAuthorEmail();

        firstBug.showBugStatus();

        firstBug.bugPriority = firstBug.getBugPriority() + 4;
        firstBug.bugStatusIsOpen = !firstBug.bugStatusIsOpen;

        firstBug.showAllBugInfo();
    }

}
