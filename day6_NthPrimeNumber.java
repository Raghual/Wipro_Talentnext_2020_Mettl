import java.io*;
import java.util.*;
class UserMainCode
{
public int NthPrimeNumber(int input1){
int count=0;
    int num=1,i;
    while(count<input1){
        num=num+1;
        for(i=2;i<=num;i++){
            if(num%i==0){
                break;
            }
        }
        if(i==num){
            count=count+1;
        }
    }
    return num;
}
}
