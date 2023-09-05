package tests;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import model.Rectangle;

public class TestRectangle1 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetArea() {
		Rectangle rect = new Rectangle();
		assertEquals(20, rect.getArea(4, 5));
	}
	
	@Test
	public void testZeroArea() {
		Rectangle rect = new Rectangle();
		assertTrue(rect.getArea(0,0) == 0);
	}
	
	@Test
	public void testZeroPerimeter() {
		Rectangle rect = new Rectangle();
		assertFalse(rect.getLengthOfPerimeter(0, 0) != 0);
	}
}
