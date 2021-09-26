package model;

import java.util.Objects;

public class Bug implements ConsoleNotification {

    private String bugDescription;
    private BugReporter bugReporter;
    private int bugPriority;
    private boolean bugStatusIsOpen;

    public Bug(String bugDescription, BugReporter bugReporter, int bugPriority) {
        this.bugDescription = bugDescription;
        this.bugReporter = bugReporter;
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

    public BugReporter getBugReporter() {
        return bugReporter;
    }

    public void setBugReporter(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
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
        notifyStatusChange();
    }

    public void showAllBugInfo() {
        System.out.println("Opis błędu: " + bugDescription + "\nImię i nazwisko osoby zgłaszającej: "
                + bugReporter.getFirstName() + " " + bugReporter.getLastName() + "\nEmail osoby zgłaszającej: "
                + bugReporter.getEmail() + "\nPriorytet błędu : " + bugPriority + " Status błędu: " + getBugStatusInString());
    }

    public void showBugReporterEmail() {
        System.out.println("Email osoby zgłaszającej: " + bugReporter.getEmail());
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


    @Override
    public void notifyStatusChange() {
        System.out.println("Status błędu zmienił się na: " + getBugStatusInString());
    }

    @Override
    public String toString() {
        return "Bug{" +
                "bugDescription='" + bugDescription + '\'' +
                ", bugReporter=" + bugReporter +
                ", bugPriority=" + bugPriority +
                ", bugStatusIsOpen=" + bugStatusIsOpen +
                '}';
    }
}