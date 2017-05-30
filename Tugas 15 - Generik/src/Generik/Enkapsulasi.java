package Generik;


public class Enkapsulasi {
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
