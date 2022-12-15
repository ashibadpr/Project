package excephandling;

public class Sample4 {
public static void main(String[] args) {
System.out.println("****Main Starts****");
try{
int i=1/0;
}
finally{
	System.out.println("I am finally block..");
}
System.out.println("****Main ends****");
}
}
