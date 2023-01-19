import java.util.*;
public class StringRotation {
	
	private static boolean isAnagram(String x, String y)
	{
		char [] str1 = x.toCharArray();
		char [] str2 = y.toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		return (new String(str1).equalsIgnoreCase(new String(str2)));	
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = in.next();
		System.out.println("Enter the number of rotations: ");
		int n=in.nextInt();
		String firstCharString ="",originalString = str;
		for(int i=1;i<=n;i++)
		{
			String dir = in.next();
			int x = in.nextInt();
			if(dir.equalsIgnoreCase("L"))
			 str = str.substring(x)+str.substring(0, x);
			else if(dir.equalsIgnoreCase("R"))
				str = str.substring(str.length()-x)+str.substring(0,str.length()-x);
			firstCharString += str.charAt(0);
		}
		for(int i=0;i<originalString.length()-n;i++)
		{
			if (isAnagram(originalString.substring(i,i+n),firstCharString)) {
				System.out.println("Yes");
				return;
			}
			
			
				
		}
		
	}

}