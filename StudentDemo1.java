/* Write a program which creates a class “Student” with the following
Data Members
rollNum, studName, mark1, mark2, mark3, totalMarks
Methods
setStudDetails() – which sets the values to all the data members except totalMarks.
calculateTotal() - which calculate the totalMarks
displayStudDetails() – which displays rollNum, studName and totalMarks
Create a class StudentDemo to test the functionality of Student class */

class StudentDetails{
	int rollNum;
	double mark1, mark2, mark3, totalMarks; 
	String studName;	
	
	StudentDetails (int rollNum, String studName, double mark1, double mark2, double mark3)
	{
		this.rollNum = rollNum;
		this.studName = studName;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		calculateTotal();
	}
	
	void calculateTotal()
	{
		totalMarks = mark1+mark2+mark3;
	}
	
	void displayStudDetails()
	{
		System.out.println("Student Roll Number: " +rollNum);
		System.out.println("Student Name: " +studName);
		System.out.println("Student Total Marks: " +totalMarks);
        System.out.println("---------------------------");
	}
}

public class StudentDemo1 {

	public static void main(String[] args) {
		
		StudentDetails s1 = new StudentDetails(1, "Tej", 25, 24, 22.5);
		StudentDetails s2 = new StudentDetails(2, "Ram", 20, 25, 21.5);

		
		s1.displayStudDetails();
		
	
		s2.displayStudDetails();
	}

}
