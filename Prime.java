public class Prime {
   
    static boolean isPrime(int k)
    {
        if(k<=1)
            return false;
        if(k<=3)
            return true;
        if(k%2==0||k%3==0)
            return false;
        for(int i=5;i*i<=k;i++)
        {
                if(k%i==0)
                return false;
            
        }  
        return true;

    }
    public static void main(String[] args) {
        int n=new java.util.Scanner(System.in).nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(isPrime(i))
            count++;
        }
        System.out.println(count);
    }
       
     

 }
    

