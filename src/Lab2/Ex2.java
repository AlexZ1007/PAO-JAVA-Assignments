package Lab2;


import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int arr1[] = {1,7,4,3,9,1}, arr2[] = {6,4,2,8};
        sort(arr1);
        sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.toString(zip(arr1, arr2)));
    }

    private static void sort(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
    }

    private static int[] zip(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int pArr1 = 0, pArr2 = 0, pArr3 = 0;
        while (pArr1 < arr1.length && pArr2 < arr2.length) {
            if(arr1[pArr1] < arr2[pArr2]) {
                arr3[pArr3] = arr1[pArr1];
                pArr1++;
            } else {
                arr3[pArr3] = arr2[pArr2];
                pArr2++;
            }

            pArr3++;
        }

        if(pArr2 < arr2.length) {
            while(pArr2 < arr2.length) {
                arr3[pArr3] = arr2[pArr2];
                pArr2++;
            }
        } else if(pArr1 < arr1.length) {
            while(pArr1 < arr1.length) {
                arr3[pArr3] = arr1[pArr1];
                pArr1++;
            }
        }
        return arr3;

    }
}
