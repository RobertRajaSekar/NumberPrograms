package numberPrograms;

public class NeonNumber {
public static void main(String[] args) {
	int n=9;int n1=n*n;int sum=0;
	while(n1>0) {
	int	digit=n1%10;
		sum=sum+digit;
		n1=n1/10;
	}
	System.out.println("sum of square digits is "+sum);
	if(sum==n) {
		System.out.println("It is a neon number");
	}
	else
		System.out.println("It is not a neon number");
		
}
}
