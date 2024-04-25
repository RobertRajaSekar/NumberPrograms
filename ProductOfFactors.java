package numberPrograms;

public class ProductOfFactors {
	public static void main(String[] args) {
		int n=6;
		int product=1;
		System.out.println("The factors of "+n+" are : ");
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				product=product*i;
			}
		}
		System.out.println("The product of factors is : "+product);
	}
}
