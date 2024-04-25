package numberPrograms;

public class SumofFactofEach {
	public static void main(String[] args) {
		int n=354;
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
		System.out.println(sum);
	}
}
