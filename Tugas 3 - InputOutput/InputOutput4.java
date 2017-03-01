import java.util.Scanner;
public class InputOutput4{
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		String nama;
		char jeniskelamin;
		int tinggibadan;
		boolean menikah;

		System.out.println("");
		System.out.print("\t\t================INPUT================\n");
		System.out.print("\t\tMasukkan Nama \t\t: ");
			nama = input.nextLine();
		System.out.print("\t\tMasukkan Jenis Kelamin \t: ");
			jeniskelamin = input.next().charAt(0);
		System.out.print("\t\tMasukkan Tinggi Badan \t: ");
			tinggibadan = input.nextInt();
		System.out.print("\t\tMasukkan Status Menikah : ");
			menikah = input.nextBoolean();

		System.out.print("\n\n");
		System.out.println("\t\t================OUTPUT===============");
		System.out.println("\t\tNama\t\t: "+nama);
		System.out.println("\t\tJenis Kelamin\t: "+jeniskelamin);
		System.out.println("\t\tTinggi Badan\t: "+tinggibadan+" cm");
		System.out.println("\t\tStatus Menikah\t: "+menikah);
	}
}