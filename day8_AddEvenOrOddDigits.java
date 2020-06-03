import java.io*;
import java.util.*;
class UserMainCode
{
public int AddEvenOrOddDigits(int input1){			
		String s= "even";
		int h=input1;
		int n,r;
		int sum=0;
		if(s.equals(input2)){
			while(h>0){
				r=h%10;
				if(h%2==0){
					sum=sum+r;
				}
				h/=10;
			}
		}
		else{
			while(h>0){
				r=h%10;
				if(h%2!=0){
					sum=sum+r;
				}
				h/=10;
			}
		
		}
		return sum;
