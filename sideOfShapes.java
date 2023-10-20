/********************************************************************************
 * File         : sideOfShapes.java
 * Description  :java program to print sides of the shapes
 * Author       : Anumol V S
 * Version      : 1.0
 * Date         :20/10/2023
 ********************************************************************************/
public class sideOfShapes {
	public static void main(String [] args) {
		Rectangle rectangle=new Rectangle();
		rectangle.numberOfsides();
		Triangle triangle=new Triangle();
		triangle.numberOfsides();
		Hexagon hexagon=new Hexagon();
		hexagon.numberOfsides();
		
		
	}

}
abstract class Shape{
	public void numberOfsides() {
		
	}
	
}
class Rectangle extends Shape{
	public void numberOfsides() {
		System.out.println("The number of sides of Rectangle is "+4);
	}
	
}
class Triangle extends Shape{
	public void numberOfsides() {
		System.out.println("The number of sides of Trinagle is "+3);
	}
	
}
class Hexagon extends Shapes{
	public void numberOfsides() {
		System.out.println("The number of sides of Hexagon is "+6);
	}
	
}