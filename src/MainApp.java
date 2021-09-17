public class MainApp {

    public static void main(String[] args) {

//        //TYPY DANYCH
//
//        //liczby całkowite
//        byte b;
//        short s;
//        int i;
//        long l;
//
//        int number; //deklaracja zmiennej
//        number = 10; // inicjalizacja zmiennej
//        System.out.println(number);
//
//        //liczby zmiennoprzecinkowe
//        float f;
//        double d;
//
//        double doubleNumber = 10.5; // deklaracja i inicjalizacja zmiennej jednocześnie
//        System.out.println(10.5);
//
//        //tekst
//        String someText = "text in java";
//        System.out.println(someText);
//
//        //znak
//        char someChar = 's';
//        System.out.println(someChar);
//
//        //prawda
//        Boolean trueValue = true;
//        System.out.println(trueValue);
//
//        //fałsz
//        Boolean falseValue = false;
//        System.out.println(falseValue);

        //KLASY I OBIEKTY

        // Typ nazwa = nowy obiekt;

        User bartek = new User("Bartek", "Testowy", "bartek@test.pl", 17);

        bartek.getAllInfo();

        User tomek = new User("Tomek", "Brown", "tomek@brown.pl", 30);

        tomek.getAllInfo();
    }

}
