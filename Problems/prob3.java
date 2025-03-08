public class prob3 
{
    public static void main(String[] args) 
    {
        String day = "monday";
        int no_days = 7;
        int ans = 0;
        if(day=="monday")
        {
            ans = ((no_days-6)/7) +1;
        }
        else if (day=="tuesday")
        {
            ans = ((no_days-5)/7) + 1;
        }
         else if (day=="wednesday")
        {
            ans = ((no_days-4)/7) + 1;
        }
         else if (day=="thursday")
        {
            ans = ((no_days-3)/7) + 1;
        }
         else if (day=="friday")
        {
            ans = ((no_days-2)/7) + 1;
        }
         else if (day=="saturday")
        {
            ans = ((no_days-1)/7) + 1;
        }
         else if (day=="sunday")
        {
            ans = ((no_days)/7) + 1;
        }
        
        
        
        System.out.println("No of sundays = "+ans);
    }    
}
