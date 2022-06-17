package Junit.TestSuite;

import java.util.Arrays;

public class DailyTasks {
    public static  String doStringConcat(String str1, String str2){
        return str1 + str2;
    }
    public int[] sortValue(int arr[])
    {
        Arrays.sort(arr);
        return arr;
    }
    public boolean checkPresence(String str,String a)
    {
        return str.contains(a);
    }
}
