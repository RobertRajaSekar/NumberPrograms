package numberPrograms;

public class ExtractAllDigits {
public static void main(String[] args) {
	 int a = 1234;

// Using a while loop to extract digits
//     while (a > 0) {
//         int digit = a % 10; // Get the last digit
//         System.out.println("Digit: " + digit);
//         a /= 10; // Remove the last digit
//	}
	 
//using for loop
//     for(a=1234;a>0;a/=10) {
//    	int digit1=a%10;
//    	System.out.println("The No = "+a);
//    	System.out.println("The exracted Digit = "+digit1);
//    	
//     }
//     System.out.println(a);
	 
	 do {
		 int rem=a%10;
		 System.out.println(rem);
		 a=a/10;
	 }
	 while(a>0);{
		 System.out.println(a);
	 }
}
}
