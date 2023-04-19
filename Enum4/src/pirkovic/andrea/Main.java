package pirkovic.andrea;

public class Main {

	public static void main(String[] args) {
		System.out.println("Boja - redni broj");
		for (Boja b : Boja.values())
			System.out.println(b + " " + b.ordinal());
	
	
	Boja b1, b2, b3;{
	
	b1= Boja.Crvena;
	
	b2=Boja.Zelena;
	b3=Boja.Plava;
	
	if(b1.compareTo(b2)<0)
		System.out.println( b1 + " dolazi pre " + b2);
	if(b1.compareTo(b2)>0)
		System.out.println(b2 + " dolazi pre " + b1);
	if(b1.compareTo(b3)==0)
		System.out.println(b1 + " jednako " + b3);

	if(b1.equals(b2))
		System.out.println("Greska");
	if(b1.equals(b3))
		System.out.println(b1 + " jednako " + b3);
	if(b1==b3)
		System.out.println(b1 + " == " + b3);
	
	}

}
}