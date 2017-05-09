public class MainProgram {
	public static void main (String []args){
		Nurghaida mhs = new Nurghaida();
		mhs.kuliah("Nurghaida");
		mhs.lulus();
	}
}

abstract class Mahasiswa  {
	protected String nama = "Nurghaida";
	protected String nim = "10115431";

	protected void organisasi(){
		System.out.println("Mahasiswa ada yang berorganisasi"); 
	}

	protected abstract void kuliah(String nama);
	protected abstract void lulus();
	protected abstract void tidaklulus();
}

class Nurghaida extends Mahasiswa {
	String jurusan = "Teknik Informatika";
	float ip = 3.89f;

	//override
	protected void kuliah (String nama) {
		System.out.println("Nama 	: "+nama);
		System.out.println("Nim  	: "+nim);
		System.out.println("Jurusan : "+jurusan);

		System.out.println("\nMahasiswa dengan nama "+nama+" dan nim "+nim+" kuliah di Unikom dengan jurusan "+jurusan);
	}
	//override
	protected void lulus (){
		System.out.println("Lulus dengan rata-rata ip "+ip);
	}

	//override
	protected void tidaklulus (){
		System.out.println("Mahasiswa dengan ip dibawah rata-rata tidak lulus");
	}

}