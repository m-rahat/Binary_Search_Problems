import java.util.*;

public class Longest_Consecutive_Run_Of_1_in_Binary {

	public static int solve(int n) {
		String num = Integer.toBinaryString(n);
		System.out.println(num);
		int temp = 0;
		int maxLength = 0;

		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) == '1') {
				temp++;
			}
			else if (num.charAt(i) == '0' && temp >= maxLength) {
				maxLength = temp;
				temp = 0;
			}//else if
			else {
				temp = 0;
			}
		} // for

		if (temp != 0 && temp >= maxLength) {
			maxLength = temp;
		}//if
		
		return maxLength;
	}// solve

	public static void main(String[] args) {

		System.out.println(solve(36772731));

	}// main
}// classname
