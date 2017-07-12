package Final.DataBarang;

public abstract class Barang{
    protected double total1, total2;

	protected abstract double totalBayar(int banyakbarang, double hargabarang, double diskonbarang);
	protected abstract double totalBayarBekas(int banyakbarang, double hargabarang, double diskonbarang);
	protected abstract void baru(int banyakbarang, String namabarang, String tipebarang, String merkbarang);
	protected abstract void bekas(int banyakbarang, String namabarang, String tipebarang, String merkbarang);
}
