package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class countATest {

	@Test
	public void test() {
		JunitTestung test = new JunitTestung();
		int output = test.countA("DijaNa");
		assertEquals(2, output);

	}
}