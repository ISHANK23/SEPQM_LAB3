import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculationTest {
	
	@Before
	public void beforeAnnotaion() {
		System.out.println("Before");
	}

	@Test
	public void testAddition() {
		
		int a = 15;
		int b = 20;
		int expectedResult = 35;
		int result = Calculation.addition(a, b);
		Assert.assertEquals(expectedResult, result);
		
		//fail("Not yet implemented");
	}

	@Test
	public void testSubtraction() {
		
//		int x = 50;
//		int y = 25;
//		int expectedResult = 25;
//		int result = Calculation.subtraction(x, y);
//		Assert.assertEquals(expectedResult, result);
		
				
		//fail("Not yet implemented");
	}

}
