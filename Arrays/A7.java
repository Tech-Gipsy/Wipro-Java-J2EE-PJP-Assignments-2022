import java.util.Arrays;

public class A7 {
    /*Write a program to remove the duplicate elements in an array and print the same.
Example)
I/P:{12,34,12,45,67,89}
O/P:{12,34,45,67,89}
*/
    public static void main(String[] args) {
        int[] array = {12, 34, 12, 45, 67, 89};

        Arrays.sort(array);
        int[] temp = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length-1; i++){
            if (array[i] != array[i+1]){
                temp[j++] = array[i];
            }
        }
        temp[j++] = array[array.length-1];
        for (int i = 0; i < j; i++){
            System.out.print(temp[i]+" ");
        }
    }
}
