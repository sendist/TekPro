import java.util.Scanner;

public class Berhitung {

	public static void main(String[] args) {
		
		//Membuat objek scanner
		Scanner input = new Scanner(System.in);

		//Deklarasi kamus data
		short A, B;
		String operator;
		int hasil = 0;
		
		//Input data
		A = input.nextShort();
		operator = input.next();
		B = input.nextShort();
	
		//Selection untuk operasi yang diinginkan sesuai inputan variabel operator
		switch(operator) {
		case "+" : hasil = A + B; break;
		case "-" : hasil = A - B; break;
		case "*" : hasil = A * B; break;
		case "/" : hasil = A / B; break;
		case "%" : hasil = A % B; 
		}
		
		System.out.println(hasil);
	}
}
