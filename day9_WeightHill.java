import java.io*;
import java.util.*;
class UserMainCode
{
public int WeightHill(int input1){			
		ArrayList<Integer>list1=new ArrayList<Integer>();
		list1.add(input2);
		int t=input3,m=0;
		int k,sum=0,sum1=input2;
		for(int i=1;i<input1;i++){
			sum1=sum1+t;
			k=2;
			for(int j=0;j<i;j++){
				sum=sum1*(k);
				k++;
			}
			list1.add(sum);
		}
		for(int i=0;i<list1.size();i++){
			m=m+list1.get(i);
		}
		return m;
}
}
