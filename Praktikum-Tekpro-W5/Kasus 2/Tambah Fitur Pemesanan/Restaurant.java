public class Restaurant {
	
	//Desain yang telah ada
	public String[] nama_makanan;
	public double[] harga_makanan;
	public int[] stok;
	public static byte id = 0;
	
	public Restaurant() {
		nama_makanan = new String[10];
		harga_makanan = new double[10];
		stok = new int[10];
	}
	
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		this.nama_makanan[id] = nama; 
		this.harga_makanan[id] = harga;
		this.stok[id] = stok;
	}
	
	public void tampilMenuMakanan() {
		for(int i = 0; i <= id; i++) {
			if(!isOutOfStock(i)) {
				System.out.println(nama_makanan[i] +"["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);
			}
		}
	}
	
	public boolean isOutOfStock(int id) {
		if(stok[id] == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void nextId() {
		id++;
	}

	//Akhir dari desain yang telah ada
	
	/* Penambahan fitur baru */
	//Method untuk mencari id makanan dengan referensi berupa nama makanan
	public byte getIdMakanan(String namaMakanan) {
		byte ID = -1;
		for(byte i = 0; i <= id; i++) {
			if(this.nama_makanan[i] == namaMakanan) {
				ID = i;
				break;
			}
		}
		return ID;
	}

	//Method untuk memesan makanan dan mengurangi stoknya
	//Jika stok == 0 maka  pesanan tidak bisa dilakukan 
	//Jika stok >= jumlahPesanan maka pesanan berhasil dan stok barang dikurangi dengan jumlahPesanan
	//Jika 0 < stok < jumlahPesanan maka jika tetap ingin membeli harus memesan ulang sebanyak maksimal stok yang tersisa saja.
	
	public void pesanMakanan(String nama, int jumlahPesanan) {
		if(stok[getIdMakanan(nama)] == 0) {
			System.out.println("Stok " + nama + " kosong, tidak dapat dipesan");
		} else if(stok[getIdMakanan(nama)] >= jumlahPesanan){
			stok[getIdMakanan(nama)] -= jumlahPesanan;
			System.out.println("Berhasil memesan " + jumlahPesanan + " " + nama);
		} else {
			System.out.println("Stok " + nama + " tersisa " + stok[getIdMakanan(nama)] + " buah, jika ingin memesan pesan lagi dengan jumlah maksimal stok yang tersisa.");
		}
	}
}
