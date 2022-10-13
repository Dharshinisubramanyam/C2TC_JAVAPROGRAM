package generics;
import java.util.ArrayList;

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList list = new ArrayList();
list.add("java");
list.add(123);
for(Object object:list) {
	String str =(String)object;
	System.out.println(str);
}
	}

}
