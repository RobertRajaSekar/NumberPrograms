package numberPrograms;

public class PrimeNumbersGivenRange {
	public static void main(String[] args) {
		//outer for loop will traverse the range
		for(int n=1;n<=10;n++) {
			int count=0;
			//inner for loop will used to find the factors
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==2)
				System.out.println(n);
		}
	}
}
