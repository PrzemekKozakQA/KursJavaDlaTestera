public class MainApp {

    public static void main(String[] args) {
        //swap the first and last element of the array and print the array
        int[] numbers = {1, 2, 3, 4, 5};

        //1st answer
        int temp = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = temp;
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        //new line to better see different answers
        System.out.println("");

        // 2nd answer
        numbers[0] += numbers[numbers.length - 1];
        numbers[numbers.length - 1] = numbers[0] - numbers[numbers.length - 1];
        numbers[0] -= numbers[numbers.length - 1];
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        //new line to better see different tasks
        System.out.println("");

        //count how many even and odd numbers are in the array and print answer

        int[] numbersOddOrEven = {2, 2, 3, 4, 5, 7, 7, 7, 8, 8, 2};

        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbersOddOrEven) {
            if (number % 2 == 0) {
                evenCount++;
            } else oddCount++;
        }

        System.out.println("the number of even numbers is " + evenCount + " and the odd numbers are " + oddCount);

        //new line to better see different tasks
        System.out.println("");

        //sort the numbers in the array from lowest to highest and print the array
        int[] numbersUnsorted = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};

        for (int i = 0; i < numbersUnsorted.length; i++) {
            int min = numbersUnsorted[i];
            for (int j = i + 1; j < numbersUnsorted.length; j++) {
                if (min > numbersUnsorted[j]) {
                    numbersUnsorted[i] = numbersUnsorted[j];
                    numbersUnsorted[j] = min;
                    min = numbersUnsorted[i];
                }
            }
        }
        for (int number : numbersUnsorted) {
            System.out.print(number + " ");
        }

        //new line to better see different tasks
        System.out.println("");

        //sort the numbers in the array from highest to lowest and print the array
        int[] anotherNumbersUnsorted = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};

        for (int i = 0; i < anotherNumbersUnsorted.length; i++) {
            int max = anotherNumbersUnsorted[i];
            for (int j = i + 1; j < anotherNumbersUnsorted.length; j++) {
                if (max < anotherNumbersUnsorted[j]) {
                    anotherNumbersUnsorted[i] = anotherNumbersUnsorted[j];
                    anotherNumbersUnsorted[j] = max;
                    max = anotherNumbersUnsorted[i];
                }
            }
        }
        for (int number : anotherNumbersUnsorted) {
            System.out.print(number + " ");
        }
    }


}
