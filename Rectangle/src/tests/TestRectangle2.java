package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Rectangle;

public class TestRectangle2 {
	
	protected int length, width;

	@Before
	public void setUp() throws Exception {
	
	}

	@Test
	public void testPerimeter() {
		Rectangle rect = new Rectangle();
		assertEquals(14, rect.getLengthOfPerimeter(3, 4));
	}
	
	@Test
	public void testArea() {
		Rectangle rect = new Rectangle();
		assertEquals(12, rect.getArea(3, 4));
	}
	
	@Test
	public void testSquare() {
		Rectangle rect = new Rectangle();
		assertEquals(36, rect.getArea(6,  6));
	}
}
