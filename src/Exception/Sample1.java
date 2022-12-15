package Exception;

public class Sample1 {
public static void main(String[] args) {
System.out.println("*****Main Starts*****");
Object o1=new Integer(10);
try{
Character c1=(Character)o1;
System.out.println(c1);
}
catch(ClassCastException e)
{
	System.out.println("handled...");
}
System.out.println("******Main ends*****");
}
}
