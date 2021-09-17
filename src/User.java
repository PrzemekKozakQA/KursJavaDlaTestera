public class User {
    //1. Pola obiektu
    // Opisują, z czego będzie składał się dany obiekt.
    String firstName;
    String lastName;
    String email;
    int age;
    boolean isAdult;

    //3. Konstruktor
    // Domyślny konstruktor tworzy pusty obiekt
    // Nazwa konstruktora jest taka jak nazwa klasy
    // Konstruktor piszemy wielką literą
    // Konstruktor nie ma zwracanego typu


    User(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
    }

    //2. Metody
    //Opisują co dany obiekt będzie mógł zrobić

    void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    int getUserAge() {
        return age;
    }

    boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
