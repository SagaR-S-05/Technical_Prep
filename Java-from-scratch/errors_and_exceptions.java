/* try, catch, finally will jump on to stack  */
import java.io.*;
import java.lang.*;
public class errors_and_exceptions
{
    public static void main(String[] args) throws ArithmeticException { // -> This also does the same thing.
        /*
    int a=10;
    int b=0;
    // try
    // {
        System.out.println("Hello"); // Hello
        System.out.println(a/b); // Arithmetic exceptions thrown
        System.out.println("Hi"); // Will not be in the output
    // }
    // catch(ArithmeticException e)
    // {
    //     System.out.println("Arithmetic exceptions thrown");
    // }
        */
        int res=functionThatThrowsException();
        System.out.println(res); // 30

    }
    public static int functionThatThrowsException()
    {
        try
        {
            return 10;
        }
        catch(Exception e)
        {
            return 20;
        }
        finally
        {
            return 30;
        }
    }
    
}