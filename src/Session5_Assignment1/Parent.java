package Session5_Assignment1; // Package containing abstract Class and Abstract Methods

abstract class Parent {  // Class Declaration for an Abstract class
	
		public void StudentDetails()  // Concrete Method declaration
	{
		System.out.println("Name of the student: Rusy"); // Printing student details
		System.out.println("Roll Number: 5245");
	}
	
	abstract void Marks(); // Declaring abstract methods (method with Signature and no body)
	abstract void Department(); // Declaring abstract methods (method with Signature and no body)
	
	//Abstract Class can have both concrete and abstract methods
} // End of Abstract class
