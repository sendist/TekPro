public class RAM {
	private String brand;
	private int capacity;
	
	public RAM(String brand, int capacity) {
		this.brand = brand;
		this.capacity = capacity;
	}
	
	@Override
	public String toString() {
		return brand + " (" + capacity + " GB)";
	}
}
