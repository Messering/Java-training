package training_timus;

import java.util.Scanner;
public class Reverse_Root_v2 {
	public static void func(){
	Scanner sc = new Scanner(System.in);
	while(true){
	double mass=(sc.nextFloat());	
	if(mass>=0 && mass<=Math.pow(10,18)){
	System.out.printf(String.format("%1$.4f\n",Math.sqrt(Double.parseDouble(mass+"\n"))));	
	}
		}
	}
	public static void main(String[] args) {
		func();
		
	}
	}
