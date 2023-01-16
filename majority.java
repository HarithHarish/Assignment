import java.util.*;
public class majority {
    public static void main(String[] args) {
        int n,maxCount=0,count,max=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int nums[]=new int[n];
       
        for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();                   
        for(int i=0;i<n;i++)
        {
            count=0;
            for(int j=0;j<n;j++)
            {
            if(nums[i]==nums[j])
               count++;              
            }
            if(count>maxCount)
            {
                maxCount=count;
                max=nums[i];           
           } 
        if(maxCount>n/2)  
        {
            System.out.println(""+max);
            break;
        } 
    }
    sc.close();
}
}
