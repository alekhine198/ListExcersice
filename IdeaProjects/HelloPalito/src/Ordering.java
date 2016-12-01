import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by angel alekhine on 11/23/2016.
 */
public class Ordering {
    private static Scanner scanner = new Scanner(System.in);

    public int[] getIntegers(int capacity){
        int [] array = new int[capacity];
        System.out.println("Enter " + capacity + " numbers:\r");

        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public int[] sortArray(int[] numbers){
        int[] sortedArray = Arrays.copyOf(numbers,numbers.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i =0; i < sortedArray.length - 1; i++){
                if (sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i +1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public void printArray(Integer[] numbers){

        for (int i = 0; i < numbers.length; i++){
            System.out.println("Element " + i + " is: " + numbers[i]);
        }


    }
}
