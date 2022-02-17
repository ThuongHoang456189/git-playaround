package test.java;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import main.java.Temp;

@RunWith(value = Parameterized.class)
public class TestTemp {

	@Parameters
	public static Object[][] getInitialData(){
		return new Object[][] {
			{1,1},
			{2,4},
			{3,9}
		};
	}

	@Parameter(value=0)
	public int input;
	
	@Parameter(value=1)
	public int expected;
	
	@Test
	public void aTest() {
		Temp test = new Temp();
		assertEquals(test.Square(input), expected);
	}
}
