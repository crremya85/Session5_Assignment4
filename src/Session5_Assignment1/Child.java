package Session5_Assignment1; // Package containing class extending abstract class

public class Child extends Parent { // Class extends abstract class

	
	void Marks()   // Abstract methods inherited and defined in the child class
	{ 
		System.out.println("Total Marks:200"); // Printing total marks of the student 
	}
	void Department() // Abstract methods inherited and defined in the child class
	{
		System.out.println("Department: Computer Science");  // Printing department of the student 
	}
	
	public static void main(String[] args) { // Main method which is static and will be called first on program execution
		
		Child ch = new Child(); // creating object for child class 
        ch.StudentDetails(); // calling the non-abstract method defined in the parent class which is abstract
        ch.Marks(); // calling abstract method defined in the child class
        ch.Department(); // calling abstract method defined in the child class
	} // End of main method

}// end of class declaration
