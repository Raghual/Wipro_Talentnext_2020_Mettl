import java.io*;
import java.util.*;
class UserMainCode
{
public int Pin(int input1){		
		int a1,a2,a3,b1,b2,b3,c1,c2,c3,pin,min1,min2,min3,max;
		a1=input1%10;
		a2=input2%10;
		a3=input3%10;
		b1=(input1/10)%10;
		b2=(input2/10)%10;
		b3=(input3/10)%10;
		c1=input1/100;
		c2=input2/100;
		c3=input3/100;
		min1=Math.min(a1, Math.min(a2, a3));
		min2=Math.min(b1, Math.min(b2, b3));
		min3=Math.min(c1, Math.min(c2, c3));
		max=Math.max(a1, Math.max(a2,Math.max(a3, Math.max(b1, Math.max(b2, Math.max(b3, Math.max(c1, Math.max(c2, c3))))))));
		pin=max*1000+min3*100+min2*10+min1;
		return pin;
}
}
