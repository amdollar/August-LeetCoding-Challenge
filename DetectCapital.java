package io.august.week1;

public class DetectCapital {

	public static void main(String[] args) {
		String word = "FLAG";
		System.out.println(detectCapitalUse(word));
	}

	public static boolean detectCapitalUse(String word) {
		char[] chars = word.toCharArray();
		int count = 0;

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= 65 && chars[i] <= 94)
				count++;
		}

		if (count == chars.length || ((word.charAt(0) >= 65 && word.charAt(0) <= 94) && count == 1) || count == 0)
			return true;

		return false;
	}
}
