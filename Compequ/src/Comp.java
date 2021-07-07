/*A Java program to compare Strings*/
class Comp 
{
	public static void main(String[] args) 
	{
		String s1=new String("Javacode");
		String s2=new String("Language");
		String s3=new String("Javacode");
		System.out.println("Comparing " + s1 + " and " + s2 + ":" +s1.equals(s2));
		System.out.println("Comparing " + s2 + " and " + s3 + ":" +s2.equals(s3));
		System.out.println("Comparing " + s1 + " and " + s3 + ":" +s1.equals(s3));
	}
}
