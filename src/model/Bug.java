package model;

import exceptions.IllegalBugPriorityException;

import java.util.Objects;

public class Bug implements ConsoleNotification, Comparable<Bug> {

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

    public void setBugPriority(int bugPriority) throws IllegalBugPriorityException {
        switch (bugPriority) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.bugPriority = bugPriority;
                break;
            default: {
                throw new IllegalBugPriorityException("Wrong bug priority. Please enter 1 to 5.");
            }
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
    public int compareTo(Bug bug) {
        int compareResult = this.bugDescription.compareTo(bug.bugDescription);
        return compareResult;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bug bug = (Bug) o;
        return bugPriority == bug.bugPriority && bugStatusIsOpen == bug.bugStatusIsOpen && Objects.equals(bugDescription, bug.bugDescription) && Objects.equals(bugReporter, bug.bugReporter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bugDescription, bugReporter, bugPriority, bugStatusIsOpen);
    }
}