import java.util.Scanner;

public class InputOutput2 {

	public static void main(String[] args) {
		//Membuat objek scanner
		Scanner input = new Scanner(System.in);
		
		//Deklarasi kamus data
		String s[] = new String[3];
		int num[] = new int[3];
		
		//Mengambil 2 inputan dari satu baris
		//inputan kata dan inputan angka
		for(int i = 0; i < 3 ;i++) {
			s[i] = input.next();
			num[i] = input.nextInt();
		}
		
		System.out.println("==========================");
		
		/*
		 * Menampilkan inputan dengan format yang ditentukan
		 * %-15s berarti akan disediakan 15 tempat untuk string dan ditulis dari kiri
		 * %03d berarti format angka kedalam 3 digit angka
		 * %n berarti buat baris baru
		 */
		for(int j = 0; j < 3; j++) {
			System.out.printf("%-15s%03d%n", s[j], num[j]);
		}
		
		System.out.println("==========================");
	}

}
