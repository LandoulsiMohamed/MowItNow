package mowitnow.entites;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class PelouseTest {

	@Test
	public void verifier_surcharge_equals() {
		Pelouse p1 = new Pelouse(new Coordonnees(1, 2));
		Pelouse p2 = new Pelouse(new Coordonnees(1, 2));
		assertThat(p1.equals(p2),equalTo(true));
		p2 = new Pelouse(new Coordonnees(1, 3));
		assertThat(p1.equals(p2),equalTo(false));
	}
}
