mport java.io*;
import java.util.*;
class UserMainCode
{
public int NthFibonacci(int input1){
  int f=0;
  int s=1,next=0;
  if(input1==1)
    return 0;
  if(input1==2)
    return 1;
  int i=3;
  while(i<=input1){
      nex=s+f;
      s=next;
      i++;
   }
return next;
}
}
