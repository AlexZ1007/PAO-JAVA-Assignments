package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Enter number [0,5]: ");
        int n;
        do {
            n = sc.nextInt();
        } while (n < 0 || n > 5);

        int[] arr =  new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        printReverseArray(arr);
    }

    private static void printReverseArray(int[] arr){
        int [] arrCopy = Arrays.copyOf(arr, arr.length);
        int revIndex = 0;
        for (int i = arrCopy.length - 1; i >= 0; i--) {
            arr[revIndex] = arrCopy[i];
            revIndex++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
