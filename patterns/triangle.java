public class triangle 
{
    public static void main(String[] args) 
    {
        int n = 5; // Size of the triangle

        for (int i = 1; i <= n; i++) 
        {
            // Print leading spaces to center-align the triangle
            for (int j = 1; j <= n - i; j++) 
            {
                System.out.print(" ");
            }

            // Print stars for the hollow triangle
            for (int j = 1; j <= i; j++) 
            {
                // Print '*' at the borders or on the first or last row
                if (i == 1 || i == n || j == 1 || j == i) 
                {
                    System.out.print("* ");
                } 
                else 
                {
                    System.out.print("  "); // Print spaces for the hollow part
                }
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
