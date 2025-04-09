import java.util.Scanner;
public class studentstar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter student rollnumber");
		int rollNum= s.nextInt();
		System.out.println("Rollnumber: " + rollNum);
		System.out.println("Enter student Name");
		String Name = s.next();
		System.out.println("Student Name: " + Name);
		System.out.println("Enter Marks ");
		double marks1 = s.nextDouble();
		System.out.println("Subject1 " + marks1);
		double marks2 = s.nextDouble();
		System.out.println("subject2 " + marks2);
		double marks3 = s.nextDouble();
		System.out.println("subject3 " + marks3);
		double total = marks1+marks2+marks3;
		System.out.println("Total marks =" +total);
	    double avg = total/3;
		System.out.println("Average marks =" +avg);
	}

}
