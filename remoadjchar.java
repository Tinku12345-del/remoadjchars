package Ques;
import java.util.*;
public class RemoveAdjChar {
	public static String remadjchar(String s)
	{
		int n=s.length();
		String adj=" ";
		if(s.charAt(0)!=s.charAt(1))
		{
			adj=adj+s.charAt(0);
		}
		for(int i=1;i<n-1;i++)
		{
			if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i)!=s.charAt(i-1))
			{
				adj=adj+s.charAt(i);
			}
		}
			if(s.charAt(n-1)!=s.charAt(n-2))
				   adj=adj+s.charAt(n-1);
			  return adj;
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter");
		String str=s.next();
		System.out.println("after removing adjacent character:-");
		System.out.println(remadjchar(str));
		
	}

}
