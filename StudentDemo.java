/* Write a program which creates a class “Student” with the following
Data Members
rollNum, studName, mark1, mark2, mark3, totalMarks
Methods
setStudDetails() – which sets the values to all the data members except totalMarks.
calculateTotal() - which calculate the totalMarks
displayStudDetails() – which displays rollNum, studName and totalMarks
Create a class StudentDemo to test the functionality of Student class */

class Student{
	int rollNum;
	double mark1, mark2, mark3, totalMarks; 
	String studName;	
	
	void setStudDetails(int rollNum, String studName, double mark1, double mark2, double mark3)
	{
		this.rollNum = rollNum;
		this.studName = studName;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	
	double calculateTotal()
	{
		totalMarks = mark1+mark2+mark3;
		return totalMarks;
	}
	void displayStudDetails()
	{
		System.out.println("Student Roll Number: " +rollNum);
		System.out.println("Student Name: " +studName);
		System.out.println("Student Total Marks: " +totalMarks);
        System.out.println("---------------------------");
	}
}

public class StudentDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setStudDetails(1, "Tej", 25, 24, 22.5);
		s1.calculateTotal();
		s1.displayStudDetails();
		
		Student s2 = new Student();
		s2.setStudDetails(2, "Ram", 20, 25, 21.5);
		s2.calculateTotal();
		s2.displayStudDetails();
	}

}
