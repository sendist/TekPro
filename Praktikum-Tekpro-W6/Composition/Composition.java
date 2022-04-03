
public class Composition {

	public static void main(String[] args) {
		Komputer komputer = new Komputer();
		komputer.setBrand("Lenovo");
		
		CPU cpu = new CPU("AMD Ryzen", 8);
		RAM ram = new RAM("Corsair", 64);
		
		komputer.setCpu(cpu);
		komputer.setRam(ram);
		
		System.out.println("Komputer " + komputer.getBrand() + " Menggunakan CPU " + komputer.getCpu() + " dan menggunakan RAM " + komputer.getRam());
	}

}
