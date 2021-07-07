/*A Java program to perform Matching a String against regular expression using matches()*/
class Matchreg 
{
	public static void main(String[] args) 
	{
		String str=new String("Welcome to Javacode.com");
		System.out.println("Return value:");
		System.out.println(str.matches("(.*)Tutorials(.*)"));
		System.out.println("Return value:");
		System.out.println(str.matches("Tutorials"));
		System.out.println("Return value:");
		System.out.println(str.matches("Welcome(.*)"));
		
	}
}
