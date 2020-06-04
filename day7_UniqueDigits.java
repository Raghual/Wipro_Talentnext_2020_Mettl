import java.io*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;    
class UserMainCode
{
public int UniqueDigits(int input1){
import java.util.ArrayList;
import java.util.HashSet;    
	int count=0,r;
        ArrayList<Integer>list1 = new ArrayList<Integer>();
		while(input1>0){
			r=input1%10;
			input1/=10;
			list1.add(r);
		}
		HashSet<Integer> set=new HashSet<Integer>(list1);
		ArrayList<Integer>list2=new ArrayList<Integer>(set);
		return list2.size();
}
}
