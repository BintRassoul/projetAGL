package projectAGL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class Testcalcul {
	private Calcul subject;
	@Before
	public void setup() {
		subject = new Calcul();
	}


	@Test
	public void testSum(){
		assertEquals(4, subject.sum(2,2));
	}

	@Test
	public void testSum2(){
		assertNotEquals(5, subject.mult(1,3));
	
	}

}
