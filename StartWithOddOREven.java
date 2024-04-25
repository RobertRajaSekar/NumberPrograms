package numberPrograms;

public class StartWithOddOREven {
public static void main(String[] args) {
	int n=3452;
	while(n>9) {
		n=n/10;
	}
	if(n%2==0)
		System.out.println("The no start with even number");
	else
		System.out.println("The number Start with ODD number");
}
}
