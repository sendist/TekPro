package dataTypes;
import java.util.*;

public class DataTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Mengambil nilai variable T terlebih dahulu untuk menentukan ukuran array
        int counter = 0, T = input.nextInt();

        //Inisialisasi array sesuai banyaknya Test case T
        long[] arr = new long[T];
        boolean[] tooLarge = new boolean[T];
        String[] stringNumber = new String[T];

        //Mengambil Inputan data sebanyak test case
        for(counter = counter; counter < T; counter++) {

            /*
             * Menggunakan try and catch untuk mengatasi exception saat 
             * inputan string tidak bisa dirubah menjadi tipe long
             */
            try{
                stringNumber[counter] = input.next();
                arr[counter] = Long.parseLong(stringNumber[counter]);
                tooLarge[counter] = false;
            }
            catch(NumberFormatException ex) {
                tooLarge[counter] = true;
            }
        }

        //Menentukan tipe data yang dapat menampung input data
        for(int i = 0; i < T; i++) {
            //Menentukan ada tidaknya tipe data yang bisa menampung input
            if(tooLarge[i] == false) {
                System.out.println(stringNumber[i] + " can be fitted in:");
            } else{
                System.out.println(stringNumber[i] + " can't be fitted anywhere.");
            }

            //Menentukan tipe data apa saja yang bisa menampungnya
            if(arr[i] > -32768 && arr[i] < 32767 && tooLarge[i] == false) {
                System.out.println("* short");
            }
            if(arr[i] > -2147483648 && arr[i] < 2147483647 && tooLarge[i] == false) {
                System.out.println("* int");
            } 
            if(tooLarge[i] == false){
                System.out.println("* long");
            }
        }
    }
}
 
