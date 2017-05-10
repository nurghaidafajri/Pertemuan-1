import java.util.Scanner;

public class CalculatorMain {
	public static void main (String []args){
		double operan1,operan2;

		Operation cal = new Operation();
		Scanner input = new Scanner (System.in);

		System.out.print("X = ");
			operan1 = input.nextDouble();
		System.out.print("Y = ");
			operan2 = input.nextDouble();

		System.out.println("Hasil Pertambahan adalah "+cal.hasilTambah(operan1,operan2));
		System.out.println("Hasil Pengurangan adalah "+cal.hasilKurang(operan1,operan2));
		System.out.println("Hasil Perkalian adalah "+cal.hasilKali(operan1,operan2));
		System.out.println("Hasil Pembagian adalah "+cal.hasilBagi(operan1,operan2));
	}
}

abstract class Calculator  {
	protected double x,y;

	protected abstract double hasilTambah(double x, double y);
	protected abstract double hasilKurang(double x, double y);
	protected abstract double hasilKali(double x, double y);
	protected abstract double hasilBagi(double x, double y);
}

class Operation extends Calculator {

	//@Override
	protected double hasilTambah(double x, double y){
		return x + y;
	}

	//@Override
	protected double hasilKurang(double x, double y){
		return x - y;
	}

	//@Override
	protected double hasilKali(double x, double y){
		return x * y;
	}

	//@Override
	protected double hasilBagi(double x, double y){
		return x / y;
	}
}