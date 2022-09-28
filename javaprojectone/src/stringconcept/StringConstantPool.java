package stringconcept;

public class StringConstantPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="java";
String str2="c++";
String str3="java";
String str4=new String ("java");
String str5=new String("c++");
String str6=new String("java").intern();
System.out.println(str1==str5);
System.out.println(str6==str4);
System.out.println(str2==str5);
System.out.println(str1==str3);
	}

}
 