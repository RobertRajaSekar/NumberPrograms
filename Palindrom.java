package numberPrograms;

public class Palindrom {
	public static void main(String[] args) {
		int a=121;
		int n=a;
		int rev=0;
		while(n>0) {

			int	rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(a==rev) {
			System.out.println("The given number is palindrom");
		}
		else {
			System.out.println("The given number is not a palindrom");
		}

	}
}
