import java.util.*;
public class Dec14 {
    
    public static void main(String[] args) {
        String str=new java.util.Scanner(System.in).nextLine();
        String [] rev= new String[25];
        int j=0;
        for(int i=0;i<str.length();i++)
        {
            if("aeiouAEIOU".contains(""+str.charAt(i)))
            {
                rev[j]=""+str.charAt(i);
                j++;
            }

        
        }
        System.out.print("Vowel swap: ");
        for(int i=0;i<str.length();i++)
        {
            if("aeiouAEIOU".contains(""+str.charAt(i)))
            {
                System.out.print(rev[j-1]);
                j--;
            }
            else
            System.out.print(""+str.charAt(i));
            

        }
        System.out.print("\nConsonant swap: ");
        j=0;
        for(int i=0;i<str.length();i++)
        {
            if(!"aeiouAEIOU".contains(""+str.charAt(i)))
            {
                rev[j]=""+str.charAt(i);
                j++;
            }

        }
        for(int i=0;i<str.length();i++)
        {
            if(!"aeiouAEIOU".contains(""+str.charAt(i)))
            {
                System.out.print(rev[j-1]);
                j--;
            }
            else
            System.out.print(""+str.charAt(i));

        }
        
    }
}
