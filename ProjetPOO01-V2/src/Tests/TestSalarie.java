package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import ProjetPOO01.GestionPersonnes.Salarie;

public class TestSalarie {
	private Salarie s;
	
	private final String onom="Bassel";
	private final String oprenom="Gaied";
	private final String oadresse="Rue Lyon";
	private final String oville="Lyon";
	private final String ocodepostal="69100";
	private final String onumsecu="1292012365678";
	private final double osalaire= 15.9;
	
	@Before
	public void init() {
		s = new Salarie(onom, oprenom, oadresse, oville, ocodepostal, onumsecu, osalaire);
	}

	@Test
	public void testSalarie() {
		assertNotNull(s);
	}

	@Test
	public void testGetNumsecurite() {
		assertEquals(onumsecu, s.getNumsecurite());
		this.testSetNumsecurite();
	}

	@Test
	public void testSetNumsecurite() {
		s.setNumsecurite(onumsecu);
		assertEquals(onumsecu, s.getNumsecurite());
	}

	@Test
	public void testGetSalaire() {
		assertEquals(new Double(osalaire),new Double(s.getSalaire()));
		this.testSetSalaire();
	}

	@Test
	public void testSetSalaire() {
		s.setSalaire(osalaire);
		assertEquals(new Double(osalaire),new Double(s.getSalaire()));
	}

	/*@Test
	public void testPaie() {
		fail("Not yet implemented");
	}

	@Test
	public void testAchete() {
		fail("Not yet implemented");
	}

	@Test
	public void testEstClient() {
		fail("Not yet implemented");
	}*/

}
