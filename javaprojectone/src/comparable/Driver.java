package comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Laptop> laps= new ArrayList<>();
laps.add(new Laptop("Dell",16,8000));
laps.add(new Laptop("Apple",12,9000));
laps.add(new Laptop("Acer",13,5000));
Collections.sort(laps);
for(Laptop l:laps)
{
	System.out.println(l);
}
	}

}
