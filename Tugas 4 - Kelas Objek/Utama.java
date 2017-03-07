public class Utama{
	public static void main (String[] args){
		Sampah organik = new Sampah();
		BarangBaru gelas = new BarangBaru();

		organik.jenissampah = "sampah organik";
		organik.berserakan();

		gelas.namaBarang = "Gelas Kaca";
		gelas.dipakai();
	}
}