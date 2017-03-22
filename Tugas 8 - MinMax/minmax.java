import java.util.Scanner;
public class minmax {
	int n = 5, muncul = 0, nilai[] = new int[n];

	public void pilihanA(){
			//System.out.println("A");
			int i, min = nilai[0];
			for (i = 0; i < n;i++){
				if(min > nilai[i]){
					min = nilai[i];
				}	
			}

			for(i = 0; i < n; i++){
				if(nilai[i] == min){
					muncul++;	
				}
			}
			System.out.println("Nilai Minimum = "+min);
			System.out.println("Banyaknya Nilai = "+muncul);
		}

		public void pilihanB(){
			//System.out.println("B");
			int i, max = nilai[0];
			for (i = 0; i < n;i++){
				if(max < nilai[i]){
					max = nilai[i];
				}	
			}
			for (i = 0; i < n; i++)
			{
				if(nilai[i] == max){
					muncul++;
				}
			}
			System.out.println("Nilai Maximum = "+max);
			System.out.println("Banyaknya Nilai "+muncul);
		}

	public static void main (String[] args){
		Scanner input = new Scanner (System.in);

		minmax pil = new minmax();

		int i, n = 5;
		
		char pilihan;

		for (i = 0; i < n;i++){
			System.out.print("Masukkan Nilai : ");
			pil.nilai[i] = input.nextInt();	
		}

		System.out.println("A : Nilai Minimum");
		System.out.println("B : Nilai Maximum");
		System.out.print("Masukkan Pilihan Anda [A/B]: ");
			pilihan = input.next().charAt(0);
		
		if(pilihan == 'A' || pilihan == 'a'){
			pil.pilihanA();
		}
		else if (pilihan == 'B' || pilihan == 'b'){
			pil.pilihanB();
		}
		else{
			System.out.println("Menu Tidak Ada");
		}
	}
}

