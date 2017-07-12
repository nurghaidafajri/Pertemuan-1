
package Final.Tampil;

//import java.util.Scanner;
import Final.DataBarang.BarangInterface;
import Final.Perhitungan.Implementasi;
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
