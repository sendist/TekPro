public class Nasabah {
	private String nama;
	private String Id;
	private long saldo;
	
	public Nasabah (String nama, String Id, long saldo) {
		this.nama = nama;
		this.Id = Id;
		this.saldo = saldo;
	}

	public long getSaldo() {
		return saldo;
	}

	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}

	public String getNama() {
		return nama;
	}

	public String getId() {
		return Id;
	}
}
