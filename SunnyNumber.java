package numberPrograms;

public class SunnyNumber {
	public static void main(String[] args) {
		int n=15;int root=0;int n1=n+1;
		for(int i=1;i<=n1/2;i++) {
			if(i*i==n1) {
				root=1;
				break;
			}
		}	
		if(root==1) 
			System.out.println("The Given number is a sunny number");
		else
			System.out.println("The Given number is not a sunny number");
	}
}
