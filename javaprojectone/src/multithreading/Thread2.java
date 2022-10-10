package multithreading;

public class Thread2 extends Thread {
Table t;
Thread2(Table t)
{
	this.t=t;
}
	public void run()
	{
		// TODO Auto-generated method stub
t.printTable(10);
	}

}
