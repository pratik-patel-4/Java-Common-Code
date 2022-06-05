package CommonQuestions;

import java.util.HashSet;
import java.util.Set;

/*
 * Problem Statement : 
 * Given an array of integers and a value, determine if there are any 
 * two integers in the array whose sum is equal to the given value. 
 * Return true if the sum exists and return false if it does not. 
 * Consider this array and the target sums:
 * 
 * arr = [5,7,1,2,8,4,3]
 * 
 * Target Sum = 10 => 7 + 3 = 10 || 2 + 8 = 10 (True)
 * 
 * Target Sum = 19 => No 2 value sum up to 19.
 * 
 * Logic :
 * 
 * 1)  2 for loop one for main loop and one to check it's counter part to get 
 * the targeted sum.
 * 
 * Runtime Complexity :- O(n^2);
 * 
 * 2) use one hashSet and use one loop, now add visited integer in the set
 * and check every time for the counter part in the set before adding num
 * in the set, if found then true, else false;
 * 
 * Runtime Complexity :- O(n) as we are using only one for loop.
 */

public class FindSumOfTwo {

	public static void main(String[] args) {
		System.out.println(findSumOfTwo(new int[] {5,7,1,2,8,4,3},10));
		System.out.println(findSumOfTwo(new int[] {5,7,1,2,8,4,3},19));
	}
	
	private static boolean findSumOfTwo(int[] arr, int value) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			if(set.contains(value - arr[i])) {
				return true;
			}
			set.add(arr[i]);
		}
		
		return false;
	}
	
}
