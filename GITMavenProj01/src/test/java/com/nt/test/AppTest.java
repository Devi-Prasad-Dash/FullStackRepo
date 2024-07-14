package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.nt.service.Arithmetic;

public class AppTest {
		
	@Test
	public void testwithPositives() {

			Arithmetic ar = new Arithmetic();

			int expected = 50;
			int actual = ar.sum(30, 20);
			assertEquals(expected, actual);
		
	}
	
	@Test
	public void testwithNegatives() {

			Arithmetic ar = new Arithmetic();
			int expected = -40;
			int actual = ar.sum(-20, -20);
			assertEquals(expected, actual);
		
	}
	
	@Test
	public void testwithZeros() {

			Arithmetic ar = new Arithmetic();
			int expected = 0;
			int actual = ar.sum(0, 0);
			assertEquals(expected, actual);
		
	}
}