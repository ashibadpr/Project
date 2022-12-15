package Exception;

public class Sample3 {
public static void main(String[] args) {
System.out.println("******Main starts******");
try{	
int a=1/0;
}
catch(ArithmeticException e)
{
	System.out.println("handled..");
}
System.out.println("******Main ends*****");
}
}
