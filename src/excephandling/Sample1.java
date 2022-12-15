package excephandling;

public class Sample1 {
public static void main(String[] args) {
System.out.println("****Main Starts****");
try{
int i=18/0;
int []arr={10,20,30,40,50};
try{
System.out.println(arr[i]);
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("caught..");
}
}
catch (ArithmeticException e)
{
	System.out.println("handled..");
}
System.out.println("****Main Ends****");
}
}
