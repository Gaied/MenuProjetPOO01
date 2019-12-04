package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import ProjetPOO01.GestionPersonnes.Fournisseur;

public class TestFournisseur {
private Fournisseur f;
	
	private final String onom="Bassel";
	private final String oprenom="Gaied";
	private final String oadresse="Rue Lyon";
	private final String oville="Lyon";
	private final String ocodepostal="69100";
	private final String onumfournisseur="123";
	
	@Before
	public void init() {
		f = new Fournisseur(onom, oprenom, oadresse, oville, ocodepostal, onumfournisseur);
	}

	@Test
	public void testFournisseur() {
		assertNotNull(f);
	}
	
	@Test
	public void testGetNumFournisseur() {
		assertEquals(onumfournisseur,f.getNumFournisseur());
		this.testSetNumFournisseur();
	}

	@Test
	public void testSetNumFournisseur() {
		f.setNumFournisseur(onumfournisseur);
		assertEquals(onumfournisseur,f.getNumFournisseur());
	}

	/*@Test
	public void testLivre() {
		fail("Not yet implemented");
	}

	@Test
	public void testCommande() {
		fail("Not yet implemented");
	}

	@Test
	public void testAchete() {
		fail("Not yet implemented");
	}

	@Test
	public void testPaie() {
		fail("Not yet implemented");
	}

	@Test
	public void testEstClient() {
		fail("Not yet implemented");
	}*/

}
