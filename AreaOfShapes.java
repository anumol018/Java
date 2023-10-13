/********************************************************************************
 * File         : AreaOfShapes.java
 * Description  :java program to find area of shapes
 * Author       : Anumol V S
 * Version      : 1.0
 * Date         :13/10/2023
 ********************************************************************************/
import java.util.Scanner;
public class AreaOfShapes {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle:");
		int length=sc.nextInt();
		System.out.println("Enter the breadth of the rectangle:");
		int breadth=sc.nextInt();
		System.out.println("Enter the height of the triangle:");
		float height=sc.nextFloat();
		System.out.println("Enter the  base of the triangle:");
		float base=sc.nextFloat();
		System.out.println("Enter the radius the circle:");
		float radius=sc.nextFloat();
		Shapes shapes=new Shapes();
		shapes.area(length,breadth);
		shapes.area(height,base);
		shapes.area(radius);
	}

}
class Shapes{
	public void area(int length,int breadth) {
		int area=length*breadth;
		System.out.println("Area of Rectangle with length "+length+" and breadth "+breadth+ " =" +area);
		
	}
	public void area(float height,float base) {
		 float area=(0.5f*height*base);
		System.out.println("Area of Triangle with height "+height+" and base "+base+ " =" +area);
	}
	public void area( float radius) {
		float area= (3.14f*radius*radius);
		System.out.println("Area of circle with radius "+radius+"  =" +area);
		
	}
}