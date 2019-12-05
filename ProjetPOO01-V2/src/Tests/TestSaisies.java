package Tests;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Before;
import org.junit.Test;
import ProjetPOO01.GestionPersonnes.Salarie;
import projetPOOException.ExceptionSaisie;

public class TestSaisies {
private Salarie s;
	
	private final String onom="Bassel";
	private final String oprenom="Gaied";
	private final String oadresse="Rue Lyon";
	private final String oville="Lyon";
	private final String ocodepostal="69100";
	private final String onumsecu="1234567";
	private final double osalaire= 15.9;
	
	@Before
	public void init() {
		s = new Salarie(onom, oprenom, oadresse, oville, ocodepostal, onumsecu, osalaire);
	}
	
	@Test
	public void testCtrlCodePostale() {
		assertNotNull(s);
		try {
		Salarie.ctrlCodePostale(ocodepostal);

		} catch (ExceptionSaisie e) {
		assertThat(e.getMessage(), is("Le nombre de caractère est différent de 5."));

		}

	}

	@Test
	public void testCtrlNumSecu() {
		assertNotNull(s);
		try {
		Salarie.ctrlNumSecu(onumsecu);

		} catch (ExceptionSaisie e) {
		assertThat(e.getMessage(), is("Le nombre de chiffre est different de 13!"));

		}
	}

}
