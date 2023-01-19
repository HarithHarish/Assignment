
public class Jan4 {
    public static void main(String[] args) {
         
            String str=new java.util.Scanner(System.in).nextLine();
            String word=" ";
            String[] words=str.split(" ",0);
            for(String a: words)
                word=a;
            
            System.out.print(word.length());
        }
    }
    

