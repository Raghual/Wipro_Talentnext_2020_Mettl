import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
class UserMainCode
{
public int PalindromePossible(String input1){

		int n=input1,r,flag=0;
		int count=0;
		ArrayList<Integer>list1=new ArrayList<Integer>();
		while(n>0){
			r=n%10;
			list1.add(r);
			n/=10;
		}
		HashMap<Integer,Integer>hmap=new HashMap<Integer,Integer>();
		for(int i=0;i<list1.size();i++){
			if(hmap.containsKey(list1.get(i))){
				hmap.put(list1.get(i),hmap.get(list1.get(i)+1));
			}
			else
				hmap.put(list1.get(i),1);
		}
		Collection<Integer>values=hmap.values();
		ArrayList<Integer>list2=new ArrayList<Integer>(values);
		for(int i=0;i<list2.size();i++){
			if(list2.get(i)%2!=0){
				count=count+1;
			}
			if(count>1){
				flag=1;
				break;
			}
			else
				flag=0;
		}
		if(flag==1)
			return 1;
		else
			return 2;
}
}
		
