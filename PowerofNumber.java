package numberPrograms;

public class PowerofNumber {
	public static void main(String[] args) {
		int base=3,exp=4, power=1;
		for(int i=1;i<=exp;i++) {
			power=power*base;
		}
		System.out.println(power);
	}
}
