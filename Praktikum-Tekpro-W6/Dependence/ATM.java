public class ATM {
	private String namaBank;
	private String lokasi;
	
	/*
	 * Method tarikTunai menggunakan objek dari Nasabah sebagai parameter
	 * field dari Nasbah juga digunakan dalam proses method tarikTunai
	 */
	public void tarikTunai(Nasabah nasabah, long jumlah) {
		if(jumlah <= nasabah.getSaldo()) {
			nasabah.setSaldo(nasabah.getSaldo() - jumlah);
			System.out.println("Berhasil menarik uang sejumlah: " + jumlah + " Sisa saldo anda: " + nasabah.getSaldo());
		} else {
			System.out.println("Saldo anda adalah: " + nasabah.getSaldo() + " Tidak bisa melakukan penarikan lebih dari itu.");
		}
	}

	public String getNamaBank() {
		return namaBank;
	}

	public void setNamaBank(String namaBank) {
		this.namaBank = namaBank;
	}

	public String getLokasi() {
		return lokasi;
	}

	public void setLokasi(String lokasi) {
		this.lokasi = lokasi;
	}
}
