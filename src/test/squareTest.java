package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	@Test
	public void test() {
		
		JunitTestung test = new JunitTestung();
		int output = test.square(5);
		assertEquals(25,output);
	}

}
