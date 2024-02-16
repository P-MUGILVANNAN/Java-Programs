import java.util.Scanner;

class SquareRoot   
{  
    public static void main(String[] args)    
    {   
        System.out.print("Enter a number: ");   
        Scanner sc = new Scanner(System.in);   
        int n = sc.nextInt();   
        double t;  
        double sqreroot=n/2;  
        do   
        {  
            t=sqreroot;  
            sqreroot=(t+(n/t))/2;  
        }   
        while((t-sqreroot)!= 0);
        System.out.println("The square root of "+ n+ " is: "+sqreroot);    
    }  
} 