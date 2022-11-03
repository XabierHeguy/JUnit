package projet2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatriceTest2 {

	@Test
	void test1() {
		Calculatrice calc = new Calculatrice();
		int result = calc.add(1, 2);
		assertEquals(result, 3, "Test de 3 = 3");
		result = calc.add(1, 3);
		assertNotEquals(result, 3, "Test de 4 = 3");
		
	}
	
	@Test
	@DisplayName("Test int normal")
	public void testadd1() {
		Calculatrice calculatrice = new Calculatrice();
		int resultat = calculatrice.add(1, 2);
		assertEquals(3, resultat);
	}

	@Test
	@DisplayName("Test int zero")
	public void testadd() {
		Calculatrice calculatrice = new Calculatrice();
		int resultat = calculatrice.add(-2, 2);
		assertNotEquals(0, resultat);
	}
	
	@Test
	@DisplayName("Test int max")
	public void testadd2() {
		Calculatrice calculatrice = new Calculatrice();
		int resultat = calculatrice.add(Integer.MAX_VALUE, 1);
		assertEquals(Integer.MIN_VALUE, resultat);
	}

	@Test
	@DisplayName("Test int min")
	public void testadd3() {
		Calculatrice calculatrice = new Calculatrice();
		int resultat = calculatrice.add(Integer.MIN_VALUE, -1);
		assertEquals(Integer.MAX_VALUE, resultat);
	}
	
	@Test
	@DisplayName("Test le résultat doit être différent de 0")
	void test() {
		Calculatrice calc = new Calculatrice();
		int res = calc.add(1, -1);
		assertNotEquals(res, 0, "le résultat est différent de 0");
	}
	
	@Test
	@DisplayName("Test le résultat est pair")
	void testPair() {
		Calculatrice calc = new Calculatrice();
		int res = calc.add(1, 1);
		assertTrue(calc.isPair(res), "Le résultat est pair");
		assertNotEquals(res, 0, "le résultat est différent de 0");
	}
	
	@Test
	@DisplayName("Test le résultat est impair")
	void testImpair() {
		Calculatrice calc = new Calculatrice();
		int res = calc.add(1, -1);
		assertFalse(calc.isPair(res), "Le résultat est impair");
	}
	
	@Test
	@DisplayName("Test les calculatrices sont les mêmes")
	void testMemeCalculatrice() {
		Calculatrice calc1 = new Calculatrice();
		Calculatrice calc2 = calc1.copy();
		assertSame(calc1, calc2, "Les calculatrices sont les mêmes");
	}
	
	@Test
	@DisplayName("Test les calculatrices ne sont pas les mêmes")
	void testPasMemeCalculatrice() {
		Calculatrice calc1 = new Calculatrice();
		Calculatrice calc2 = new Calculatrice();
		assertNotSame(calc1, calc2, "Les calculatrices sont les mêmes");
	}

}
