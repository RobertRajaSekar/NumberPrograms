package numberPrograms;

public class StrongNumber {
	public static void main(String[] args) {
		int n=145;
		int temp=n;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			System.out.println(rem+"--->"+fact);
			sum=sum+fact;
			n=n/10;
		}
		System.out.println("The Sum is :"+sum);
		if(sum==temp) {
			System.out.println("The given no is Strong Number");
		}
		else
			System.out.println("The given no is not a Strong Number");
	}
}
