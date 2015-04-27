package com.yoann.dahouet;

import static org.junit.Assert.*;

import org.junit.Test;




import com.yoann.dahouet.metier.Licencie;
import com.yoann.dahouet.util.Calcul;
import com.yoann.dahouet.util.Controle;

public class ControleTest {

	@Test
public void ctlMail() {
		
		assertEquals(true, Controle.ctlMail("lionel.duboeuf@gmail.com"));
		assertEquals(false, Controle.ctlMail("l@gmail.com"));
		assertEquals(false, Controle.ctlMail("lionel.duboeuf@g.com"));
		assertEquals(false, Controle.ctlMail("lionel.duboeufgmail.com"));
		assertEquals(false, Controle.ctlMail("lionel.duboeuf@gmail.c"));
		assertEquals(false, Controle.ctlMail("lionel.duboeuf@gmailcom"));
						
	}
	
	
	@Test
	public void testIsDateValid(){
		
		assertEquals(true, Controle.isValidDate("2004/01/01"));
		
		assertEquals(false, Controle.isValidDate("01/01948/2004"));
		
	}
	
	public class test_calculPoints {

		 @Test
		 public void test() {
			 Licencie calcul = new Licencie(null, null, null, 0, 50, null, 2015);
			  
			  assertEquals("200.0",Calcul.calculPoints(150, 2015, calcul));

			  
			  Licencie calcul2 = new Licencie(null, null, null, 0, 200, null, 2015);
			  
			  assertEquals("Licence expirée, MAJ impossible",Calcul.calculPoints(380.5, 2014, calcul2));
		 }

		}
	
}
