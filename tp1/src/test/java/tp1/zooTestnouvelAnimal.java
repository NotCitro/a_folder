package tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class zooTestnouvelAnimal {
	zoo Zoo= new zoo();
	Chien c=new Chien();
	@Test
	public void testNouvelAnimal() {
		Zoo.ajouterSecteur("Felin");
		Zoo.ajouterSecteur("Canin");
		Zoo.nouvelAnimal(c);
		Zoo.nouvelAnimal(new Chien());
		
		assertEquals(true,Zoo.getSecteurAnimaux().get(1).getAnimauxDansSecteur().contains(c));
	}

}
