public class Sasuke extends Itachi {
	String Dojutsu = "Sharingan";
	
	void printDojutsu() {

		//Akan memanggil modul printDojutsu() dari super class
		super.printDojutsu();

		System.out.println(this.Dojutsu);
	}
}
