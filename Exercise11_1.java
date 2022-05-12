package chapter_11;
/**
 * Ethan Hunt
 * 04/28/22
 */
import java.util.Scanner;

public class Exercise11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("please enter a value for side 1");
			double setSide1 = input.nextDouble();
		System.out.println("please enter a value for side 2");
			double setSide2 = input.nextDouble();	
		System.out.println("please enter a value for side 3");
			double setSide3 = input.nextDouble();	
		System.out.println("please define if the triangle is filled, enter 0 for no, and 1 for yes");
			double isFilled = input.nextDouble();
		System.out.println("please define the color of the triangle");
			String usrColor = input.next();
			
			triangle triangle1 = new triangle( setSide1, setSide2, setSide3);
			boolean fill = triangle1.filled(isFilled);
			String color = triangle1.usrColor(usrColor);
			System.out.println(triangle1.toString(setSide1, setSide2, setSide3, fill, color));
			System.out.println("the area of the triangle is " + triangle1.getArea(setSide1, setSide2, setSide3));
			System.out.println("the perimeter of the triangle is " + triangle1.getPerimeter(setSide1, setSide2, setSide3));
	} 
}
	//class defining the sides of the triangle and if it is filled and what color it will be.
class triangle{
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;
	private boolean filled = false;
	private String color = "";
	triangle(){
	}
	triangle(double side1, double side2, double side3){
	}
	//make methods for setting new side# values
	public void setSide1(int newS1) {
		this.side1 = newS1;
	}
	public void setSide2(int newS2) {
		this.side2 = newS2;
	}
	public void setSide3(int newS3) {
		this.side3 = newS3;
	}
	//create method for getting area using sides given
	public double getArea(double side1, double side2, double side3) {
		double s = ((side1 + side2 + side3)/2);
		double area = Math.sqrt(s * (s - side1) * (s - side2)* (s - side3));
		return area;
	}
	//method for checking if user wants trianlge filled or not
	public boolean filled(double fill) {
		boolean isFilled = false;
		if(fill == 1) {
			isFilled = true;
		} else if(fill == 0) {
			isFilled = false;
		}
		return isFilled;
	}
	//create method for usr color selection
	public String usrColor(String colr) {
		this.color = colr;
		return colr;
	}
	//create method for getting perimeter using sides given 
	public double getPerimeter(double side1, double side2, double side3) {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	//create method that returns a string description of the triangle
	public String toString(double newS1, double newS2, double newS3, boolean isFilled, String color) {
		return ("Triangle: side1 = " + newS1 + " side2 = " + newS2 + " side3 = " + newS3 + ". The trianlge fill value is " + isFilled + ", and  the color is " + color ) ;
		
	}
}
	
	
	

