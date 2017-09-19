package Session5_Assignment2;

public class Shapes {   // Class Declaration

	public static void main(String[] args) {  // Main method which is static and called upon execution at first
	
		System.out.println("Shapes and their Area and Perimeter");  // Printing the subject of the below results
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Figure figure1 = new Circle(5);  // Creating object for Figure class and access the methods in Circle class
		figure1.Area();                  // and passing the value for dimensions 
		figure1.Perimeter();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Figure figure2 = new Rectangle(10,5);  // Creating object for Figure class and access the methods in Rectangle class
		figure2.Area();                        // and passing the value for dimensions
		figure2.Perimeter();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Figure figure3 = new Triangle(5,5,5,6.5,6.5); // Creating object for Figure class and access the methods in Triangle class
		figure3.Area();                               // and passing the value for dimensions
		figure3.Perimeter();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

}
