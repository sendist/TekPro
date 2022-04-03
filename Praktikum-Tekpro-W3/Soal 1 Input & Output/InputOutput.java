import java.util.Scanner;
import java.util.StringTokenizer;

public class InputOutput {

	public static void main(String[] args) {
		
		//Membuat objek scanner dan melakukan input string
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		
		//Membuat objek StringTokenizer dan memasukan string s
		//Juga menambahkan delimiter tanda "'" dan juga " "
		StringTokenizer str = new StringTokenizer(s, "'// ");

		//Menampilkan jumlah token dari objek str
		System.out.println(str.countTokens());
		
		//Menampilkan seluruh token secara terpisah
		while(str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}
	}

}
