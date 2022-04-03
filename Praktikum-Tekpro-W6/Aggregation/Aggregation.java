import java.util.ArrayList;

public class Aggregation {

	public static void main(String[] args) {
		Rumah rumah = new Rumah("Cimahi", 90, 80);
		
		Furnitur furnitur = new Furnitur("Lemari", 1000000);
		Furnitur furnitur2 = new Furnitur("Meja", 500000);
		Furnitur furnitur3 = new Furnitur("Kursi", 200000);
		Furnitur furnitur4 = new Furnitur("Rak", 100000);
		
		ArrayList<Furnitur> listFurnitur= new ArrayList<Furnitur>();
		listFurnitur.add(furnitur);
		listFurnitur.add(furnitur2);
		listFurnitur.add(furnitur3);
		listFurnitur.add(furnitur4);
		
		rumah.setFurnitur(listFurnitur);
		
		System.out.println("Rumah ini memiliki beberapa furnitur, yaitu: " + rumah.getFurnitur());
	}

}
