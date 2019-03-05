package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.rules.ExpectedException;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}

	@Test
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(5, 3), 2);
	}

	@Test
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(5, 3), 15);
	}

	@Test
	public void testDivide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(6, 3), 2);
	}

	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	
	@Test
	public void testDivideByZero(){ 
		SimpleCalculator calc = new SimpleCalculator();
		try{
			assertEquals(calc.dbz(6), 0);
		}catch(java.lang.ArithmeticException e){
			System.out.println("can't divide by 0");
		}
	}
}