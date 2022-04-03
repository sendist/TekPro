public class Barang {
	String kode_barang;
	String nama_barang;
	
	//Mengubah access modifier menjadi private
	private int stok;
	
	//Menambahkan method tambahStok untuk melakukan operasi
	//aritmatika penambahan saja
	public void tambahStok(int stk) {
		this.stok += stk;
	}
	
	//Menambahkan method getter 
	public int getStok() {
		return this.stok;
	}
	
	public Barang(String kode, String nama, int stk) {
		kode_barang = kode;
		nama_barang = nama;
		stok = stk;
	}
}
