import java.io*;
import java.util.*;
class UserMainCode
{
public int WeightOfString(String input1,int input2){
		int weight=0;
		String s=input1.toLowerCase();
		if(input2==1){
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)>=97 && s.charAt(i)<=122){
					weight=weight+((int)s.charAt(i)-96);
				}
				else
					weight=weight+0;
			}
		}
		else{
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)>97 && s.charAt(i)<=122){
					if(s.charAt(i)==97 || s.charAt(i)==101 ||s.charAt(i)==105||s.charAt(i)==111||s.charAt(i)==117){
						weight=weight+0;
					}
					else{
						weight=weight+((int)s.charAt(i)-96);
					}
				}
			}
		}
		return weight;
    }
    }
