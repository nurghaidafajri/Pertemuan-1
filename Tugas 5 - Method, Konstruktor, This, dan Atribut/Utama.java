public class Utama{
	public static void main (String[] args){
		BarangBaru brg = new BarangBaru();
		Sampah takterpakai = new Sampah();

		System.out.println("");
		brg.jumlah(5,3500);
		brg.ditata();
		System.out.println("");
		System.out.println(takterpakai.berserakan);
	}
}


	class BarangBaru{
		private String namaBarang,jenisBarang,tokoBarang;
		private int banyakBarang, hargaBarang, total;

		public void harga(int hargaBarang){
			hargaBarang = 3500;
			this.hargaBarang = hargaBarang;
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
