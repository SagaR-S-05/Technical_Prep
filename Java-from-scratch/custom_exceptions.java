public  class custom_exceptions
{
    public static void main(String[] args) 
    {
        int res = 100;
        try
        {
            if(res==100)
            {
                throw (new MyExceptions()); // MyExceptions: I do not like exceptions: exception
            }
            else
            {
                System.out.println("No exception");
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }    
}

class MyExceptions extends Exception
{
    public MyExceptions()
    {
        super("I do not like exceptions: exception");
    }
}