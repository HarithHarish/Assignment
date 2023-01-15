import java.util.*;
public class ass12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,d;
        n=sc.nextInt();
        d=sc.nextInt();
        int a[]=new int[n];
        for(int i=n-d;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n-d;i++)  
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" "); 
            sc.close(); 
    }  
    
}
