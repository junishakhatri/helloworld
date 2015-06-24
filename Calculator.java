package calculator;
import java.util.Scanner;
import java.lang.Math;

public class Calculator {
    
 


   public static void main(String[] args) 
    {   
        Scanner s=new Scanner(System.in);
        
       while(true)
       {
        System.out.println("YOU HAVE FOLLOWING CHOICES : ");
        System.out.println("1. ADDITION");
        System.out.println("2. SUBTRACTION ");
        System.out.println("3. MULTIPLICATION ");
        System.out.println("4. DIVISION");
        System.out.println("5. EXPONENT");
        System.out.println("6. SQUARE ROOT");
        System.out.println("7. LOGARITHM");
        System.out.println("8. FACTORIAL");
        System.out.println("9. Want to quit");
        System.out.println("ENTER YOUR CHOICE : ");
        int i=s.nextInt();
        if(i==9)
        {
            System.exit(0);
        }
           
        System.out.println("ENTER FIRST NUMBER "); //taken 1st number as input from user
        double a=s.nextDouble();
        if(a==0)
        {
            System.out.println("Bye,its time to quit"); //if 1st number is 0,then quit the program
        }
        else
        {
           
        System.out.println("ENTER SECOND NUMBER "); //taken 2nd number as input from user
        double b=s.nextDouble();
           
        double result=0;
        switch(i)
        {
            case 1:
                result=a+b; //addition performed
                break;
            case 2:
                result=a-b; //substraction  performed
                break;
            case 3:
                result=a*b; //multiplication
                break;
            case 4:
                if(b==0)
                {
                    System.out.println("DIVISION NOT POSSIBLE");
                    break;
                }
                else
                {
                result=a/b; //division 
                }
            case 5:
                result=Math.pow(a,b); //exponents
                break;
            case 6:
                result=Math.sqrt(a);  //square root
                break;
            case 7:
                result=Math.log(a); //logarithm
                break;
           case 8:
                int d;
                int f=1;
                for(d=1;d<=a;d++)   //factorial
                {
                    f=f*d;
                }
               result=f;
               break;
           
               default:
               System.out.println("YOU HAVE ENTERED A WRONG CHOICE");
            }
           
        System.out.println("RESULT = "+result);
        }
    }
        }
        
}
