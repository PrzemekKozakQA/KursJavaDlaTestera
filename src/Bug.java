public class Bug {

    String bugDescription;
    String bugAuthorEmail;
    int bugPriority;
    boolean bugStatusIsOpen;

    Bug(String bugDescription, String bugAuthorEmail, int bugPriority) {
        this.bugDescription = bugDescription;
        this.bugAuthorEmail = bugAuthorEmail;
        this.bugPriority = bugPriority;
        this.bugStatusIsOpen = true;
    }

    void showAllBugInfo() {
        System.out.println("Opis błędu: " + bugDescription + " Email osoby zgłaszającej: " + bugAuthorEmail +
                " Priorytet błędu : " + bugPriority + " Status błędu: " + getBugStatusInString());
    }

    void showBugReportAuthorEmail() {
        System.out.println("Email osoby zgłaszającej: " + bugAuthorEmail);
    }

    String getBugStatusInString() {
        if (bugStatusIsOpen) {
            return "Otwarty";
        } else {
            return "Zamknięty";
        }
    }

    void showBugStatus() {
        System.out.println("Status błędu: " + getBugStatusInString());
    }

    int getBugPriority() {
        return bugPriority;
    }
}

//POLECENIE: Stwórz klasę Bug z następującymi cechami

//Pola obiektu:
//-opis błędu
//-adres email osoby zgłaszającej błąd
//-priorytet błędu 1-5
//-status błędu (otwarty/zamknięty) - domyślnie, podczas tworzenia zawsze otwarty

//Konstruktor

//Metody:
//-pokaż wszystkie informacje na temat błędu
//-pokaż osobę zgłaszającą błąd
//-pokaż status błędu
//-zwróć priorytet błędu