package Junit.Assertmethos;

import java.util.Arrays;

public class methods {
    public static  String doStringConcat(String str1, String str2){
        return str1 + str2;
    }
    public static int[] sortValue(int arr[])
    {
        Arrays.sort(arr);
        return arr;
    }
    public static  boolean checkPresence(String str,String a)
    {
        return str.contains(a);
    }
}
