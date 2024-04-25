package numberPrograms;

public class GreatestCommenDiviser {
public static void main(String[] args) {
	int n1=8,n2=12;int gcd=0;
	for(int i=1;i<=n1&&i<=n2;i++) {
		if(n1%i==0&&n2%i==0) {
			 gcd=i;
			 System.out.println("The commen Divisers are :"+i);
		}
	}
	System.out.println("The gratest commen diviser is :"+gcd);
}
}
