public class MDArrayJava {

	public static void main(String[] args) {
		//One Dimensional Arrays
		int[] firstArray = {2, 5, 3};
		int[] secondArray = {9, 5, 3};
		int[] thirdArray = {2, 4, 9};
		int[] fourthArray = {10, 11, 12};
		int[] fifthArray = {13, 14, 15};
		int[] sixthArray = {16, 17, 18};
		int[] seventhArray = {19, 20, 21};
		int[] eightArray = {22, 23, 24};
		int[] ninthArray = {25, 26, 27};
		
		//Two Dimensional Arrays
		int[][] twoDimensionalArray1 = {firstArray, secondArray, thirdArray};
		int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
		int[][] twoDimensionalArray3 = {seventhArray, eightArray, ninthArray};
		
		//Three Dimensional Array
		int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};
		
		//Print array
		//Menggunakan for loop untuk bagian terluar array
		for(int i = 0; i < threeDimensionalArray.length; i++) {
			System.out.print("{");
			
			//For loop untuk bagian kedua dari array
			for(int j = 0; j < threeDimensionalArray[i].length; j++) {
				System.out.print("{");
				
				//Menggunakan for each loop untuk bagian terdalam array
				for(int k : threeDimensionalArray[i][j]) {
					System.out.print(k + " ");
				}
				System.out.print("} ");
			}
			System.out.printf("}%n");
		}
	}
}
