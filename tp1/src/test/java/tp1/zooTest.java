package tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class zooTest {
	
	zoo Zoo=new zoo();
	
	
	@Test
	public void testNouveauVisiteur() throws LimiteVisiteurException {
		Zoo.ajouterSecteur("voiture");
		for(int i=0;i<15;i++) {
			Zoo.nouveauVisiteur();
		}
		try {
			Zoo.nouveauVisiteur();
			fail("Should throw LimiteVisiteurException (16th visiteur");
		}
		catch(LimiteVisiteurException e) {
			assertEquals("Limite de visiteur atteinte",e.getMessage());
		}
		
	}

}
