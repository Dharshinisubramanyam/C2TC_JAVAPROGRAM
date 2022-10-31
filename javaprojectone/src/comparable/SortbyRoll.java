package comparable;

import java.util.Comparator;

public class SortbyRoll implements Comparator<Student> 
{

	public int compare(Student a, Student b)
	{
		return a.roll_no - b.roll_no;

	}

}
