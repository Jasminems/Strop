/*A Java program using equalsIgnoreCase(),startsWith(),endsWith() and compareTo()*/
class Sendstr 
{
	public static void main(String[] args) 
	{
		String s1="Hello";
		String s2="Hello";
		String s3="hello";
		System.out.println("Using s1,s2,s3 for equalIgnorecase()");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		String s4="Compare this String";
		System.out.println("Using s4 for StartsWith() and EndsWith()");
		System.out.println(s4.startsWith("Compare"));
		System.out.println(s4.startsWith("Comparison"));
		System.out.println(s4.endsWith("Sting"));
		System.out.println(s4.endsWith("String"));
		String s5="Java";
		String s6="Python";
		System.out.println("Using s5 and s6 for compareto()");
		System.out.println(s5.compareTo(s6));
	}
}
