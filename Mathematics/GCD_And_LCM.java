import java.util.Scanner;

public class GCD_And_LCM{
    
    public static int findGcd(int a,int b){
        
        if(b==0)
            return a;
        return findGcd(b,a%b);
        
    }

    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=findGcd(a,b);
        int lcm=(a*b)/gcd;
        
        System.out.println("the GCD:"+gcd);
        System.out.println("the lCm:"+lcm);
        
    }
}

/*
Expected Output:
-----------------
the GCD:6 the lCm:36
-----------------
*/
