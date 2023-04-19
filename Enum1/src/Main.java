
public class Main {

	public static void main(String[] args) {
		
		Boje b;
		
		b= Boje.Crvena;
		
		System.out.println("Boja: " + b);
		
		b= Boje.Plava;
		
		if(b==Boje.Plava)
			System.out.println("Plava");
		switch(b) {
		
		case Crvena:
			System.out.println("Crvena.");
			break;
		case Zelena:
			System.out.println("Zelena.");
			break;
		case Plava:
			System.out.println("Plava.");
			break;
		case Crna:
			System.out.println("Crna.");
			break;
		case Bela:
			System.out.println("Bela.");
			break;
		case Zuta:
			System.out.println("Zuta.");
			break;
		case Narandzasta:
			System.out.println("Narandzasta.");
			break;
		}
	}

}
