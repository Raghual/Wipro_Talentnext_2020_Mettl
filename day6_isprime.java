package myproject;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int a,flag=0;
		a=s.nextInt();
		if(a==2) 
			System.out.println("Prime");
		if(a>2) {
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				flag=0;
				break;}
			else
				flag=1;
		}
		if(flag==1)
			System.out.println("Prime");
		else
			System.out.println("Consonant");}

	}

}
