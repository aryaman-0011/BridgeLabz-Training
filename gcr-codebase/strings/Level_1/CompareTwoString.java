import java.util.*;


public class CompareTwoString {

	public static boolean isEqual (String s1, String s2) {
		
		if (s1.length() != s2.length()) {
			return false;
		}


		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}

		return true;
	}


	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String 1: ");
		String s1 = input.next();

		System.out.print("Enter String 2: ");
		String s2 = input.next();
	

		boolean charAtResult = isEqual (s1, s2);

		boolean equalsResult = s1.equals(s2);

		System.out.print("\nResult using charAt(): " + charAtResult);
		System.out.print("\nResult using equals(): " + equalsResult);

		if (charAtResult == equalsResult) {
			System.out.print("\nBoth methods gave the same result");
		} else {
			System.out.print("\nResults are different");
		}
		
		input.close();

	}
}
