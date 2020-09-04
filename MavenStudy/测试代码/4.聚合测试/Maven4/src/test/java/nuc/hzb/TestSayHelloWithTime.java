package nuc.hzb;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class TestSayHelloWithTime {
	
	@Test
	public void testsay() {
		SayHelloWithTime say = new SayHelloWithTime();
		String result = say.sayTime("晚上");
		assertEquals("Hello,二九幂加八,晚上", result);	
	}
}
