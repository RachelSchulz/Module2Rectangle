package model;

public class Rectangle {

	public static void main(String[] args) {

		Rectangle rect = new Rectangle();
		
		System.out.println("The area is " + rect.getArea(3,5));

		System.out.println("The length of the perimeter is " + rect.getLengthOfPerimeter(3,5));

	}


	public int getArea(int l, int w) {
			
		return l * w;
			
	}
		
	public int getLengthOfPerimeter(int l, int w) {
			
		return (2 * l + 2 * w);

			
	}
	

}
