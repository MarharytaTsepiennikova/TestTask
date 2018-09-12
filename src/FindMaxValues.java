import java.util.Arrays;

/**
 * Реализовать приложение, которое из массива чисел найдет два максимальных.
 */

public class FindMaxValues {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,2,5,5};
        int[] array2 = {3,3,4,4,6,7};

        //case 1: using Arrays.sort()
        System.out.println("Two max values of first array:");
        Arrays.sort(array1);
        for (int index = array1.length - 2; index < array1.length; index++) {
            System.out.println(array1[index]);
        }
        System.out.println("Two max values of second array:");
        Arrays.sort(array2);
        for (int index = array2.length - 2; index < array2.length; index++) {
            System.out.println(array2[index]);
        }

        //case 2: using buff array with 2 elements
        String firstResult = Arrays.toString(findMaxValues(array1));
        String secondResult = Arrays.toString(findMaxValues(array2));
        System.out.println("Two max values of first array: " + firstResult);
        System.out.println("Two max values of second array: " + secondResult);

    }

    public static int[] findMaxValues(int[] array) {
        int buf = 0;
        int[] result = new int[2];
        for (int index = 0; index < array.length; index++) {
            if (array[index] > result[0]) {
                buf = result[0];
                result[0] = array[index];
                if (buf < result[0]) {
                    result[1] = buf;
                } else {
                    result[1] = array[index];
                }
            } else if (array[index] > result[1]) {
                result[1] = array[index];
            }
        }
        return result;
    }
}
