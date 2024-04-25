package numberPrograms;

public class PerfectSquare {
	public static void main(String[] args) {
		int n=16;int root=0;
		for(int i=1;i<=n/2;i++) {
			if(i*i==n) {
				root=1;
				break;
			}
		}	
		if(root==1) 
			System.out.println("The Given number is a perfect square");
		else
			System.out.println("The Given number is not a perfect square");
	}
}
