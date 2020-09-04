package nuc.hzb;	
import org.junit.Test;
import static junit.framework.Assert.*;
public class Maven1Test{
	
	@Test
	public void testHello(){
		Maven1 maven1 = new Maven1();
		String result = maven1.sayHello("hzb");
		// 断言
		assertEquals("Hello hzb", result);	
	}
	
}