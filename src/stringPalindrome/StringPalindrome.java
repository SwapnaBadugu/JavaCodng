package stringPalindrome;

import java.util.Arrays;

public class StringPalindrome {
	static String str;

	// Inbuilt method
	public static boolean isPalindrome(String str) {
		if (str == null)
			return false;
		StringBuilder strBuilder = new StringBuilder(str);

		strBuilder.reverse();
		return strBuilder.toString().equals(str);

	}
	// without inbuilt method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StringPalindrome.isPalindrome(str));
		String st = "Myself";
		char[] ch = st.toCharArray();
		System.out.println(ch.length);
		char c = st.charAt(3);
		System.out.println(c);

		String s = "Suresh";
		byte[] byte1 = s.getBytes();
		System.out.println(Arrays.toString(byte1));

		byte[] byte2 = { 83, 117, 114, 101, 115, 104 };
		String strin = new String(byte2);
		System.out.println(strin);
	}
}
