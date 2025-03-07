public class p1 {
    public static void main(String[] args)
    {
        int n=3;
        /*
             *
             **
             ***
         */
        // for(int i=1;i<=3;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=1;i<=n;i++)
        //     {
        //         for(int spaces=1;spaces<=n-i;spaces++)
        //         {
        //             System.err.print(" ");
        //         }
        //         for(int j=1;j<=i;j++)
        //         {
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //     }
        // }
        /*
               *
            *     *
        *      *     *
         */
        // for(int i=1;i<=n;i++)
        //     {
        //         for(int j=1;j<=n-i;j++)
        //         {
        //             System.out.print(" ");
        //         }
        //         for(int j=1;j<=i;j++)
        //         {
        //             System.out.print("* ");
        //         }
        //         System.out.println();
               
        //     }
        /*
           Hourglass
         */
        // for(int i=n;i>=1;i--)
        // {
        //     for(int j=1;j<=n-i;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for(int i=2;i<=n;i++)
        // {
        //     for(int j=1;j<=n-i;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        
        /*
           1 2 3
            4 5
             6
            7 8
           9 10 11
         */
        int count=1;
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }

        /*
           1 2 3
            4 5
             6
            5 4
           3 2 1
         */
        // int count=1;
        // for(int i=n;i>=1;i--)
        // {
        //     for(int j=1;j<=n-i;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(count+" ");
        //         count++;
        //     }
        //     System.out.println();
        // }
        // for(int i=2;i<=n;i++)
        // {
        //     for(int j=1;j<=n-i;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(count-2+" ");
        //         count--;
        //     }
        //     System.out.println();
        // }

        /*
           
         */


    }
    
    
}
