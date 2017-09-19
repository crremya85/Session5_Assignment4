package Session5_Assignment2;

public class Triangle extends Figure {  // Class Triangle inherits class Figure
	
	double base;                         // Variable declaration for dimension of triangle 
	double height;
	double side1, side2, side3;
	
	public Triangle(double base, double height, double side1,double side2, double side3)
	{
		this.base=base;                    // passing value for dimensions with the constructor
		this.height=height;
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	
	void Area()    // Defining the method for calculating area of triangle and printing the results
	{
		double area = (base * height)/2;
		System.out.println("Area of Triangle :"+area);
	}
	
	void Perimeter()   // Defining the method for calculating perimeter of triangle and printing the results
	{
		double perimeter = side1 + side2 +side3;
		System.out.println("Permimeter of Triangle :"+perimeter);
	}

}
