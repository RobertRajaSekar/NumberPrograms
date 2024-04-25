package numberPrograms;

public class AutoMorphicNumber {
	public static void main(String[] args) {
		int n=11,sq=n*n;
		while(n>0) {
			int r1=n%10;
			int r2=sq%10;
			if(r1==r2) {
				n=n/10;
				sq=sq/10;
			}
			else {
				System.out.println("it is not an Automorphic Number");
				break;
			}
		}
		if(n==0)
			System.out.println("it is an Automorphic Number");
	}
}
