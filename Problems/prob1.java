package Problems;
import java.io.*;
class prob1
{
    public static void main(String[] args) 
    {
        int n=19436;
        if(n%9==0)
        {
            System.out.println("9");
        }
        else
        {
            System.out.println(n%9);
        }
    }
}
// Sum of each digit returning finally a single digit sum, without loops