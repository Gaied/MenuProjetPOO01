package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ProjetPOO01.GestionPersonnes.Personne;

public class TestPersonne {
	private Personne op;
	
	private final String onom="Bassel";
	private final String oprenom="Gaied";
	private final String oadresse="Rue Lyon";
	private final String oville="Lyon";
	private final String ocodepostal="69100";
	
	@Before
	public void init() {
		op = new Personne(onom, oprenom,oadresse,oville,ocodepostal);
	}

	@Test
	public void testPersonne() {
		assertNotNull(op);
	}

	@Test
	public void testGetNom() {
		assertEquals(onom, op.getNom());
		this.testSetNom();
	}

	@Test
	public void testSetNom() {
		op.setNom(onom);
		assertEquals(onom, op.getNom());
	}

	@Test
	public void testGetPrenom() {
		assertEquals(oprenom, op.getPrenom());
		this.testSetPrenom();
	}

	@Test
	public void testSetPrenom() {
		op.setPrenom(oprenom);
		assertEquals(oprenom, op.getPrenom());
	}

	@Test
	public void testGetAdresse() {
		assertEquals(oadresse, op.getAdresse());
		this.testSetAdresse();
	}

	@Test
	public void testSetAdresse() {
		op.setAdresse(oadresse);
		assertEquals(oadresse, op.getAdresse());
	}

	@Test
	public void testGetVille() {
		assertEquals(oville, op.getVille());
		this.testSetVille();
	}

	@Test
	public void testSetVille() {
		op.setVille(oville);
		assertEquals(oville, op.getVille());
	}

	@Test
	public void testGetCodepostal() {
		assertEquals(ocodepostal, op.getCodepostal());
		this.testSetCodepostal();
	}

	@Test
	public void testSetCodepostal() {
		op.setCodepostal(ocodepostal);
		assertEquals(ocodepostal, op.getCodepostal());
	}


}
