import java.util.Scanner;
public class Utama {


	public static void main (String[] args){
		int banyak;
		char pilih;

		JualBarang brg = new JualBarang();
		Enkapsulasi enk = new Enkapsulasi();
		Scanner input = new Scanner (System.in);

		System.out.println("\n===================================\n");

		System.out.println("Nama Barang\t\t= "+enk.getNama());
		System.out.println("Tipe "+enk.getNama()+"\t\t= "+enk.getTipe());
		System.out.println("Harga Barang\t\t= "+enk.getHarga());
		System.out.println("Diskon Harga\t\t= "+enk.getDiskon());
		System.out.print("Banyak Barang\t\t= ");
			banyak = input.nextInt();
			enk.setBanyakBarang(banyak);

		System.out.println("\n===================================\n");

		System.out.println("Tampilkan Berdasarkan");
		System.out.println("A. Barang Baru");
		System.out.println("B. Barang Bekas");
		System.out.print("Pilih [A..B] = ");
			pilih = input.next().charAt(0);

		System.out.println("\n===================================\n");

		if (pilih == 'A' || pilih == 'a'){
			System.out.println("Total Bayar = Rp. "+brg.totalBayar(enk.getBanyakBarang(),enk.getHarga(),enk.getDiskon()));
			brg.baru(enk.getBanyakBarang(), enk.getNama(), enk.getTipe(), enk.getMerk());
		
		else if (pilih == 'B' || pilih == 'b'){
			System.out.println("Total Bayar = Rp. "+brg.totalBayarBekas(enk.getBanyakBarang(),enk.getHarga(),enk.getDiskon()));
			brg.bekas(enk.getBanyakBarang(), enk.getNama(), enk.getTipe(), enk.getMerk());
		}
		else{
			System.out.println("Tidak Ada");
		}

		System.out.println("\n===================================\n");
	}
}

	class Enkapsulasi{
		private String nama,tipe,merk;
		private int banyakbarang;
		private double harga, diskon;

		public String getNama(){
			return nama = "Laptop";
		}

		public String getTipe(){
			return tipe = "X455L";
		}

		public String getMerk(){
			return merk = "ASUS";
		}

		public int getBanyakBarang(){
			return banyakbarang;
		}

		public void setBanyakBarang(int banyakbarang){
			this.banyakbarang = banyakbarang;
		}

		public double getHarga(){
			return harga = 4500000;
		}

		public double getDiskon(){
			return diskon = 0.25;
		}

	}

	abstract class Barang{
		protected double total1, total2;

		protected abstract double totalBayar(int banyakbarang, double hargabarang, double diskonbarang);
		protected abstract double totalBayarBekas(int banyakbarang, double hargabarang, double diskonbarang);
		protected abstract void baru(int banyakbarang, String namabarang, String tipebarang, String merkbarang);
		protected abstract void bekas(int banyakbarang, String namabarang, String tipebarang, String merkbarang);

	}

	class JualBarang extends Barang{

		//@override
		public double totalBayar(int banyakbarang, double hargabarang, double diskonbarang){
			return total1 = banyakbarang * hargabarang;	
		}

		public double totalBayarBekas(int banyakbarang, double hargabarang, double diskonbarang){
			return total2 = banyakbarang * (hargabarang - hargabarang*diskonbarang) ;	
		}

		//@override
		public void baru(int banyakbarang, String namabarang, String tipebarang, String merkbarang){

			System.out.println(+banyakbarang+" buah "+namabarang+" baru "+merkbarang+" tipe "+tipebarang+"\nterjual");
		}

		//@override
		public void bekas(int banyakbarang, String namabarang, String tipebarang, String merkbarang){
			
			System.out.println(+banyakbarang+" buah "+namabarang+" bekas "+merkbarang+" tipe "+tipebarang+"\nterjual");
		}
	}
