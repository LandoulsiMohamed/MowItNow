package mowitnow.traitement;

import mowitnow.entites.Coordonnees;
import mowitnow.entites.Params.InstructionTondeuse;
import mowitnow.entites.Params.Orientation;
import mowitnow.entites.Pelouse;
import org.junit.Test;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class FormaterLigneTest {

	@Test
	public void formater_ligne_tondeuse() {
		assertThat(FormaterLigne.formaterLigneTondeuse("10 15 N").getCoordonneesTondeuse(),equalTo(new Coordonnees(10, 15)));
		assertThat(FormaterLigne.formaterLigneTondeuse("10 15 N").getOrientationTondeuse(),equalTo(Orientation.NORTH));
	}

	@Test
	public void formater_ligne_pelouse() {
		assertThat(FormaterLigne.formaterLignePelouse("10 15"),equalTo(new Pelouse(new Coordonnees(10, 15))));
	}

	@Test
	public void formater_ligne_instruction() {
		assertThat(FormaterLigne.formaterLigneInstruction("DGAD"),hasSize(4));
		assertThat(FormaterLigne.formaterLigneInstruction("DGAD"),
				contains(InstructionTondeuse.DROITE,InstructionTondeuse.GAUCHE,InstructionTondeuse.AVANCER,InstructionTondeuse.DROITE));
	}

	@Test
	public void recuperer_orientation() {
		assertThat(FormaterLigne.getOrientation('E'),equalTo(Orientation.EAST));
		assertThat(FormaterLigne.getOrientation('N'),equalTo(Orientation.NORTH));
		assertThat(FormaterLigne.getOrientation('S'),equalTo(Orientation.SOUTH));
		assertThat(FormaterLigne.getOrientation('W'),equalTo(Orientation.WEST));
		assertNull(FormaterLigne.getOrientation('a'));
	}

	@Test
	public void testGetInstruction() {
		assertThat(FormaterLigne.getInstruction('A'),equalTo(InstructionTondeuse.AVANCER));
		assertThat(FormaterLigne.getInstruction('D'),equalTo(InstructionTondeuse.DROITE));
		assertThat(FormaterLigne.getInstruction('G'),equalTo(InstructionTondeuse.GAUCHE));
		assertNull(FormaterLigne.getInstruction(' '));
	}

}
