public class Restaurant {
  
  //Encapsulasi
	private Makanan menuMakanan[];
	private static byte id = 0;
	
	public Restaurant() {
    
    //Inisialisasi
		menuMakanan = new Makanan[10];
	}
	
	public void tambahMenuMakanan(String nama, double harga, int stok) {
    
    //Create objek dari class Makanan
		menuMakanan[id] = new Makanan();
    
    //Memanggil setter/mutator
		menuMakanan[id].setNama_makanan(nama);
		menuMakanan[id].setHarga_makanan(harga);
		menuMakanan[id].setStok(stok);
	}
	
	public void tampilMenuMakanan() {
		for(int i = 0; i <= id; i++) {
			if(!isOutOfStock(i)) {
        
        //Memanggil getter/accessor
				System.out.println(menuMakanan[i].getNama_makanan() + "[" + menuMakanan[i].getStok() + "]" + "\tRp. " + menuMakanan[i].getHarga_makanan());
			}
		}
	}
	
	public boolean isOutOfStock(int id) {
    
    //Mengambil nilai stok dengan getter/accessor
		if(menuMakanan[id].getStok() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void nextId() {
		id++;
	}
}
