
public class VariableClass1 {

	public static void main (String[] args) {
		//1. Kahe muutuja korrutamine, jagamine (võib proovida ka liitmist ja lahutamist)
		int a = 10;
		int c = a % 2; //jääk a jagamisel
		boolean isEven = c == 0;
		boolean isOdd = !isEven;
		System.out.println(isOdd);
		
		//a suurem kui 10
		boolean overTen = a >= 10;
		System.out.println(overTen);
		
		//tingimus, et a on suurem kui 10, aga väiksem kui 100.
		//AND && - on üks ja on teine.
		//OR || - on üks või on teine.
	}
}
