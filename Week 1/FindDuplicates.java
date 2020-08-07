package io.august.week1;
// Link: https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3414/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		int arr[] = new int[] { 2, 2, 3, 4, 43, 1, 234 };
		List<Integer> ans = findDuplicates(arr);
		for (int i : ans)
			System.out.println(i);
	}

	public static List<Integer> findDuplicates(int[] nums) {

		List<Integer> result = new ArrayList<Integer>();
		Set<Integer> inSet = new HashSet<Integer>();
		for (int i : nums) {
			if (inSet.contains(i)) {
				result.add(i);
			} else {
				inSet.add(i);
			}
		}
		return result;
	}
}
