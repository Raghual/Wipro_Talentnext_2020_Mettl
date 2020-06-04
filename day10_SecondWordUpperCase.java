import java.io*;
import java.util.*;
class UserMainCode
{
public String SecondWordUpperCase(String input1){		
		String [] s=input1.split(" ");
		if(s.length<2){
			return "LESS";
		}
		else
			return (s[1].toUpperCase());
}
}
