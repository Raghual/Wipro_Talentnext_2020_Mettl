import java.io*;
import java.util.*;
class UserMainCode
{
public int AddAllDigitsCount(int input1){		
		int sum=0,r;
		int n=input1;
		while(n>0){
			r=n%10;
			if(r%2!=0){
				sum=sum+r;
			}
			n/=10;
		}
		return sum;
}
}
