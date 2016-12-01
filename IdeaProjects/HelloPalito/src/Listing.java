import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by angel alekhine on 11/24/2016.
 */
public class Listing {

    private static Scanner s = new Scanner(System.in);

    public int[] getInput(int[] baseData){
        for (int i = 0; i< baseData.length; i++){
            baseData[i] = s.nextInt();
        }
        return baseData;
    }

    public void printArray(int[] array){
        System.out.println("The array is:");
        for (int i = 0; i < array.length; i ++){
            System.out.print(array[i] + " ");
        }
        System.out.println("---------------------------");
    }

    public int [] resizeArray(int[] baseData){
        int[] copyArray = Arrays.copyOf(baseData, baseData.length);
        baseData = new int[12];
        for (int i = 0; i < copyArray.length; i++){
            baseData[i] = copyArray[i];
        }

        return baseData;
    }
}
