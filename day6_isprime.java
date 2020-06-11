package myproject;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		if(input1==2){
			return 2;
		}
		for(int i=2;i<input1;i++){
			if(input1%i==0){
				flag=1;
				break;
			}
			else{
				flag=0;
			}
		}
		if(flag==0){
			return 2;
		}
		else
			return 1;

	}

}
