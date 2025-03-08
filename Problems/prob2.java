import java.io.*;
import java.util.Scanner;

public class prob2 
{
    public static void main(String[] args) {
        int n = 20 ;
        
        int mod = n%7;
        
        if(mod==0)
        {
            System.out.println("buy 2 get 5 free");
        }
        else if(mod==1)
        {
            System.out.println("buy 1 get 5 free");
        }
        else if(mod==2)
        {
            System.out.println("get 5 free");
        }
         else if(mod==3)
        {
            System.out.println("get 4 free");
        }
         else if(mod==4)
        {
            System.out.println("get 3 free");
        }
         else if(mod==5)
        {
            System.out.println("get 2 free");
        }
         else
        {
            System.out.println("get 1 free");
        }
    }    
}
