// Print an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and print the given array, or make a new array.

// evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
// evenOdd([3, 3, 2]) → [2, 3, 3]
// evenOdd([2, 2, 2]) → [2, 2, 2]
public class A10 {
    public static void main(String[] args)
    {
        int[] a={1,0,1,0,0,1,1,0};
        evenodd(a);
    }

    private static void evenodd(int[] a) {
        int size=a.length;
        int c[]=new int[100];
        int j=0;
        for(int i=0;i<size;i++)
        {
         if(a[i]%2==0)
         {
             c[j]=a[i];
             j++;
         }
        }
        for(int i=0;i<size;i++)
        {
            if(a[i]%2!=0)
            {
                c[j]=a[i];
                j++;
            }
        }
        for(int i=0;i<j;i++)
        {
            System.out.println(c[i]);
        }
    }
}
