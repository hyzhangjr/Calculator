
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {

	private Calculator cal = null;
	private int result = 0;
	@Before
	public void setUp() throws Exception {
		//System.out.println("setUp");
		cal = new Calculator();
		result = 0;
	}

	@After
	public void tearDown() throws Exception {
		//System.out.println("tearDown");
	}
	
	/*@Test
	public void test1() throws Exception {
		System.out.println("test1");
	}
	
	@Test
	public void test0() throws Exception {
		System.out.println("test0");
	}*/
	
	@Test
	public void TwoSubOneIsOne() throws Exception {
		result = cal.sub(2,1);
		assertEquals(1,result);
	}

	@Test
	public void FourSubTwoIsTwo() throws Exception {
		result = cal.sub(4,2);
		assertEquals(2,result);
	}
}
