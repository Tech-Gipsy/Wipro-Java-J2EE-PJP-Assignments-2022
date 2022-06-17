 Create a Project named JunitLearning 
1. Create a package named com.wipro.task
2. Copy the given class into the com.wipro.task package
package com.wipro.task;
import java.util.Arrays;

public class DailyTasks {

	public String doStringConcat (String s1, String s2) {
		return s1+" "+s2;
	}
	public int[] sortValues(int arr[]){
		Arrays.sort(arr);
		return arr;
	}
	public boolean checkPresence(String str,String a){
		return str.contains(a);
	}
}
3. Create a new package called com.wipro.test;
4. Create a class named TestStringConcat to test the functionality of doStringConcat method [hint: use assertEquals method]