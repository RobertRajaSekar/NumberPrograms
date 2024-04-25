package numberPrograms;

public class asciiValues {
public static void main(String[] args) {
	for(char i='A';i<='Z';i++) {
		int j=(int)i;//Narrowing concept [we can do like this (int j=i)]
		System.out.println("AACII Value of "+i+"="+j);
	}
}
}
