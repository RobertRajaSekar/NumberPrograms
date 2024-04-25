package numberPrograms;

public class SumOfFactors {
	public static void main(String[] args) {
		int n=6;
		int sum=0;
		System.out.println("The factors of "+n+" are : ");
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println("The sum of factors is : "+sum);
	}
}
