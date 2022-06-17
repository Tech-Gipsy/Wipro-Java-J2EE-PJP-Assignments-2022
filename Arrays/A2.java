import java.util.Arrays;

public class A2 {
    public static void main(String[] args) {
        //Write a program to initialize an integer array and find the maximum and minimum value of the array.

        int[] array = {1, 2, 3, 4, 5};
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > max)
                max = array[i];
        }
        System.out.println("The maximum val is: "+max);
        int min = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] < min)
                min = array[i];
        }
        System.out.println("The minimum val is: "+min);
    }
}
