public class A3 {
/*Write a program to initialize an integer array with values and check if a given number is present in the array or not.
If the number is not found, it will print -1 else it will print the index value of the given  number in the array.
Example 1) If the Array elements are  {1,4,34,56,7} and the search element is 90, then the output expected is -1.
Example 2)If the Array elements are  {1,4,34,56,7} and the search element is 56, then the output expected is 3.
*/
public static void main(String[] args) {
    int[] array = {1, 4, 34, 56, 7};
    int  s = 90;
    int i, f = 0;

    for(i = 0; i < array.length; i++) {
        if(array[i] == s) {
            f = 1;
            break;
        }
    }
    if(f == 1) {
        System.out.println(i+1);
    }
    else {
        System.out.println("-1");
    }
}
}
