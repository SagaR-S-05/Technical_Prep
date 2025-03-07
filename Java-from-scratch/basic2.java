import java.io.*;
import java.util.Scanner;
class basic2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int age=scanner.nextInt();
        if(age>=18)
        {
            System.out.println("Eligible to vote");
        }
        else
        {
            System.out.println("Nope");
        }

    }
}