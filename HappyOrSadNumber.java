package numberPrograms;

public class HappyOrSadNumber {
	public static void main(String[] args) {
		int n=7;
		while(n!=1 && n!=4) {
			int sum=0;
			while(n>0) {
				int rem=n%10;
				int sq=rem*rem;
				sum=sum+sq;
				n=n/10;
			}
			System.out.println("sum :"+sum);
			if(sum==1) {
				System.out.println("Happy No");
				break;

			}
			else if(sum==4) {
				System.out.println("Sad No");
				break;
			}
			else {
				n=sum;
			}
		}
		if(n==1) {
			System.out.println("Happy no");
		}
		else if(n==4) {
			System.out.println("sad no");
		}
	}
}
