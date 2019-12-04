package Tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import ProjetPOO01.GestionPersonnes.Client;
import achat.Achat;

public class TestClient {
private Client c;
	
	private final String onom="Bassel";
	private final String oprenom="Gaied";
	private final String oadresse="Rue Lyon";
	private final String oville="Lyon";
	private final String ocodepostal="69100";
	private final String onumclient="007";
	
	private final Date d = new Date();
	private final ArrayList<Achat> ListAchat = new ArrayList<Achat>();
	private  Achat a = new Achat(d, "Monteau", 7);
	
	
	@Before
	public void init() {
		c = new Client(onom, oprenom, oadresse, oville, ocodepostal, onumclient);
		ListAchat.add(a);
	}

	@Test
	public void testClient() {
		assertNotNull(c);
	}

	@Test
	public void testGetNumClient() {
		assertEquals(onumclient,c.getNumClient());
		this.testSetNumClient();
	}

	@Test
	public void testSetNumClient() {
		c.setNumClient(onumclient);
		assertEquals(onumclient,c.getNumClient());
	}
	
	@Test
	public void testAchete() {
		assertNotNull(a);
		
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
	public void testPaie() {
		fail("Not yet implemented");
	}

	@Test
	public void testEstClient() {
		fail("Not yet implemented");
	}

	@Test
	public void testListClient() {
		fail("Not yet implemented");
	}*/

}
