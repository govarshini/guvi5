import java.util.*;
class letter
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String a=s.next();
		if(a=="a"||a=="e"||a=="i"||a=="u"||a=="o")
		System.out.println("vowel");
		else
		System.out.println("constant");
	}
}
