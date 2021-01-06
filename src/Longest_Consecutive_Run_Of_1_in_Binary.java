import java.util.*;

public class Longest_Consecutive_Run_Of_1_in_Binary {

	public static int solve(int n) {
		String num = Integer.toBinaryString(n);
		System.out.println(num);
		int temp = 0;
		int maxLength = 0;

		for (int i = 0; i < num.length(); i++) {
			String str = "";
			if (num.charAt(i) == '1') {
				temp++;
				if (temp > maxLength) {
					maxLength = temp;
					temp = 0;
					continue;
				}//if
			}//if
			else if (num.charAt(i) == '0') {
				if (temp > maxLength) {
					maxLength = temp;
					temp = 0;
				}//if
			}//else if

			if (i == num.length() - 1) {
				if (temp >= maxLength) {
					maxLength = temp;
					temp = 0;
				}
			}
			
		} // for

		return maxLength;
	}// solve

	public static void main(String[] args) {

		System.out.println(solve(156));

	}// main
}// classname
