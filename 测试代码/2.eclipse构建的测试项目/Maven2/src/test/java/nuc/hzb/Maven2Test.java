package nuc.hzb;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class Maven2Test {
	
	@Test
	public void testHello(){
		Maven2 maven2 = new Maven2();
		String result = maven2.sayHelloWithTime("二九幂加八");
		// 断言
		assertEquals("Hello hzb,二九幂加八", result);	
	}

}
