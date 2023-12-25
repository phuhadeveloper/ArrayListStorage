package arrayliststorage;

import java.util.ArrayList;

public class Student {
	private int rollno;
	private String name;
	private String address;
	
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	public String getName() { return this.name; }
	public int getRollno() { return this.rollno; }
	
	public String toString() {
		return "(" + this.name + " " + this.rollno + ")"; 
	}

	public static void main(String[] args) {
		// infos for list of students
		int[] rollnos = {34, 76, 45, 12, 78, 90, 11, 89, 54, 32};
		String[] names = {"Tom", "Sue", "Becky", "Will", "Kim", "Lily", "Max", "Al", "Wu", "Joe"};
		String[] address = {"123 Apple St", "456 Apple St", "789 Apple St", "901 Apple St", "234 Apple St", "567 Apple St", "890 Apple St", "321 Apple St", "765 Apple St", "980 Apple St"};
		
		// create a list to store students
		ArrayList<Student> studentsList = new ArrayList<>();
		
		// iterate through each info, create a new student, and add to list
		for (int i = 0; i < rollnos.length; i++) {
			studentsList.add(new Student(rollnos[i], names[i], address[i]));
		}
		
		// print out original list of student
		System.out.println("Original list of students:");
		for (Student student: studentsList) {
			System.out.print(student.toString() + " ");
		}
		System.out.println();
		System.out.println();
		
		// sort students list by name
		SelectionSort.sort(studentsList, new NameComparator());
		
		// print out list after sorting by name
		System.out.println("List after sorting by name:");
		for (Student student: studentsList) {
			System.out.print(student.toString() + " ");
		}
		System.out.println();
		System.out.println();
		
		// sort students list by roll number
		SelectionSort.sort(studentsList, new RollnoComparator());
		
		//print out students after sorting by roll number
		System.out.println("List after sorting by roll number:");
		for (Student student: studentsList) {
			System.out.print(student.toString() + " ");
		}
		System.out.println();
		
		
		
	}

}
