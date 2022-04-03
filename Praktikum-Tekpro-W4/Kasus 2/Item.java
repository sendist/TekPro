public class Item {
	private String name;
	private Item() {
		name = "Ipin";
	}
	
	public Item(String name) {
		
		//Menambahkan statement this() sehingga akan ada constructor delegations
		//yang saya belum ketahui lebih lanjut
		this();
		
		System.out.println(this.name);
	}
}
