

import java.util.Comparator;

public class SortByMarks implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return s1.marks-s2.marks;
	}

}