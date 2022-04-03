import java.util.ArrayList;

public class Rumah {
	private String lokasi;
	private int luasTanah;
	private int luasBangunan;
	
	/* 
	 * Rumah memiliki furnitur, tetapi tanpa furnitur rumah tetaplah ada
	 * begitu juga sebaliknya, furnitur bisa tetap ada walaupun tidak ada rumah
	 */
	private ArrayList<Furnitur> furnitur;
	
	public Rumah(String lokasi, int luasTanah, int luasBangunan) {
		this.lokasi = lokasi;
		this.luasBangunan = luasBangunan;
		this.luasTanah = luasTanah;
	}

	public ArrayList<Furnitur> getFurnitur() {
		return furnitur;
	}

	public void setFurnitur(ArrayList<Furnitur> furnitur) {
		this.furnitur = furnitur;
	}

	public String getLokasi() {
		return lokasi;
	}

	public int getLuasTanah() {
		return luasTanah;
	}

	public int getLuasBangunan() {
		return luasBangunan;
	}
}