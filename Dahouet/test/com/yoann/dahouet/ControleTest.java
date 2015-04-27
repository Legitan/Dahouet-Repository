package com.yoann.dahouet;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yoann.dahouet.metier.Personne;

public class ControleTest {

	@Test
public void testIsValidEMail() {
		
		assertEquals(true, Personne.ctlMail("lionel.duboeuf@gmail.com"));
		
		assertEquals(false, Personne.ctlMail("lionel.duboeufgmail.com"));
		
		assertEquals(false, Personne.ctlMail("l$gmail.com"));
		
		assertEquals(false, Personne.ctlMail("l$ @gmail.com"));
		
		assertEquals(false, Personne.ctlMail("l785@gmai@l.com"));
		
	}
	
	
	@Test
	public void testIsDateValid(){
		
		assertEquals(true, AppDahouet.isValidDate("2004/01/01"));
		assertEquals(true, AppDahouet.isValidDate("01/01/2004"));
		assertEquals(false, AppDahouet.isValidDate("01/01948/2004"));
		
	}

}
