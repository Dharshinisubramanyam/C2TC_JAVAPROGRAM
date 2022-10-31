package stream;

import java.util.List;

public class Javastream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> names = new ArrayList<>();
names.add("anjalli");
names.add("priya");
names.add("meena");
names.add("shtuthi");
List<String>namesEndingWith_a=names.stream()
.filter(name->name.char)
	}

}
