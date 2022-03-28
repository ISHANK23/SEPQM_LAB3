import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculationTest.class })
public class AllTests {
	
	@Before
	public static void beforClassAnnotation() {
		System.out.println("Test all classes");
	}

}
