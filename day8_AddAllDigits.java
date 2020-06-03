import java.io*;
import java.util.*;
class UserMainCode
{
              public int SumAllDigits(int input1){	
		int sum=0,r,m,temp,n;
		m=Math.abs(input1);
		temp=m;
		while(m>0||sum>9){
			if(m==0){
				m=sum;
				sum=0;
			}
			r=m%10;
			sum=sum+r;
			m/=10;
		}
		if(temp==input1){
			return sum;
		}
		else{
			n=(~(sum-1));
			return n;
		}
}
}
