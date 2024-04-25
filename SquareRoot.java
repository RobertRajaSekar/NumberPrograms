package numberPrograms;

public class SquareRoot {
	public static void main(String[] args) {
		int n=22,i,root = 0;
		for(i=1;i<=n/2;i++) {
			if(i*i==n) {
				root=1;
				break;
			}
		}	
		if(root==1) 
			System.out.println("The square root of "+n+" is : "+i);
		else
			System.out.println("The Given number is having no square root");
	}	
}

