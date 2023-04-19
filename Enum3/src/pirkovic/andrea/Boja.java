package pirkovic.andrea;

public enum Boja {
	Crvena(200), Zelena(150),Plava(100),Crna(250),Bela(179), Zuta(124);
	// lista sa vrednostima unutar enuma
	private int udeo;
	Boja (int u){ // kontruktor
		udeo=u;
		}
	int getUdeo() { //getter
		return udeo;
		}
	
	}

