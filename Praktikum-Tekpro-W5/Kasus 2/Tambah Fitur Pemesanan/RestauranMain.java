public class RestaurantMain {

	public static void main(String[] args) {
		Restaurant menu = new Restaurant();
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Molen", 1_000, 20);

    //kondisi awal menu makanan
		menu.tampilMenuMakanan();
		
    //Memesan beberapa makanan
		menu.pesanMakanan("Bala-Bala", 5);
		menu.pesanMakanan("Tahu", 5);
		menu.pesanMakanan("Molen", 21);
		menu.pesanMakanan("Molen", 20);

    //Kondisi akhir menu makanan
		menu.tampilMenuMakanan();
	}

}
