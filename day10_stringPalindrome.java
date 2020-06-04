import java.io*;
import java.util.*;
class UserMainCode
{
public String stringPalindrome(String input1){
		input1=input1.toLowerCase();
		StringBuilder s=new StringBuilder(input1);
		s.reverse();
		String s1=s.toString();
		if(input1.equals(s1)){
			return 2;
		}
		else
			return 1;
}
}
