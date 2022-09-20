package javaprojectone;

public class Volume 
{
int Volume (int r)
{
	int vol= r*r*r;
	return vol;
}
double volume (double h,double r)   
{
	double vol = (22/7.0)*r*r*h;
	return vol;
}
double volume (double l,double b, double h)
{
	double vol = l*b*h;
	return vol;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Volume obj = new Volume();
System.out.println("sphere volume=" + obj.Volume(6)  );
System.out.println ("Cylinder volume=" + obj.volume(5 , 5) );
System.out.println("cuboid volume="+ obj.volume(2, 5, 2));

	}

}
