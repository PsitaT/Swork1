package Javamix;

public class JavaMixPractise1 {

	public static void main(String[] args) {

		int N = 100;
		if (N > 0) {
			System.out.println("Positive");
		} else {
			System.out.println("Negative");
		}
		int x = 777;
		int y = 999;
		if (x > y) {
			System.out.println("x is greater");
		} else {
			System.out.println("y is greater");
		}

		int a = 1000;
		int b = 999;
		int c = 1001;

		if (a > b) {
			if (a > c) {
				System.out.println("A is greate");
			}
		}
		if (b > a) {
			if (b > c) {
				System.out.println("B is greater");

			}
		} else {
			System.out.println("c is greater");
		}

		int ab = 1100;
		int bc = 909;
		int cd = 1011;
		if (ab > bc && ab > cd) {
			System.out.println("ab is greater");
		}
		if (bc > cd && bc > ab) {
			System.out.println("bc is greater");
		} else {
			System.out.println("cd is greater");
		}

		int num = 20;

		if (num > 0 && num <= 20) {
			System.out.println("5 % discount");
		}
		if (num > 5 && num <= 35) {
			System.out.println("10 % discount");
		}
		if (num > 50) {
			System.out.println("30 % discount");
		}

		int Num = 25;

		if (Num > 0 && Num <= 20) {
			System.out.println("5 % discount");
		} else if (Num > 5 && Num <= 35) {
			System.out.println("10 % discount");
		} else if (Num > 50) {
			System.out.println("30 % discount");
		}

		int marks = 99;

		if (marks > 90) {
			System.out.println("Grade A");
		}
		if (marks > 75) {
			System.out.println("Grade B");
		}
		if (marks > 60) {
			System.out.println("Grade C");
		}

		int Emarks = 82;

		if (Emarks > 90) {
			System.out.println("Grade A");
		} else if (Emarks > 80) {
			System.out.println("Grade B");
		} else if (Emarks > 70) {
			System.out.println("Grade C");
		} else {
			System.out.println("fail");
		}

	}

}
