import java.util.*;
public class Bubblesort {
    
    public static void main(String[] args) {
        int n,temp=0,swap=0;
        
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n-i;j++){
                if(a[j-1]>a[j]){
                    temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                    swap++;
                }
            }    
        }
        System.out.println("Array is sorted in "+swap+" steps.");
        System.out.println("First element: "+a[0]);
        System.out.println("Last element: "+a[n-1]);
        sc.close();
    }
    
}
