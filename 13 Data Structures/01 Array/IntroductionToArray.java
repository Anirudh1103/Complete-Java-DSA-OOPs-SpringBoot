import java.util.Arrays;
import java.util.Scanner;

public class IntroductionToArray {
    public static void main(String[] args) {
        //Declaration of Array
        int[] array = {1,2,3,4,5};

        //Declaring array Taking input later
        Scanner ip = new Scanner(System.in);
        int size = ip.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = ip.nextInt();

        //Printing the array
        for(int i=0;i<size;i++)
            System.out.print(arr[i] + " ");
    }
}
