import java.util.Scanner;
public class string {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String A, B;
		
		//get string input
		A = input.next();
		B = input.next();
		
		//print length of string A + B
		System.out.println(A.length() + B.length());
		
		//check whether String A is lexicographically greater than B
		if(A.compareTo(B) < 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
		
		//capitalize first letter in both string and print them in one line
		System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1)); 
	}

}
