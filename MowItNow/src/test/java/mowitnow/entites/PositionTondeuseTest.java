package mowitnow.entites;

import mowitnow.entites.Params.Orientation;
import org.junit.Test;

import static org.junit.Assert.*;

public class PositionTondeuseTest {

	@Test
	public void verifier_surcharge_equals() {
		
		PositionTondeuse positionT = new PositionTondeuse(new Coordonnees(5, 5), Orientation.NORTH);
		PositionTondeuse positionTOk = new PositionTondeuse(new Coordonnees(5, 5), Orientation.NORTH);
		PositionTondeuse positionTKo = new PositionTondeuse(new Coordonnees(5, 5), Orientation.SOUTH);

		assertTrue(positionT.equals(positionTOk));
		assertFalse(positionT.equals(positionTKo));
	}

}
