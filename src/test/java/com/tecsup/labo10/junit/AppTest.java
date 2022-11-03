package com.tecsup.labo10.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	@Test
	public void testSumar() {		
		App app = new App();		
		assertEquals(7 , app.sumar(4, 3));
	}
	
	@Test
	public void testRestar() {
		App app = new App();		
		assertEquals(1 , app.restar(4, 3));		
	}

}
