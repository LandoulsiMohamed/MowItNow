package mowitnow.parser;

import static org.junit.Assert.*;
import org.junit.Test;

public class ParserDonneesTest {
	
	@Test
	public void parse_tondeuse(){
		assertFalse(ParserDonnees.parseTondeuse(""));
		assertFalse(ParserDonnees.parseTondeuse("1 2 3"));
		assertFalse(ParserDonnees.parseTondeuse("12N"));
		assertTrue(ParserDonnees.parseTondeuse("1 2 N"));
		assertTrue(ParserDonnees.parseTondeuse("1 2 S"));
	}
	
	@Test
	public void parse_liste_instruction(){
		assertFalse(ParserDonnees.parseListInstruction(""));
		assertFalse(ParserDonnees.parseListInstruction(" "));
		assertFalse(ParserDonnees.parseListInstruction("D G"));
		assertFalse(ParserDonnees.parseListInstruction("GGAAAGADDAN"));
		assertFalse(ParserDonnees.parseListInstruction("GGAAAG ADDAN"));
		assertTrue(ParserDonnees.parseListInstruction("DGA"));
		assertTrue(ParserDonnees.parseListInstruction("GGAAAGADDA"));
	}
	
	@Test
	public void parse_pelouse(){
		assertFalse(ParserDonnees.parsePelouse(""));
		assertFalse(ParserDonnees.parsePelouse("1 2 3"));
		assertFalse(ParserDonnees.parsePelouse("123"));
		assertFalse(ParserDonnees.parsePelouse("1 2 "));
		assertTrue(ParserDonnees.parsePelouse("1 2"));
		assertFalse(ParserDonnees.parsePelouse("1 N"));
	}

}
