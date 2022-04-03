import java.util.Scanner;

public class BukaTutupJalan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Kamus data
		long gabungPlat = 0;
		
		/*
		 * Mengambil inputan sekaligus menggabungkannya
		 * karena gabungan angka akan menjadi 16 digit maka
		 * inputan 4 digit pertama akan dikalikan dengan 10^12 
		 * supaya menjadi bilangan 16 digit
		 * inputan 4 digit selanjunya akan dikali dengan 10^8 dan seterusnya
		 */
		for(int i = 0; i < 4; i++) {
			gabungPlat += input.nextLong() * Math.pow(10, (12 - (i*4)));
		}
		
		//konsisi yang menentukan apakah mobil dari arah sebrang berhenti atau jalan
		if((gabungPlat - 999999) % 5 == 0) {
			System.out.println("jalan");
		} else {
			System.out.println("berhenti");
		}
	}
}
