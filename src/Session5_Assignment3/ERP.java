package Session5_Assignment3;
import java.util.*;
public class ERP {
	public static void main(String[] args) { // Main method declaration
		
		int employeetype;
		
		//Check if the employee is Permanent or Temporary
		System.out.println("Enter 1 for Permanent Employee.\nEnter 2 for Temporary Employee.");
		Scanner employee = new Scanner(System.in);
		employeetype = employee.nextInt();
		System.out.println("--------------------------------------------");

		if (employeetype == 1) {// For Permanant Employee create an object of the PermanentEmp class
			PermanentEmp emp1 = new PermanentEmp();
			emp1.calculate_balance_leaves();
			emp1.calculate_salary();
		} else if (employeetype == 2){// For Temporary Employee create an object of the TemperoryEmp class
			TemporaryEmp emp1 = new TemporaryEmp();
			emp1.calculate_balance_leaves();
			emp1.calculate_salary();
		}
		else
			System.out.println("Invalid input");
	}
}
