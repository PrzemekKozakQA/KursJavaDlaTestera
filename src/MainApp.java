import model.Bug;

public class MainApp {

    public static void main(String[] args) {
        Bug bug = new Bug("test", "test@test.pl", 1);

        bug.setBugAuthorEmail("test@test");
        bug.setBugAuthorEmail("testtest.pl");
        bug.setBugAuthorEmail("testtestpl");
        bug.setBugAuthorEmail("nowy@test.pl");
        System.out.println("Email autora zgłoszenia: " + bug.getBugAuthorEmail());

        bug.setBugDescription("123456789");
        bug.setBugDescription("            ");
        bug.setBugDescription(" ");
        bug.setBugDescription("");
        bug.setBugDescription("To jest nowy opis błędu");

        System.out.println("Opis błędu: " + bug.getBugDescription());


    }

}
