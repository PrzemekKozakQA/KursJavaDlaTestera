public class MainApp {

    public static void main(String[] args) {

        //1. Utwórz 4 zmienne typu int i przypisz im dowolne wartości.
        //2. Sprawdź, czy suma dwóch pierwszych liczb jest parzysta.
        //3. Sprawdź, czy suma dwóch pozostałych liczb jest parzysta.
        //34. Jeżeli dwie sumy są parzyste, to wyświetl informację, że wszystkie sumy są parzyste.

        int number1 = 11;
        int number2 = 55;
        int number3 = 342;
        int number4 = 768;

        int sum1 = number1 + number2;
        int sum2 = number3 + number4;

        if (sum1 % 2 == 0) {
            System.out.println("Suma dwóch pierwszych liczb jest parzysta");
        } else {
            System.out.println("Suma dwóch pierwszych liczb nie jest parzysta");
        }

        if (sum2 % 2 == 0) {
            System.out.println("Suma pozostałych  liczb jest parzysta");
        } else {
            System.out.println("Suma pozostałych liczb nie jest parzysta");
        }

        if ((sum1 % 2 == 0) && (sum2 % 2 == 0)) {
            System.out.println("Wszystkie sumy są parzyste");
        }
    }

}
