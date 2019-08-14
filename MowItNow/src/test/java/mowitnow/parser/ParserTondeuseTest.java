package mowitnow.parser;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParserTondeuseTest {
	
	@Test
	public void parse_tondeuse(){
		ParserTondeuse parserTondeuse = new ParserTondeuse();
		parserTondeuse.setInstructions("DGDGA");
		parserTondeuse.setPelouse("50 5");
		parserTondeuse.setTondeuse("1 2 N");
		assertTrue(parserTondeuse.executeParse());
	}
	@Test
	
	public void parse_tondeuse_pelouse_incorrect(){
		ParserTondeuse parserTondeuse = new ParserTondeuse();
		parserTondeuse.setInstructions("DGDGA");
		parserTondeuse.setPelouse("0 -1");
		parserTondeuse.setTondeuse("1 2 N");
		assertFalse(parserTondeuse.executeParse());
	}
	
	@Test
	public void parse_tondeuse_donnees_vide(){
		ParserTondeuse parserTondeuse = new ParserTondeuse();
		assertFalse(parserTondeuse.executeParse());
	}
}
