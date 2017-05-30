
package Generik;

import java.util.Scanner;

public class Utama {

    
    public static void main(String[] args) {
        //int banyak;
        //char pilih;
        BarangInterface inf = new Implementasi();
        SisaBarang<String> namaString = new SisaBarang<>();
        SisaBarang<String> merkString = new SisaBarang<>();
        SisaBarang<String> typeString = new SisaBarang<>();
        SisaBarang<Integer> jumbarInteger = new SisaBarang<>();
        Scanner input = new Scanner (System.in);
        
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
        
        
        inf.data();
        inf.menu();
        inf.end();
    }  
}
