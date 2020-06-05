import java.io*;
import java.util.*;
class UserMainCode
{
public int Factorial(String input1){
		int fact=1;
		int i=1;
		while(i<=input1){
			fact=fact*i;
			i+=1;
		}
		return fact;
}
}
