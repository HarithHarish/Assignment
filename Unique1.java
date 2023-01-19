import java.util.*;
import java.util.StringTokenizer;
public class Unique1 {

public static void main(String[] args) {
int nums[]=new int[100];
int expectedNums[]=new int[100];
int j=0,k=0;
Scanner sc=new Scanner(System.in); 
String str=sc.next();
StringTokenizer st=new StringTokenizer(str,"[|,|]");
while(st.hasMoreTokens())
{
nums[k]=Integer.parseInt(st.nextToken());
k++;
}
for(int i=0;i<k;i++)
        {
            if(nums[i+1]!=nums[i])
            {
                expectedNums[j]=nums[i];
                j++;
            }

        }
System.out.print("[");
        for(int i=0;i<k-1;i++)
        {
            System.out.print(expectedNums[i]+",");

        }
        System.out.println("0]");
    sc.close();

}
}
