public class A5 {
    //Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for(int i = 0; i < array.length-1; i++) {
            for(int j = 0; j < array.length-1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Largest of two numbers are "+array[array.length-1]+", "+array[array.length-2]);
        System.out.println("Smallest of two numbers are "+array[0]+", "+array[1]);
    }

}
