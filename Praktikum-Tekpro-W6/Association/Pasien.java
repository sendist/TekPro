public class Pasien {
	private String nama;
	private int usia;

	public Pasien(String nama, int usia) {
		this.nama = nama;
		this.usia = usia;
	}
	
	@Override
	public String toString() {
		return nama + " (" + usia + ")";
	}
}
