package myproject;

public class EvenCountOddCountEvenOrOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0,d=0,e=0;
		int n=123456;
		if(n%2==0) {
			c=c+1;
		}
		if(n%2!=0) {
			d+=1;
		}
		if(n%2==0 || n%2!=0) {
			e+=1;
		}
		System.out.println(c+" "+d+" "+e);
	}

}
