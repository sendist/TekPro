public class Dependence {

	public static void main(String[] args) {
		ATM atm = new ATM();
		atm.setNamaBank("BRI");
		atm.setLokasi("Polban");

		Nasabah nasabah = new Nasabah("Sendi Setiawan", "111111111", 1000000);
		atm.tarikTunai(nasabah, 100000);
		atm.tarikTunai(nasabah, 1000000);
	}

}
