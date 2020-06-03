import java.io*;
import java.util.*;
class UserMainCode
{
public int Palindrome(int input1){		
		int rev=0;
		int r;
		int n=input1;
		int temp=n;
		while(n>0){
			r=n%10;
			rev=rev*10+r;
			n/=10;
		}
		if(rev==temp){
			return 2;
		}
		else
		return 1;
}
}
