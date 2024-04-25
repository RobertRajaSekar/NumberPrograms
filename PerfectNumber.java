package numberPrograms;

public class PerfectNumber {
	public static void main(String[] args) {
		int n=28;
		int sum=0;
		System.out.println("The factors of "+n+" are : ");
		for(int i=1;i<=n-1;i++) {	//or i<n				 or		for(int i=1;i<=n;i++)			
			if(n%i==0) {	//or we also declare like this          if(n%i==0 && i!=n)
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println("The sum of factors except that no is : "+sum);
		if(sum==n) {
			System.out.println("The given number is perfect number");
		}
		else {
			System.out.println("The given number is not a perfect number");
		}
	}
}
