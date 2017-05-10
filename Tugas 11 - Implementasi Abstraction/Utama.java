import java.util.Scanner;
public class Utama {


	public static void main (String[] args){
		double harga, diskon;
		int banyak;
		String nama,jenis,toko;
		char pilih;

		BarangBaru baru = new BarangBaru();
		BarangLama lama = new BarangLama();
		Scanner input = new Scanner (System.in);

		System.out.print("Nama Toko\t\t= " );
			toko = input.nextLine();
		System.out.print("Nama Barang\t\t= ");
			nama = input.nextLine();
		System.out.print("Jenis Barang\t\t= ");
			jenis = input.nextLine();
		System.out.print("Banyak Barang\t\t= ");
			banyak = input.nextInt();
		System.out.print("Harga Barang\t\t= ");
			harga = input.nextDouble();
		System.out.print("Diskon (bentuk desimal) = ");
			diskon = input.nextDouble();

		System.out.println("Tampilkan Berdasarkan");
		System.out.println("A. Barang Baru");
		System.out.println("B. BarangLama");
		System.out.print("Pilih [A..B] = ");
			pilih = input.next().charAt(0);

		if (pilih == 'A' || pilih == 'a'){
			System.out.println("Total Bayar = "+baru.totalBayar(banyak, harga, diskon));
			baru.ditata(banyak, nama, jenis, toko);
			baru.dipakai(banyak, nama, jenis, toko);
		}
		else if (pilih == 'B' || pilih == 'b'){
			System.out.println("Total Bayar = "+lama.totalBayar(banyak, harga, diskon));
			lama.ditata(banyak, nama, jenis, toko);
			lama.dipakai(banyak, nama, jenis, toko);	
		}
		else{
			System.out.println("Tidak Ada");
		}

	}
}
	abstract class Barang{
		protected String namaBarang,jenisBarang,tokoBarang;
		protected int banyakBarang;
		protected double hargaBarang, total, diskonbarang;

		//protected abstract float harga();
		protected abstract double totalBayar(int banyakbarang, double hargabarang, double diskon);
		protected abstract void ditata(int banyakbarang, String namabarang, String jenisbarang, String namatoko);
		protected abstract void dipakai(int banyakbarang, String namabarang, String jenisbarang, String namatoko);

	}

	class BarangBaru extends Barang{
		
		public double totalBayar(int banyakbarang, double hargabarang, double diskonbarang){
			return total = banyakbarang * hargabarang;
			
		}

		public void ditata(int banyakbarang, String namabarang, String jenisbarang, String namatoko){

			System.out.println(+banyakbarang+" buah "+namabarang+" "+jenisbarang+" yang dibeli di "+namatoko+"\nDengan total harga Rp. "+total+" ditata dengan rapi di Rak");
		}

		public void dipakai(int banyakbarang, String namabarang, String jenisbarang, String namatoko){
			
			System.out.println(+banyakbarang+" buah "+namabarang+" "+jenisbarang+" yang dibeli di "+namatoko+"\nDengan total harga Rp. "+total+" merupakan barang baru");
		}
	}

	class BarangLama extends Barang{

		//@Override
		public double totalBayar(int banyakbarang, double hargabarang, double diskonbarang){
			return total = banyakbarang * (hargabarang - hargabarang * diskonbarang);
		}

		//@Override
		public void ditata(int banyakbarang, String namabarang, String jenisbarang, String namatoko){

			System.out.println(+banyakbarang+" buah "+namabarang+" "+jenisbarang+" yang masih layak pakai ditata untuk dijual kembali");
		}

		//@Override
		public void dipakai(int banyakbarang, String namabarang, String jenisbarang, String namatoko){

			System.out.println(+banyakbarang+" buah "+namabarang+" "+jenisbarang+" sudah tidak dipakai");
		}
	}
