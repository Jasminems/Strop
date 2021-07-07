/*A Java Program different ways of creating a String*/
public class Strincr
{
	public static void main(String[] args)
	{
		char[] ch = { 'H', 'E', 'L', 'L','O'};//using character array
	      String str = new String(ch);
	      System.out.println(str);
	      String str1=new String("Java Program");//using'new' keyword
	      System.out.println(str1);
	      String str2="Testing";				//using string literal
	      System.out.println("Creating String using literal:"+str2);
	   }
	}
