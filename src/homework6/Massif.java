package homework6;

import java.util.Arrays;

public class Massif {
    public static int minSubValue(int[] arr) {
        int arrayLength = arr.length;
        int tempLength = arrayLength * (arrayLength - 1) / 2;
        int[] tempArray = new int[tempLength];
        int k = 0;

        for (int i = 0; i < arrayLength; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                tempArray[k + j - 1] = Math.abs(arr[i] - arr[j]);
            }
            k += arrayLength - (i + 2);
        }
        Arrays.sort(tempArray);
        System.out.println(tempArray[0]);
        return tempArray[0];
    }

    public static void main(String[] args) {
        int[] array = {5, 11, 7, 20};
        minSubValue(array);
    }
}
