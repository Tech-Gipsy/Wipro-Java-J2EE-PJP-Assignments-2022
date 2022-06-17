// Given 2 int arrays, a and b, each length 3, form a new array of length 2, containing their middle elements.

// middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
// middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
// middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
public class A12 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        int b[] = {4, 5, 6};
        middleway(a, b);
    }

    public static void middleway(int[] a, int[] b) {
        int[] c = new int[2];
        c[0] = a[a.length / 2 ];
        c[1] = b[b.length / 2 ];
        System.out.println(c[0]+" "+c[1]);
    }
}
