
package Generik;

//import java.util.Scanner;

public class Utama {

    
    public static void main(String[] args) {
        //int banyak;
        //char pilih;
        BarangInterface inf = new Implementasi();
        
        //Scanner input = new Scanner (System.in);
        
        
        inf.sisa();
        inf.data();
        inf.menu();
        inf.end();
    }  
}
