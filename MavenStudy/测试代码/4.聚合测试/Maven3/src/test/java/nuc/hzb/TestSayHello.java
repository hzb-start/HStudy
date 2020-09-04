package nuc.hzb;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class TestSayHello {

	@Test
	public void testSay() {
		SayHello sayHello = new SayHello();
		String result = sayHello.say("二九幂加八");
		assertEquals("Hello,二九幂加八", result);	
	}
}
