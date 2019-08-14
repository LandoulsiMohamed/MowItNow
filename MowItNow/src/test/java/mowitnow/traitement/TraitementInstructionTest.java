package mowitnow.traitement;

import mowitnow.ExceptionTondeuse;
import mowitnow.entites.Coordonnees;
import mowitnow.entites.Params.InstructionTondeuse;
import mowitnow.entites.Params.Orientation;
import mowitnow.entites.PositionTondeuse;
import org.junit.Test;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


public class TraitementInstructionTest {

	@Test
	public void coordonnees_x_y_south_instruction_Tourner_Droite() throws ExceptionTondeuse {
		Coordonnees coordonnesMax = new Coordonnees(5, 5);
		int x = 2;
		int y = 3;
		Coordonnees coordonnees = new Coordonnees(x, y);
		PositionTondeuse positionTondeuse = new PositionTondeuse(coordonnees, Orientation.SOUTH);
		TraitementInstruction.executerInstruction(positionTondeuse, InstructionTondeuse.DROITE, coordonnesMax);
		assertThat(positionTondeuse.getCoordonneesTondeuse(),equalTo(new Coordonnees(x, y)));
		assertThat(positionTondeuse.getOrientationTondeuse(),equalTo(Orientation.WEST));
	}
	
	
	@Test
	public void pivoter_a_droite() throws ExceptionTondeuse {
		
		Orientation orientationSuivante = TraitementInstruction.pivoterDroite(Orientation.EAST);
		assertThat(orientationSuivante,equalTo(Orientation.SOUTH));
		
		orientationSuivante = TraitementInstruction.pivoterDroite(Orientation.WEST);
		assertThat(orientationSuivante,equalTo(Orientation.NORTH));
		
		orientationSuivante = TraitementInstruction.pivoterDroite(Orientation.NORTH);
		assertThat(orientationSuivante,equalTo(Orientation.EAST));
		
		orientationSuivante = TraitementInstruction.pivoterDroite(Orientation.SOUTH);
		assertThat(orientationSuivante,equalTo(Orientation.WEST));
	}
	
	@Test
	public void pivoter_a_gauche() throws ExceptionTondeuse {
		Orientation orientationSuivante = TraitementInstruction.pivoterGauche(Orientation.EAST);
		assertThat(orientationSuivante,equalTo(Orientation.NORTH));
		
		orientationSuivante = TraitementInstruction.pivoterGauche(Orientation.WEST);
		assertThat(orientationSuivante,equalTo(Orientation.SOUTH));
		
		orientationSuivante = TraitementInstruction.pivoterGauche(Orientation.NORTH);
		assertThat(orientationSuivante,equalTo(Orientation.WEST));
		
		orientationSuivante = TraitementInstruction.pivoterGauche(Orientation.SOUTH);
		assertThat(orientationSuivante,equalTo(Orientation.EAST));
	}

}
