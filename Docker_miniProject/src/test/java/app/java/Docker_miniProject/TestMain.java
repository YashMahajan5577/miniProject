package app.java.Docker_miniProject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertTrue;

public class TestMain {

	@Test
	public void testinputisEven() {
		assertTrue(Main.checkifinputsAnEvenNumber(22)); //Assertion
	}
}
