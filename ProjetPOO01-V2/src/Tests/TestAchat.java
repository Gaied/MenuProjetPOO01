package Tests;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import achat.Achat;

public class TestAchat {
   private Achat a;
   
       private final Date odate = new Date();
       private final String ointitule = "Pc";
       private final int oqte = 7;
       
       @Before
   	public void init() {
   		a = new Achat(odate, ointitule, oqte);
   	}

	@Test
	public void testGetDateAchat() {
		assertEquals(odate, a.getDateAchat());
		this.testSetDateAchat();
	}

	@Test
	public void testSetDateAchat() {
		a.setDateAchat(odate);
		assertEquals(odate, a.getDateAchat());
	}

	@Test
	public void testGetIntitule() {
		assertEquals(ointitule, a.getIntitule());
		this.testSetIntitule();
	}

	@Test
	public void testSetIntitule() {
		a.setIntitule(ointitule);
		assertEquals(ointitule, a.getIntitule());
	}

	@Test
	public void testGetQte() {
		assertEquals(oqte,a.getQte());
		this.testSetQte();
	}

	@Test
	public void testSetQte() {
		a.setQte(oqte);
		assertEquals(oqte,a.getQte());
	}

}
