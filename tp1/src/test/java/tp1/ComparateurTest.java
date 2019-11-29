package tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComparateurTest {

	@Test
	public void test() throws AnimalDansMauvaisSecteurException {
		Secteur S1 = new Secteur("Canin");
		Secteur S2 = new Secteur("Felin");
		Comparateur c = new Comparateur();
		S1.ajouterAnimal(new Chien());
		S1.ajouterAnimal(new Chien());
		S2.ajouterAnimal(new Chat());
		S2.ajouterAnimal(new Animal("Vache","Bovin"));

		assertEquals(1, c.compare(S1, S2));
	}

}
