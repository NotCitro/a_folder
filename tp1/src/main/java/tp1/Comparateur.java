package tp1;

import java.util.Comparator;

public class Comparateur implements Comparator<Secteur>{
	public int compare(Secteur S1,Secteur S2) {
		return(S1.getNombreAnimaux()-S2.getNombreAnimaux());
	}
}
