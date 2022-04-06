import java.util.Scanner;

public class ReverseArray {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers(int count) {
        int[] array = new int[count];

        for(int i = 0; i < count; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int half = array.length / 2;
        int temp;

        for(int i = 0; i < half; i++) {  // when array length is odd the very middle element will not be swapped
            temp = array[maxIndex - i];
            array[maxIndex - i] = array[i];
            array[i] = temp;
        }
    }

    public static void printArrays(int[] array) {
        System.out.println("This is the original array entered: ");

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\n***********************\n");

        reverse(array);

        System.out.println("This is the reversed array:");

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static void main(String[] args) {
        printArrays(readIntegers(8));
    }
}
