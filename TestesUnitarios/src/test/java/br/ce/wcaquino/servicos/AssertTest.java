package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Usuario;

public class AssertTest {

	@Test
	public void test() {
		
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		
		Assert.assertEquals(1, 2);
		Assert.assertEquals(0.51234, 0.512, 0.0001);
		Assert.assertEquals(Math.PI, 3.14, 0.01);
		
		int i = 5;
		Integer i2 = 5;
		Assert.assertEquals(i, i2.intValue());
		Assert.assertEquals(Integer.valueOf(i), i2);
		
		Assert.assertEquals("bola", "bola");
		Assert.assertTrue("bola".equalsIgnoreCase("Bola"));
		Assert.assertTrue("bola".startsWith("bo"));
		
		Usuario u1 = new Usuario("Carlos");
		Usuario u2 = new Usuario("Marcos");
		
		Assert.assertEquals(u1, u2);
	}
}
