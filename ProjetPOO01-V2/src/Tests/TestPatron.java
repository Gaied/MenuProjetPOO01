package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ProjetPOO01.GestionPersonnes.Patron;

public class TestPatron {
	private Patron p;
	
	private final String onom="Bassel";
	private final String oprenom="Gaied";
	private final String oadresse="Rue Lyon";
	private final String oville="Lyon";
	private final String ocodepostal="69100";
	private final String onumsecu="1292012365678";
	private final double osalaire= 15.9;
	
	@Before
	public void init() {
		p = new Patron(onom, oprenom, oadresse, oville, ocodepostal, onumsecu, osalaire);
	}

	@Test
	public void testPatron() {
		assertNotNull(p);
	}
	
	/*@Test
	public void testGetNumsecurite() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetNumsecurite() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSalaire() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSalaire() {
		fail("Not yet implemented");
	}

	@Test
	public void testPaie() {
		fail("Not yet implemented");
	}

	@Test
	public void testEmbauche() {
		fail("Not yet implemented");
	}

	@Test
	public void testPaiesalarie() {
		fail("Not yet implemented");
	}

	@Test
	public void testLicencie() {
		fail("Not yet implemented");
	}*/

}
