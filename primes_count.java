import java.io*;
import java.util.*;
class UserMainCode
{
public int countPrimesInRange(int input1,int input2){
int count=0;
    int flag=0;
    for(int i=input1;i<=input2;i++){
        if(i==2)
           count =count+1;
        for(int j=2;j<i;j++){
            if(i%j==0){
                flag=0;
                break;
            }
            else
               flag=1;
        }
        if(flag==1){
            count =count+1;
        }
    }
    return count;
}
}
