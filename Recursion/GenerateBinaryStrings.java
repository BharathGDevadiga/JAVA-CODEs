import java.util.Scanner;

public class GenerateBinaryStrings{
    
    public static void genBinary(int n,String temp){
        
        if(temp.length()==n){
            
            System.out.print(temp+" ");
            return;
            
        }
        genBinary(n,temp+"0");
        genBinary(n,temp+"1");
        
    }
        public static void main(String[] args){
            
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            genBinary(n,"");
            
        }
}
