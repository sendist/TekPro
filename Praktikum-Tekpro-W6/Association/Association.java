import java.util.LinkedList;

public class Association {

	public static void main(String[] args) {
		Dokter dokter = new Dokter();
		dokter.setNama("Ahmad Subari");
		
		Pasien pasien = new Pasien("Siti Suminah", 37);
		Pasien pasien2 = new Pasien("Heru Pratama", 26);
		
		LinkedList<Pasien> listPasien = new LinkedList<Pasien>();
		listPasien.offer(pasien);
		listPasien.offer(pasien2);
		
		dokter.setPasien(listPasien);
		
		System.out.println(dokter.getPasien() + " Merupakan pasien dari dokter " + dokter.getNama());
	}

}
