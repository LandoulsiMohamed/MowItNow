package mowitnow.traitement;

import mowitnow.ExceptionTondeuse;
import mowitnow.entites.Params.InstructionTondeuse;
import mowitnow.entites.Pelouse;
import mowitnow.entites.PositionTondeuse;

import java.util.ArrayList;
import java.util.List;

public class TraitementTondeuse {

	private Pelouse pelouse;
	private PositionTondeuse positionTondeuse;
	private List<InstructionTondeuse> listeInstruction;

	public void setPelouse(Pelouse pelouse) {
		this.pelouse = pelouse;
	}

	public void setPositionTondeuse(PositionTondeuse positionTondeuse) {
		this.positionTondeuse = positionTondeuse;
	}

	public void setListeInstruction(
			List<InstructionTondeuse> pListeInstruction) {
		this.listeInstruction = pListeInstruction;
		if(pListeInstruction == null){
			listeInstruction = new ArrayList<InstructionTondeuse>();
		}
	}
	/**
	 * executer l'ensemble des insctructions par une tondeuse
	 * @throws ExceptionTondeuse
	 */
	public void executerInstructions() throws ExceptionTondeuse {
		for(InstructionTondeuse instruction : listeInstruction){
			TraitementInstruction.executerInstruction(positionTondeuse,
					instruction, this.pelouse.getPositionMax());
		}
	}

	public String toString(){
		return 	positionTondeuse.getCoordonneesTondeuse().getX() 
				+ " " 
				+ positionTondeuse.getCoordonneesTondeuse().getY()
				+ " " 
				+ positionTondeuse.getOrientationTondeuse().getCodeOrientation() ;
	}
}