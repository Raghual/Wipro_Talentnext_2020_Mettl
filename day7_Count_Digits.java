import java.io*;
import java.util.*;
class UserMainCode
{
public int countDigits(int input1){
int count=0;
int r;
while(input1>0){
	input1=input1/10;
	count=count+1;
}
return count;
}
}
		
