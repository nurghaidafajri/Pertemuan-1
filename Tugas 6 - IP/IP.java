import java.util.Scanner;

public class IP {	
	public static void main(String[] args){
		IP mhs = new IP();
		Scanner input = new Scanner(System.in);
		float ip, jumlahip = 0, rata_rata = 0;
		int jumlahMhs = 0, salahip = 0, lulus = 0, tidaklulus = 0;
		
		System.out.print("Masukkan IP : ");
		ip = input.nextFloat();
		while (ip != -999){
			if (mhs.isWithinRange(ip, 0, 4) == 1){
				jumlahMhs++;
				jumlahip += ip;
				if (ip >= 2.75){
					lulus++;
				} 
				else{
					tidaklulus++;
				}
			}
			else{
			salahip++;
			}
			System.out.print("Masukkan IP : ");
			ip = input.nextFloat();
		}
		if (jumlahMhs != 0){
			rata_rata = jumlahip / jumlahMhs;
			System.out.println("Banyak Mahasiswa = "+jumlahMhs);
			System.out.println(+salahip+" IP salah, diabaikan");
			System.out.println("Banyaknya Yang Lulus = "+lulus);
			System.out.println("Banyaknya Yang Tidak Lulus = "+tidaklulus);
			System.out.println("IP Rata-rata = "+rata_rata);
		}
		else{
			System.out.println("Tidak ada data");
		}	
	}
	
	int isWithinRange(float x, float min, float max){
		if (x >= min && x <= max){
			return 1;
		}
		else{
			return 0;
		}
  	}	
} 