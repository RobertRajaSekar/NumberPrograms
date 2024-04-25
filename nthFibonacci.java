package numberPrograms;

import java.util.Scanner;

public class nthFibonacci {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter Range");
		int range=S.nextInt();
		System.out.println("Enter Target");
		int target=S.nextInt();
		int n1=0,n2=1,sum=0;
		if(target<=range) {
			for( int i=1;i<=range;i++) {
				if(target==i) {
					System.out.println(target+" th fibanocci is : "+n1);
				}
				sum=n1+n2;
				n1=n2;
				n2=sum;

			}
		}
		else
			System.out.println("Target should be less then or equal to range");
	}
}
