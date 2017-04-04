public class Utama {
	/*float hargaBarang = 1500;

	public Utama (float hargasatuan, float hargaBarang){
			super(hargasatuan);
	}

	public void harga(){
			System.out.println("Harga Barang Baru per Satuan Rp. "+super.hargaBarang);
			System.out.println("Harga Barang Lama per Satuan Rp. "+hargaBarang);
	}


	public void hargabarang(){
		super.harga();
		harga();
	}*/

	public static void main (String[] args){
		BarangBaru barangbaru = new BarangBaru();
		BarangLama baranglama = new BarangLama();

		System.out.println("");
		System.out.println("Barang Baru :");
		System.out.println("");
		barangbaru.harga();
		barangbaru.jumlah(5,3500);
		System.out.println("Total Harga Rp. "+barangbaru.total);
		System.out.println("");
		barangbaru.ditata();
		System.out.println("");
		barangbaru.dipakai();
		System.out.println("");
		System.out.println("==========================");
		System.out.println("");
		System.out.println("Barang Lama :");
		//System.out.println("");
		//System.out.println(baranglama.berserakan);
		System.out.println("");
		baranglama.harga();
		baranglama.jumlah(5,3500,45);
		System.out.println("Total Harga Rp. "+baranglama.total+" dengan diskon 45%");
		System.out.println("");
		baranglama.ditata();
		System.out.println("");
		baranglama.dipakai();
		System.out.println("");
		//System.out.println(baranglama.daurulang);
	}
}

	class BarangBaru{
		public String namaBarang,jenisBarang,tokoBarang;
		public int banyakBarang;
		public float hargaBarang = 3500, total;

		/*public BarangBaru(float hargaBarang){
			this.hargaBarang = hargaBarang;
		}*/

		public void harga(){
			System.out.println("Harga Resmi Yang Dicantumkan Rp. "+hargaBarang);
		}
		
		public float jumlah(int banyakBarang, float hargaBarang){
			return total = banyakBarang * hargaBarang;
			
		}

		public void ditata(){
			namaBarang = "Gelas";
			jenisBarang = "Kaca";
			banyakBarang = 5;
			tokoBarang = "Pasar Gasibu";

			System.out.println(+banyakBarang+" buah "+namaBarang+jenisBarang+" yang dibeli di "+tokoBarang+"\nDengan total harga Rp. "+total+" ditata dengan rapi di Rak");
		}

		public void dipakai(){
			namaBarang = "Gelas";
			jenisBarang = "Kaca";
			banyakBarang = 5;
			tokoBarang = "Pasar Gasibu";
			
			System.out.println(+banyakBarang+" buah "+namaBarang+jenisBarang+" yang dibeli di "+tokoBarang+"\nDengan total harga Rp. "+total+" merupakan barang baru");
		}
	}

	class BarangLama extends BarangBaru{
		//public String berserakan, daurulang;
		public float diskon, jumlahharga;

		/*berserakan = "Barang yang sudah tidak terpakai dijual ke tukang loak agar tidak berserakan";
		daurulang = "Barang yang sudah tidak terpakai didaur ulang menjadi barang baru yang layak pakai";

		public BarangLama(String berserakan, String daurulang){
			System.out.println(berserakan);
			System.out.println(daurulang);
		}*/

		/*public BarangLama(float hargaBarang){
			super(hargaBarang);
		}*/

		//@override
		public float jumlah(int banyakBarang, float hargaBarang, float diskon){
			jumlahharga  = banyakBarang * hargaBarang;
			return total = jumlahharga - diskon / 100 * jumlahharga;
		}

		//@override
		public void ditata(){
			namaBarang = "Gelas";
			jenisBarang = "Kaca";
			banyakBarang = 5;

			System.out.println(+banyakBarang+" buah "+namaBarang+jenisBarang+" yang masih layak pakai ditata untuk dijual kembali");
		}

		//@override
		public void dipakai(){
			namaBarang = "Gelas";
			jenisBarang = "Kaca";
			banyakBarang = 5;

			System.out.println(+banyakBarang+" buah "+namaBarang+jenisBarang+" sudah tidak dipakai");
		}
	}
