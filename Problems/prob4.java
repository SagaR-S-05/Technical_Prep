public class prob4 {
    public static void main(String[] args) {
        int n=5;
        System.out.println("No of options: "+stairs(n));
    }
    public static int stairs(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        
        return stairs(n-1)+stairs(n-2);
        
    }
}
