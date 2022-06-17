// Print a version of the given array where all the 10's have been removed. 
// The remaining elements should shift left towards the start of the array as needed, and the empty spaces at the end of the array should be 0. 
// So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and display the given array or make a new array.

// withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
// withoutTen([10, 2, 10]) → [2, 0, 0]
// withoutTen([1, 99, 10]) → [1, 99, 0]
public class A9 {

    public static int[] withoutTen(int[] n) {
        int[] copy = new int[n.length];
        int j = 0;
        for (int i=0; i<n.length; i++)
            if (n[i] != 10) {
                copy[j] = n[i];
                j++;
            }
        return copy;
    }
    public static void main(String[] args) {
        int[] a={1,10,10,2};
        int[] result = withoutTen(a);

        for (int i=0; i<result.length; i++) {

            System.out.println(result[i] + " ");
        }
    }

}

