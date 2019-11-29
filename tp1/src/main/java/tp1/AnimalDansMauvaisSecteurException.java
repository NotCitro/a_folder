package tp1;

public class AnimalDansMauvaisSecteurException extends Exception{
	public AnimalDansMauvaisSecteurException() {
		System.err.println("Ajout d'un animal dans le mauvais secteur");
	}
}
