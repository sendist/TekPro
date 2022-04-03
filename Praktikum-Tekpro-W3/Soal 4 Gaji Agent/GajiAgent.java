import java.util.Scanner;

public class GajiAgent {

	public static void main(String[] args) {
		
		//Membuat objek scanner
		Scanner input = new Scanner(System.in);
		
		//Deklarasi kamus data
		byte jmlPenjualan;
		int gaji = 500000;
		
		//Input data
		jmlPenjualan = input.nextByte();

		//Ketentuan bonus penjualan untuk penjualan dibawan 15 item
		if(jmlPenjualan < 15) {
			gaji -= (15-jmlPenjualan) * 50000 * 15 / 100;
			
			//Bonus penjualan untuk diatas 15 dan dibawah 40 item
		} else if(jmlPenjualan < 40) {
			gaji += jmlPenjualan * 50000 * 10 / 100;
			
			//Bonus penjualan untuk diatas 40 dan dibawah 80 item
		} else if(jmlPenjualan < 80) {
			gaji += jmlPenjualan * 50000 * 25 / 100;
			
			//Bonus penjualan untuk penjualan diatas 80 item
		} else {
			gaji += jmlPenjualan * 50000 * 35 / 100;
		}
		
		System.out.println(gaji);
		
	}
}
