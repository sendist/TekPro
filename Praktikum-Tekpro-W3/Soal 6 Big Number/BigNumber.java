import java.util.Scanner;
import java.math.BigInteger;

public class BigNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Kamus data
		BigInteger num1, num2;
		
		//Input data integer dan langsung mengubahnya ke BigInteger
		num1 = BigInteger.valueOf(input.nextInt());
		num2 = BigInteger.valueOf(input.nextInt());
		
		//Menampilkan hasil penjumlahan dan perkalian dari dua buah inputan
		System.out.println(num1.add(num2));
		System.out.println(num1.multiply(num2));
	}

}
