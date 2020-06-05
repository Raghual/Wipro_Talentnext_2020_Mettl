import java.io*;
import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Entry;
import java.util.Set;
import java.util.HashMap;
class UserMainCode
{
public int MaostFrequentDigit(int input1){		
		int r1,r2,r3,r4;
		ArrayList<Integer>list=new ArrayList<Integer>();
		while(input1>0){
			r1=input1%10;
			list.add(r1);
			input1/=10;
		}
		while(input2>0){
			r2=input2%10;
			list.add(r2);
			input2/=10;
		}
		while(input3>0){
			r3=input3%10;
			list.add(r3);
			input3/=10;
		}
		while(input4>0){
			r4=input4%10;
			list.add(r4);
			input4/=10;
		}
		HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
		hmap.put(list.get(0),1);
		for(int i=1;i<list.size();i++){
			if(hmap.containsKey(list.get(i))){
				hmap.put(list.get(i),hmap.get(list.get(i))+1);
			}
			else
				hmap.put(list.get(i),1);
		}
		Set<Integer> keyset=hmap.keySet();
		ArrayList<Integer>list2=new ArrayList<Integer>(keyset);
		Collection<Integer>values=hmap.values();
		ArrayList<Integer> list3=new ArrayList<Integer>(values);
		for(int i=0;i<list3.size()-1;i++){
			for(int j=i+1;j<list3.size();j++){
				if(list3.get(i)>list3.get(j)){
					Collections.swap(list2, i, j);
					Collections.swap(list3, i, j);
				}
			}
		}
		return list2.get(list2.size()-1);
}
}
		
