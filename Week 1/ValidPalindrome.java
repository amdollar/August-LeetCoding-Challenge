package io.august.week1;

public class ValidPalindrome {

	public static void main(String[] args) {
		String line = new String("A man, a plan, a canal: Panama");
		System.out.println(isPalindrome(line));
	}

	public static boolean isPalindrome(String line) {
		int left = 0;
		int right = line.length() - 1;
		while (left < right) {
			while (left < right && !Character.isLetterOrDigit(line.charAt(left))) {
				left++;
			}
			while (left < right && !Character.isLetterOrDigit(line.charAt(right))) {
				right--;
			}
			if (left < right
					&& Character.toLowerCase(line.charAt(left++)) != Character.toLowerCase(line.charAt(right--))) {
				return false;
			}
		}

		return true;
	}

}
