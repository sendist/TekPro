import java.util.LinkedList;

public class Dokter {
	private String nama;
	
	//Hubungan antara dokter dengan pasien (dokter berkomunikasi dengan beberapa pasien)
	LinkedList<Pasien> pasien;

	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public LinkedList<Pasien> getPasien() {
		return pasien;
	}
	public void setPasien(LinkedList<Pasien> pasien) {
		this.pasien = pasien;
	}

}
