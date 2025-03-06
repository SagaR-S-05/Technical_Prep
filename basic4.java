import java.io.*;
import java.util.Scanner;
class basic4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        if(a>b)
        {
            for(int i=a;i>=b;i--)
            {
                System.out.println(i);
            }
        }
        else
        {
            for(int i=a;i<=b;i++)
            {
                System.out.println(i);
            }
        }
    }
}