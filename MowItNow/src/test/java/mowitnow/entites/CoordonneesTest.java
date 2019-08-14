package mowitnow.entites;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoordonneesTest {

	@Test
	public void verifier_surcharge_equals(){
		Coordonnees c1 = new Coordonnees(1, 2);
		Coordonnees c2 = new Coordonnees(1, 2);
		assertTrue(c1.equals(c2));
		c2 = new Coordonnees(1, 3);
		assertFalse(c1.equals(c2));
	}
	
	@Test
	public void verifier_coordonnees_(){
		Coordonnees coordonneesPelouse = new Coordonnees(5,5);
		Coordonnees c0 = new Coordonnees(-1,1);
		Coordonnees c1 = new Coordonnees(1,1);
		assertFalse(coordonneesPelouse.isHorsCoordonnesMax(c0));
		assertTrue(coordonneesPelouse.isHorsCoordonnesMax(c1));
	}
}
