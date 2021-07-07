/*A Java program to searching in String using indexOf()*/
import java.util.Scanner;
public class Searc
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the String: "); 
		String str = s.nextLine();
		System.out.print("Enter the word to search: ");
		String w =s.next();
		int i = str.indexOf(w); 
		if(i >= 0)
		{
			System.out.print("The search word found at index: "+i+"th position");
		} 
		else 
		{
			System.out.println("No Search Found!");
		}	
	}
}