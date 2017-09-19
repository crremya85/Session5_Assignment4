package Session5_Assignment2;

public class Rectangle extends Figure {  // Class Rectangle inherits class Figure
	
	double length;                       // Variable declaration for dimension of Rectangle 
	double breadth; 
	
	public Rectangle(double length,double breadth)  // passing value for dimensions with the constructor
	{
		this.length =length;
		this.breadth =breadth;
	}
	
	void Area()      // Defining the method for calculating area of rectangle and printing the results
	{
		double area = length * breadth;
		System.out.println("Area of Rectangle :"+area);
	}
	
	void Perimeter()    // Defining the method for calculating perimeter of rectangle and printing the results
	{
		double perimeter = 2*(length+breadth);
		System.out.println("Perimeter of Rectangle :"+perimeter);
	}

}
