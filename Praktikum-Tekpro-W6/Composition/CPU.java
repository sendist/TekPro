public class CPU {
	private String brand;
	private int cores;

	public CPU(String brand, int cores) {
		this.brand = brand;
		this.cores = cores;
	}
	
	@Override
	public String toString() {
		return brand + " (" + cores + "cores)";
	}

}
