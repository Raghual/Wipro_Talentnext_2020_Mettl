import java.io*;
import java.util.*;
class UserMainCode
{
public int AddEvenDigits(int input1){
int sum=0,r;
    while(input1>0){
        r=input1%10;
        if(r%2==0){
            sum=sum+r;
        }
        input1=input1/10;
    }
    return sum;
}
}
