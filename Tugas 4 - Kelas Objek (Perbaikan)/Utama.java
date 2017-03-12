public class Utama{
	public static void main (String[] args){
		BarangBaru brg = new BarangBaru();
		Sampah takterpakai = new Sampah();

		System.out.println("");
		brg.ditata();
		System.out.println("");
		takterpakai.berserakan();
	}
}


	class BarangBaru{
		private String namaBarang,jenisBarang,tokoBarang;
		private int banyakBarang, hargaBarang;


		public void ditata(){
			namaBarang = "Gelas";
			jenisBarang = "Kaca";
			banyakBarang = 5;
			tokoBarang = "Pasar Gasibu";
			hargaBarang = 15000;

			System.out.println(+banyakBarang+" buah "+namaBarang+jenisBarang+" yang dibeli di "+tokoBarang+"\nDengan harga Rp. "+hargaBarang+" ditata dengan rapi di Rak");
		}

		public void dipakai(){
			namaBarang = "Gelas";
			jenisBarang = "Kaca";
			banyakBarang = 5;
			tokoBarang = "Pasar Gasibu";
			hargaBarang = 15000;
			
			System.out.println(+banyakBarang+" buah "+namaBarang+jenisBarang+" yang dibeli di "+tokoBarang+"\nDengan harga Rp. "+hargaBarang+" masih bisa dipakai");
		}
	}

	class Sampah{
		private String jenissampah;

		public void berserakan(){

			System.out.println("Barang yang sudah tidak terpakai dijual ke tukang loak agar tidak berserakan");
		}

		public void daurulang(){
			System.out.println("Barang yang sudah tidak terpakai didaur ulang menjadi barang baru yang layak pakai");
		}
 
	}
