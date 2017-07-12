package Final.Perhitungan;

import Final.DataBarang.Barang;


public class JualBarang extends Barang{

    @Override
	public double totalBayar(int banyakbarang, double hargabarang, double diskonbarang){
            return total1 = banyakbarang * hargabarang;	
	}
    @Override
	public double totalBayarBekas(int banyakbarang, double hargabarang, double diskonbarang){
            return total2 = banyakbarang * (hargabarang - hargabarang*diskonbarang) ;	
	}

    @Override
        public void baru(int banyakbarang, String namabarang, String tipebarang, String merkbarang){
            System.out.println(+banyakbarang+" buah "+namabarang+" baru "+merkbarang+" tipe "+tipebarang+"\nterjual");
	}

    @Override
	public void bekas(int banyakbarang, String namabarang, String tipebarang, String merkbarang){
            System.out.println(+banyakbarang+" buah "+namabarang+" bekas "+merkbarang+" tipe "+tipebarang+"\nterjual");
	}
    
}
