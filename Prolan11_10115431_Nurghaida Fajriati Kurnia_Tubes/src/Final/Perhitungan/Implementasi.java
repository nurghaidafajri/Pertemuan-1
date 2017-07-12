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
                jumbarInteger.setBarang (5);
                
                System.out.println("\n===================================\n");
                System.out.println("Jumlah tidak terpenuhi, sisa barang "+jumbarInteger.getBarang());
                System.out.println("Untuk lebih detail silahkan jalankan");
                System.out.println("kembali program dan pilih menu A");
                System.out.println("[VIEW SISA BARANG]");
                System.out.println("\n===================================\n");
                System.out.print("Banyak Barang\t\t= ");
                banyak = input.nextInt();
            }
            enk.setBanyakBarang(banyak);
    }
    
    @Override
    public void submenu() {
        System.out.println("\n===================================\n");

	System.out.println("Tampilkan Berdasarkan");
	System.out.println("A. Barang Baru");
	System.out.println("B. Barang Bekas");
	System.out.print("Pilih [A..B] = ");
            pilih = input.next().charAt(0);

	System.out.println("\n===================================\n");

        switch (pilih) {
            case 'A':
            case 'a':
                System.out.println("Total Bayar = Rp. "+brg.totalBayar(enk.getBanyakBarang(),enk.getHarga(),enk.getDiskon()));
                brg.baru(enk.getBanyakBarang(), enk.getNama(), enk.getTipe(), enk.getMerk());
                break;
            case 'B':
            case 'b':
                System.out.println("Total Bayar = Rp. "+brg.totalBayarBekas(enk.getBanyakBarang(),enk.getHarga(),enk.getDiskon()));
                brg.bekas(enk.getBanyakBarang(), enk.getNama(), enk.getTipe(), enk.getMerk());
                break;
                
            default:
                System.out.println("Tidak Ada");
                break;
        }
        
    }
 
    @Override
    public void menu(){

	System.out.println("           MENU UTAMA             \n");
	System.out.println("A. View Sisa Barang");
	System.out.println("B. Beli Barang");
	System.out.print("Pilih [A..B] = ");
            pilih = input.next().charAt(0);

        switch (pilih) {
            case 'A': 
            case 'a': 
                sisa(); 
                break;
            case 'B': 
            case 'b': 
                data();
                submenu();
                break;
            default:
                System.out.println("Tidak Ada");
                break;
        }
    }    
    
    @Override
    public void end() {
        System.out.println("\n===================================\n");
        System.out.println("          End of Aplication");
        System.out.println("\n===================================\n");
    }   
}
