package Final.Tampil;

import Final.DataBarang.BarangInterface;
import Final.Perhitungan.Implementasi;

public class Utama {    
    public static void main(String[] args) {

        BarangInterface inf = new Implementasi();
       	System.out.println("\n===================================");
        System.out.println("|           TUGAS BESAR           |");
        System.out.println("|     NURGHAIDA FK - 10115431     |");
        System.out.println("===================================\n");

        inf.menu();
        inf.end();
    }  
}
