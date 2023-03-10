package JavaExceptionHandling;

import java.util.Scanner;

public class Solution {
	public static final MyCalculator my_calculator = new MyCalculator();
	public static final Scanner in = new Scanner(System.in);
	
	public static void main(String[] arg) {
		while(in.hasNext()) {
			int n = in.nextInt();
			int p = in.nextInt();
			
			try {
				System.out.println(my_calculator.power(n,p));
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		in.close();
	}
}
