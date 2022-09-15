package javaprojectone;

public class Assignmennt_product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int negatives=1;
	      int  num [] = {1,2,3,-4,5,6,7,-2,-6,12};

	      for(int i=0;i<num.length;i++)
	         {
	               if (num[i]<0)
	               {
	                  negatives*=num[i];
	               }
	               
	         }

	         System.out.println("The product of negatives is " + negatives);
	}

}
