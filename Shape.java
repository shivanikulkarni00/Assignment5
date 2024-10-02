package assi5;

public class Shape {
	//area of square
	public void printArea(int side) {
        int area = side * side;
        System.out.println("Area of the square: " + area);
    }
    
    //  area of a rectangle
    public void printArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of the rectangle: " + area);
    }
    
    //  perimeter of a square
    public void printPerimeter(int side) {
        int perimeter = 4 * side;
        System.out.println("Perimeter of the square: " + perimeter);
    }

    //  perimeter of a rectangle
    public void printPerimeter(int length, int breadth) {
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
