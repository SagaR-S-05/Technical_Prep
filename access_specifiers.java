import java.io.*;
class access_specifiers
{
    public static void main(String[] args) {
        Data.x=150;
        System.out.println(Data.x); // 150
        System.out.println(Data.getIntY()); // 20
        Data.setIntY(80);
        System.out.println(Data.getIntY()); // 80
        Data.setIntY(120);
        System.out.println(Data.getIntY()); // Nope and then prints 80(The old value)
        // System.out.println(Data.y); // Throws error

    }
}

class Data
{
    public static int x =10;
    private static int y = 20;
    public static int getIntY()
    {
        return y;
    }
    public static void setIntY(int newValue) {
        if(newValue<=100 && newValue>=0)
        {
            y=newValue;
        }
        else
        {
            System.out.println("Nope");
        }
    }
}