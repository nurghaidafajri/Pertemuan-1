public class Utama extends BarangBaru{
	int hargaBarang = 5000;

	public Utama (int hargasatuan){
		super(hargasatuan);
	}

	public void harga(){
			System.out.println("Harga Asli Satuan Barang Rp. "+hargaBarang);
			System.out.println("Harga Satuan Barang Setelah Harga Asli Didiskon Rp. "+super.hargaBarang);
		}


	public void hargabarang(){
		super.harga();
		harga();
	}

	public static void main (String[] args){
		Utama brg = new Utama(3500);
		Sampah takterpakai = new Sampah();

		System.out.println("");
		brg.jumlah(5,3500);
		System.out.println("");
		brg.ditata();
		System.out.println("");
		brg.hargabarang();
		System.out.println("");
		System.out.println(takterpakai.berserakan);
	}
}


	class BarangBaru{
		private String namaBarang,jenisBarang,tokoBarang;
		private int banyakBarang, total;
		public int hargaBarang = 3500;

		BarangBaru(int hargaBarang){
			this.hargaBarang = hargaBarang;
		}

		public void harga(){
			System.out.println("Harga Resmi Yang Dicantumkan Rp. "+hargaBarang);
		}

		
		public int jumlah(int banyakBarang, int hargaBarang){
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
			
			System.out.println(+banyakBarang+" buah "+namaBarang+jenisBarang+" yang dibeli di "+tokoBarang+"\nDengan total harga Rp. "+total+" masih bisa dipakai");
		}
	}

	class Sampah{
		protected String jenissampah, berserakan, daurulang;

		Sampah(){
			jenissampah = "Organik dan Anorganik";
			berserakan = "Barang yang sudah tidak terpakai dijual ke tukang loak agar tidak berserakan";
			daurulang = "Barang yang sudah tidak terpakai didaur ulang menjadi barang baru yang layak pakai";
		}
	}
