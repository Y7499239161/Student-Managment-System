
public class Student{
	int roll;
	String name;
	int marks;
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [roll Number=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	public Student() {
		roll=1;
		name="Tushar";
		marks=0;
	}
	
	
//	public int compareTo(Student e ) {
//		if(this.roll>e.roll) {
//			return 1;
//		}
//		else if(this.roll<e.roll) {
//			return -1;
//		}
//		else {
//			return 0;
//		}
//		
//	}
	
}
