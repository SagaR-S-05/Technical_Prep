import java.io.*;
import java.util.Scanner;
class basic3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        float marks=scanner.nextFloat();
        if(marks>100)
        {
            System.out.println("Invalid");
        }
        else if(marks>=90)
        {  
            System.out.println("A grade");  
        }
        else if(marks>=80)
        {
            System.out.println("B grade");
        }
        else if(marks>=70)
        { 
            System.out.println("C grade"); 
        }
        else if(marks>=60)
        {
            System.out.println("D grade"); 
        }
        else if(marks>=50)
        { 
            System.out.println("E grade"); 
        }
        else
        {
            System.out.println("Fail");
        }

    }
}