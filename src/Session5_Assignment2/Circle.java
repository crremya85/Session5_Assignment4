package Session5_Assignment2; 

public class Circle extends Figure { // Class circle inherits class Figure

	double radius;                   // Variable declaration for dimension of circle  
	final static double pi = 3.14;   // Pi variable declared as final and static and initialized with the value
	
	public Circle(double radius) // passing value for dimension with the constructor
	{
		this.radius = radius;
	}
	
	void Area()                  // Defining the method for calculating area of circle and printing the results  
	{
		double area = pi * (radius*radius);
		System.out.println("Area of Circle :"+area);
	}
	
	void Perimeter()            // Defining the method for calculating perimeter of circle and printing the results  
	{
		double perimeter = 2*pi*radius;
		System.out.println("Perimeter of Circle :"+perimeter);
	}
}
