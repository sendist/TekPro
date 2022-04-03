public class Furnitur {
	private String nama;
	private int harga;
	
	public Furnitur(String nama, int harga) {
		this.nama = nama;
		this.harga = harga;
	}

	public String getNama() {
		return nama;
	}

	public int getHarga() {
		return harga;
	}
	
	@Override
	public String toString() {
		return nama;
	}
}
