package training_timus;

import java.util.Scanner;
public class A_plus_B {

	public static int plus() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		return (a+b);
	}
	public static void main(String[] args) {
		System.out.print(plus());
	}
}
