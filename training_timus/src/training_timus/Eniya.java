package training_timus;

import java.util.Scanner;

public class Eniya {


	public static void input(){
		System.out.println("������ ������� ������ � �� ����� ��b: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		if(n>=1 && n<=100 && a>=1 && a<=100 && b>=1 && b<=100){
			System.out.print((n*(a*b))*2);} 
		else{ System.out.print("������� �� ��������� ��������"); 
		}
	}
	public static void main(String[] args) {
	   input();
	} 	

}
 