package comparable;
import java.lang.*;
import java.io.*;
import java.util.*;
public class Student {
int roll_no;
String name, address;
public Student (int roll_no, String name, String address)
{
	this.roll_no=roll_no;
	this.name=name;
	this.address=address;
}
public String toString()
{
	return this.roll_no+" "+this.name +" "
			+ this.address;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
