package numberPrograms;

public class LargestAmong3NosUsingTernary {
public static void main(String[] args) {
	int a=10, b=20,c=30;
//	int res= (a > b) ? ((a > c) ? a: c) : ((b > c) ? b: c);
	
//OR
	String res=a>b&&a>c?"a is greatest":(b>c)?"b is largest":"c is largest";
	System.out.println(res);
}
}
