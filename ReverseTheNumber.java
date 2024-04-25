package numberPrograms;

public class ReverseTheNumber {
public static void main(String[] args) {
	int n=1123;
	int rev=0;
	while(n>0) {
		
	int	rem=n%10;
	rev=rev*10+rem;
	n=n/10;
	}
	System.out.println(n);
	
		System.out.println("The Reversed Number :"+rev);

}
}
