import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int arrLength) {
        Scanner keyboardInput = new Scanner(System.in);
        int[] unsortedArr = new int[arrLength];

        for (int i = 0; i < unsortedArr.length; i++) {
            unsortedArr[i] = keyboardInput.nextInt();
        }
        return unsortedArr;
    }

    public static int[] sortIntegers(int[] unsortedArr) {
        boolean doSwap = true;

        while(doSwap) {
            doSwap = false;

            for (int i = 0; i < unsortedArr.length - 1; i++) {
                if (unsortedArr[i] < unsortedArr[i + 1]) {
                    int tempNumb;
                    tempNumb = unsortedArr[i];
                    unsortedArr[i] = unsortedArr[i + 1];
                    unsortedArr[i + 1] = tempNumb;

                    doSwap = true;
                }
            }
        }
        return unsortedArr;
    }

    public static void printArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}
