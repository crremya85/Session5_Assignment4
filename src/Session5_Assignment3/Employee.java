package Session5_Assignment3;

import java.util.*;

public class Employee {
	
	static int workingdays =25;  // initialize a variable and set it a default value for number of working days in a month.
	int empId;
	String empName;
	int total_leaves;
	double total_salary;
	
	Scanner details = new Scanner(System.in);
	
	Employee()// Constructor to get  the basic employee details
    {
        System.out.println("Enter ID of the Employee:");
        empId = details.nextInt();
    	
        Scanner s = new Scanner(System.in);
    	System.out.println("Enter Name of the Employee:");
    	empName = s.nextLine();
    	
    	System.out.println("-------------------------------------");
    }
	
	void calculate_balance_leaves()
	{
		
	}
	boolean avail_leave(int no_of_leaves, char type_of_leave)
	{
				return true;
	}
	void calculate_salary()
	{
		
	}
	
}
