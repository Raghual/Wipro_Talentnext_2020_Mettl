package myproject;

public class LastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234,m=1235;
		int a = 0,b=0;
		if(n/10==0 && m/10==0) {
			System.out.println(n+m);
		}
		else {
			a=n%10;
			b=m%10;
		
		System.out.println(a+b);
	}

	}
}
		

