package numberPrograms;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=12,count=0;
		System.out.println("The factors of "+n+" are : ");
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				count++;
			}
		}
		if(count==2)
		System.out.println("it is a prime number");
		else
			System.out.println("it is not a prime number");
	}
}
