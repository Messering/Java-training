package training_timus;

import java.util.Scanner;

public class Bicycle_Codes {
	
	public static void main(String []args){
		Scanner sc=new Scanner( System.in);
		String  z1=sc.nextLine();
		String  z2=sc.nextLine();
		sc.close();
		if(z1.length()!=4 || z2.length()!=4){System.out.println("Incorrect");}
		boolean yn=true;
		boolean inp=false;
		int z11=Integer.parseInt(z1);
		int z22=Integer.parseInt(z2);
		int count=0;
		while(yn){
			if(count%2==0){
				if(count==z11){inp=true; yn=false;}
			}
				if(count%2!=0){
					if(count==z22){inp=true; yn=false;}
			}
				if(z11>z22){if(count>z11) yn=false;} else if(count>z22)yn=false;
			count++;
		}
		if(inp==true)System.out.println("yes");
		else System.out.println("no");
	}
}
