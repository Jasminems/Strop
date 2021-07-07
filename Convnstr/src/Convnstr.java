/*A Java Program to number to string and integer objects to string*/
class Convnstr 
{
	public static void main(String[] args) 
	{
		int a=10;
		//using valueOf()
		String s=String.valueOf(a);
		System.out.println("Number to String:"+s);
		//using integer objects
		int b=12;
	    Integer c = new Integer(b);
	    String s1=c.toString();
		System.out.println("Integer objects to String:"+s1);
	}

}
