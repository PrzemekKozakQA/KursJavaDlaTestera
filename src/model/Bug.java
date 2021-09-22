package model;

public class Bug {

    private String bugDescription;
    private String bugAuthorEmail;
    private int bugPriority;
    private boolean bugStatusIsOpen;

    public Bug(String bugDescription, String bugAuthorEmail, int bugPriority) {
        this.bugDescription = bugDescription;
        this.bugAuthorEmail = bugAuthorEmail;
        this.bugPriority = bugPriority;
        this.bugStatusIsOpen = true;
    }

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() < 10 || bugDescription.isBlank()) {
            System.out.println("The description must be at least 10 characters long, only spaces are not allowed");
        } else {
            this.bugDescription = bugDescription;
        }
    }

    public String getBugAuthorEmail() {
        return bugAuthorEmail;
    }

    public void setBugAuthorEmail(String bugAuthorEmail) {
        if (bugAuthorEmail.contains("@") && bugAuthorEmail.contains(".")) {
            this.bugAuthorEmail = bugAuthorEmail;
        } else {
            System.out.println("Invalid e-mail address - does not include \"@\" or \".\"");
        }
    }

    public int getBugPriority() {
        return bugPriority;
    }

    public void setBugPriority(int bugPriority) {
        if (bugPriority >= 1 && bugPriority <= 5) {
            this.bugPriority = bugPriority;
        } else {
            System.out.println("Bug priority must be between 1 and 5");
        }
    }

    public boolean getBugStatusIsOpen() {
        return bugStatusIsOpen;
    }

    public void setBugStatusIsOpen(Boolean bugStatusIsOpen) {
        this.bugStatusIsOpen = bugStatusIsOpen;
    }

    public void showAllBugInfo() {
        System.out.println("Opis błędu: " + bugDescription + " Email osoby zgłaszającej: " + bugAuthorEmail +
                " Priorytet błędu : " + bugPriority + " Status błędu: " + getBugStatusInString());
    }

    public void showBugReportAuthorEmail() {
        System.out.println("Email osoby zgłaszającej: " + bugAuthorEmail);
    }

    public String getBugStatusInString() {
        if (bugStatusIsOpen) {
            return "Otwarty";
        } else {
            return "Zamknięty";
        }
    }

    public void showBugStatus() {
        System.out.println("Status błędu: " + getBugStatusInString());
    }

}