import java.util.Arrays;

public class A1 {
//Write a program to initialize an integer array and print the sum and average of the array.

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("The sum of the array is: "+sum);
        float avg = (sum/array.length);
        System.out.println("The average of the array is: "+avg);
    }
}
