package training_timus;

import java.util.Scanner;
public class Reverse_Root {	
public static void func(){
Scanner sc = new Scanner(System.in);
int j = sc.nextInt();
double []mass = new double[j];
for(int i =0;i<j;i++){
mass[i]=(sc.nextFloat());
if(mass[i]>=0 && mass[i]<=Math.pow(10, 18)){
System.out.printf(String.format("%1$.4f\n",Math.sqrt(Double.parseDouble(mass[i]+"\n"))));	
}
}
sc.close();
}
public static void main(String[] args) {
	func();
}
}
