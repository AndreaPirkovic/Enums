package pirkovic.andrea;

public class Main {

	public static void main(String[] args) {
		Boja b;
		
		System.out.println("Boje: ");
		
		Boja nizBoja[] = Boja.values();
		
		for (Boja c: nizBoja) {
			System.out.println(c + " ");
			
			
		}
		
		Boja c1;
		c1 = Boja.valueOf("Bela");
		System.out.println("Boja  "  + c1);
		

	}

}
