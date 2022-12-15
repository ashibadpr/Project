package excephandling;

public class Sample2 {
public static void main(String[] args) {
System.out.println("****Main Starts****");
int a=8;
int b=0;
try{
	int i=a/b;
}
catch(ArithmeticException e)
{
	int[]arr={10,20,30,40};
try{
	System.out.println(arr[a]);
}
catch(ArrayIndexOutOfBoundsException e1)
{
	System.out.println("caught..");
}
}
System.out.println("****Main Ends*****");
}
}
