package numberPrograms;

public class AmstrongNumber {
	public static void main(String[] args) {
		int n = 153;
		int temp = n;
		int count = 0;
		int sum = 0;

		// Calculate the number of digits
		while (temp > 0) {
			temp = temp / 10;
			count++;
		}
		System.out.println("The count of digits : "+count);

		temp = n; // Reset temp to the original number

		// Find the Armstrong number
		while (temp > 0) {
			int digit = temp % 10;
			int power = 1;

			for (int i = 0; i < count; i++) {
				power *= digit;
			}

			sum += power;
			System.out.println("the bower of "+digit+" is "+power);
			temp = temp / 10;
		}
		System.out.println("The sum of the powers of each digits are : "+sum);

		// Check if it's an Armstrong number
		if (sum == n) {
			System.out.println("so "+n + " is an Armstrong number");
		} else {
			System.out.println("so "+n + " is not an Armstrong number");
		}
	}
}