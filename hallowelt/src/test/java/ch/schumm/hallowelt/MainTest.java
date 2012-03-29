package ch.schumm.hallowelt;

import static org.junit.Assert.*;

import org.apache.commons.math.linear.RealMatrix;
import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		RealMatrix inverse = Main.inverse();
		assertEquals("Array2DRowRealMatrix{{1.0,0.0,0.0},{0.0,1.0,0.0},{0.0,0.0,1.0}}", inverse.toString()); 
	}

}
