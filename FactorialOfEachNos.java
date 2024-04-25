package numberPrograms;

public class FactorialOfEachNos {
	public static void main(String[] args) {
		int n=352;

		while(n>0) {
			int rem=n%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			System.out.println(rem+"--->"+fact);
			n=n/10;

		}
	}
}
