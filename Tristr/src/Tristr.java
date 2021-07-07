/*A Java program to perform String Operations*/
public class Tristr 
{
	public static void main(String[] args) 
	{
		String s1="Trim String";
		System.out.println("Trimming Strings:");
		System.out.println(s1+" JavaProgram");//without trim()
		System.out.println(s1.trim()+"JavaProgram");//with trim()
		System.out.println("Replace characters in strings:");
		String s2="Java Program is an easy language";
		String reps=s2.replace('a','e');//using replace()
		System.out.println(reps);
		//converting to UPPERCASE and lower-case
		System.out.println("Converting to upper and lower:");
		String s3=new String("UPPERCASE");
		System.out.println(s3.toLowerCase());
		String s4=new String("lowercase");
		System.out.println(s4.toUpperCase());
		//Splitting Strings
		System.out.println("Using spilt():");
		String s5="Java@is@a@Program";
		String[] arrOfstr=s5.split("@",2);
		for(String a:arrOfstr)
			System.out.println(a);
		
	}

}
