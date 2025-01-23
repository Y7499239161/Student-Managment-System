
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import java.util.TreeSet; 
 
public class StudentProject{ 
	static ArrayList<Student> a1;
	static Scanner sc;
	static Student s1;
	
	public static void main(String[] args) { 
		
		a1 = new ArrayList<Student>(); 
		sc = new Scanner(System.in); 
		int ch=0; 
		
		do { 
			System.out.println("1. Add a new Student "); 
			System.out.println("2. Delete any Student "); 
			System.out.println("3. Update any Student "); 
			System.out.println("4. Show All Students "); 
			System.out.println("5. Sort all Student According to Name");
			System.out.println("6. Sort all Student According to Marks");
			System.out.println("7. Sort all Student According to Roll");
			System.out.println("10. Exit "); 
			System.out.println("Enter your choice "); 
			ch=sc.nextInt(); 
			switch(ch){ 
				case 1:addStudent(); 
				break; 
				case 2:deleteStudent(); 
				break; 
				case 3:updateStudent(); 
				break; 
				case 4:showStudents(); 
				break; 
				case 5:sortUsingName();
				break;
				case 6:sortUsingMark();
				break;
				case 7:sortUsingRoll();
				case 10: break; 
			} 
		}while(ch!=10); 
	} 
	
	//Add Student Method
	public static void addStudent() { 
		System.out.println("Enter roll,name,marks");
		int r=sc.nextInt();
		String n=sc.next();
		int m=sc.nextInt();
		s1=new Student(r,n,m);
		a1.add(s1);
		} 
		
		//Delete student method
	private static void deleteStudent() { 
		System.out.println("Enter Roll Number you want to delete");
		int r =sc.nextInt();
		for (Student s :a1) {
			if(s.roll==r) {
				a1.remove(s);
				System.out.println("Student is deleted");
			}
		}
	} 
	
	//show student method
	private static void showStudents() { 
		System.out.println(a1);
   
	} 
	
	//Update Student Method
	private static void updateStudent() { 
		System.out.println("Enter Roll Number you want to Update");
		int r =sc.nextInt();
		for (Student s :a1) {
			if(s.roll==r) {
				System.out.println("Enter New Name");
				String n =sc.next();
				System.out.println("Enter New Mark");
				int m=sc.nextInt();
				s.name=n;
				s.marks=m;
			}
		}
	} 
	
	//Sort using Name
	public static void sortUsingName() { 
		System.out.println("Sorted Using Name");
		Collections.sort(a1, new SortByName());
		for(Student a2:a1) {
			System.out.println(a2);
		}
		
	}
	
	//Sort Using Mark
	public static void sortUsingMark() {
		System.out.println("Sorted Using Marks");
		Collections.sort(a1, new SortByMarks());
		for(Student a2:a1) {
			System.out.println(a2);
		}
	}

	//Sort using Roll
	public static void sortUsingRoll() { 
		System.out.println("Sorted Using Roll");
		Collections.sort(a1, new SortByRoll());
		for(Student a2:a1) {
			System.out.println(a2);
		}
	}
	
}
