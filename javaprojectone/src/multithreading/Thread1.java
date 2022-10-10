package multithreading;

public class Thread1 extends Thread {
Table t;
Thread1(Table t){
	this.t=t;
}
	public void run() 
	{
		// TODO Auto-generated method stub
t.printTable(2);
	}

}
