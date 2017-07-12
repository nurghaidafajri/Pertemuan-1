package Final.Perhitungan;

import Final.DataBarang.BarangInterface;
import Final.DataBarang.Enkapsulasi;
import Final.DataBarang.SisaBarang;



import java.util.Scanner;


public class Implementasi implements BarangInterface{
    int banyak;
    char pilih;
    
    Enkapsulasi enk = new Enkapsulasi();
    JualBarang brg = new JualBarang();
    
    SisaBarang<String> namaString = new SisaBarang<>();
    SisaBarang<String> merkString = new SisaBarang<>();
    SisaBarang<String> typeString = new SisaBarang<>();
    SisaBarang<Integer> jumbarInteger = new SisaBarang<>();
    
    Scanner input = new Scanner (System.in);
    
    @Override
    public void sisa(){
        System.out.println("\n===================================\n");
        System.out.println("           SISA BARANG             \n");
        namaString.setBarang ("Laptop");
        System.out.println("Nama Barang\t= "+namaString.getBarang());
        merkString.setBarang ("ASUS");
        System.out.println("Merk "+namaString.getBarang()+"\t= "+merkString.getBarang());
        typeString.setBarang ("X455L");
        System.out.println("Type "+namaString.getBarang()+"\t= "+typeString.getBarang());
        jumbarInteger.setBarang (5);
        System.out.println("Jumlah Barang\t= "+jumbarInteger.getBarang());   
    }
    @Override
    public void data() {
        System.out.println("\n===================================\n");
        System.out.println("           BELI BARANG             \n");

	System.out.println("Nama Barang\t\t= "+enk.getNama());
	System.out.println("Tipe "+enk.getNama()+"\t\t= "+enk.getTipe());
	System.out.println("Harga Barang\t\t= "+enk.getHarga());
	System.out.println("Diskon Harga\t\t= "+enk.getDiskon());
	System.out.print("Banyak Barang\t\t= ");
            banyak = input.nextInt();
            while (banyak > 5){
                System.out.println("Jumlah tidak terpenuhi");
                System.out.print("Banyak Barang\t\t= ");
                banyak = input.nextInt();
            }
            enk.setBanyakBarang(banyak);

	//System.out.println("\n===================================\n");
    }

    @Override
    public void menu() {
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
        }
	else if (pilih == 'B' || pilih == 'b'){
            System.out.println("Total Bayar = Rp. "+brg.totalBayarBekas(enk.getBanyakBarang(),enk.getHarga(),enk.getDiskon()));
            brg.bekas(enk.getBanyakBarang(), enk.getNama(), enk.getTipe(), enk.getMerk());
	}
	else{
            System.out.println("Tidak Ada");
	}
		
        System.out.println("\n===================================\n");    }

    @Override
    public void end() {
        System.out.println("Terimakasih Atas Pembeliannya");
        System.out.println("\n===================================\n");
    }
    
}
