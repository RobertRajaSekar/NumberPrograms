package numberPrograms;

import java.util.Scanner;

public class ProductOfEachDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int product=1;
		while(n>0) {
			int rem=n%10;
			product=product*rem;
			n=n/10;

		}
		System.out.println("The product of digits : "+product);
	}
}
