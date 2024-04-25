package numberPrograms;

public class Factorial {
	public static void main(String[] args) {
		int n=5;
		int fact=1;
		while(n>=1) {

			fact=fact*n;
			n--;

		}
		System.out.println(fact);

		//	using for loop
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);

	}
}
