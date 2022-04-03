public class Komputer {
	private String brand;
	
	/*
	 * RAM dan CPU memiliki hubungan part-of dengan komputer
	 * Tanpa RAM dan CPU Komputer tidak dapat berfungsi
	 */

	private RAM ram;
	private CPU cpu;

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public RAM getRam() {
		return ram;
	}
	public void setRam(RAM ram) {
		this.ram = ram;
	}
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
}
