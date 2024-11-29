package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculateurTest {
	Calculateur calculateur;
	@BeforeEach
	void setUp() {
		calculateur = new Calculateur();
	}

	@Test
	void testITER_1() {
		assertEquals(calculateur.ajoute(""), "0");
	}
	
	@Test
	void testITER_2() {
		assertEquals(calculateur.ajoute("42"), "42");
	}
	
	@Test
	void testITER_3() {
		assertEquals(calculateur.ajoute("1,2"), "3");
	}
	
	@Test
	void testITER_4() {
		assertEquals(calculateur.ajoute("1,2,3"), "6");
	}
	
	@Test
	void testITER_5() {
		assertEquals(calculateur.ajoute("1, 2, 3"), "6");
	}
	
	@Test
	void testITER_6() {
		assertEquals(calculateur.ajoute("-666"), "erreur");
		assertEquals(calculateur.ajoute("7,-5"), "erreur");
	}
	
	@Test
	void testITER_7() {
		assertEquals(calculateur.ajoute("1,1000,2000,2"), "3");
		assertEquals(calculateur.ajoute("1000,1,2000"), "1");
	}
	
	@Test
	void testITER_8() {
		assertEquals(calculateur.ajoute("1, 2, 3, "), "erreur");
		assertEquals(calculateur.ajoute("1, ,2"), "erreur");
		assertEquals(calculateur.ajoute("1,"), "erreur");
	}
	
	@Test
	void testITER_9() {
		assertEquals(calculateur.ajoute("1\n2, 3"), "6");
	}
	
	@Test 
	void testITER_10() {
		assertEquals(calculateur.ajoute("//;\n1;2"), "3");
		assertEquals(calculateur.ajoute("//&\n1&2&3"), "6");
		assertEquals(calculateur.ajoute("//&\n1&2,3"), "erreur");
	}
}
