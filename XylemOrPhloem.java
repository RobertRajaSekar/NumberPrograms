package numberPrograms;

public class XylemOrPhloem {
public static void main(String[] args) {
	int n=12348;int innersum=0,outtersum=0;
	int lastdigit=n%10;n=n/10;
	while(n>9) {
		int rem=n%10;
		innersum=innersum+rem;
		n=n/10;
	}
	outtersum=lastdigit+n;
	System.out.println("The inner sum is : "+innersum);
	System.out.println("The outter sum is : "+outtersum);
	
	if(innersum==outtersum)
		System.out.println("The Given number is Xylem");
	else
		System.out.println("The Given number is Phloem");
}
}
