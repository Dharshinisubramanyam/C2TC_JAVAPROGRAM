package arrayconcept;
import java.util.Scanner;
import java.util.Arrays;

public class Worldcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter total number of participants:");
int n =sc.nextInt();
System.out.println("enter top scores:");
int top = sc.nextInt();
System.out.println("enter n scores:");
int[]score =new int[n];
for (int i =0;i<n;i++)
{
	score[i] = sc.nextInt();
}
int ans =0;
Arrays.sort(score);;
for (int i=n-1; i>=n-top; i--) {
	ans= ans+score[i];
}
System.out.println("sum:"+ ans);
	}

}
