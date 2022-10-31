package comparable;
import java.util.ArrayList;
import java.util.*;
public class Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<Student> ar = new ArrayList<Student>();
ar.add(new Student (222,"bbbb","london"));
ar.add(new Student (242,"aaa","nyc"));
ar.add(new Student(121,"ccc","jaipur"));

System.out.println("Unsorted");
for (int i= 0; i < ar.size(); i++)
System.out.println(ar.get(i));

Collections.sort(ar, new SortbyRoll());
System.out.println("nSorted by roll_no");
for(int i = 0; i< ar.size();i++)
	System.out.println(ar.get(i));

Collections.sort(ar, new SortbyName());
System.out.println("nsorted by name");
for (int i = 0; i<ar.size();i++)
	System.out.println(ar.get(i)); 
	}

}
