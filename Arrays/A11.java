// Given an array of type int, print true if every element is 1 or 4. 

// only14([1, 4, 1, 4]) → true
// only14([1, 4, 2, 4]) → false
// only14([1, 1]) → true
public class A11 {

    public static void main(String[] args)
    {
        int a[] ={1,1,2,4};
        only14(a);
    }

    public static void only14(int[] a) {
        int f=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==1 || a[i]==4)
            {
                f=1;

            }
            else
            {
                f=0;
                break;
            }
        }
        if(f==1)
        {
            System.out.println("true");

        }
        else{System.out.println("false");}
    }
}
