package arrayliststorage;

import java.util.Comparator;

public class RollnoComparator implements Comparator<Student> {
	
	public int compare(Student student1, Student student2) {
		return student1.getRollno() - student2.getRollno();
	}
}
