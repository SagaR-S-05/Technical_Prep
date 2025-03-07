import java.io.*;
class access_specifiers
{
    public static void main(String[] args) {
        Data.x=150;
        System.out.println(Data.x); // 150
        // Accessing static data from static method
        System.out.println(Data.getIntY()); // 20
        Data.setIntY(80);
        System.out.println(Data.getIntY()); // 80
        Data.setIntY(120);
        System.out.println(Data.getIntY()); // Nope and then prints 80(The old value)
        // System.out.println(Data.y); // Throws error
        Data obj = new Data(); // Accessing non static data from a non static method
        System.out.println(obj.getIntZ()); // 30
    }
}

class Data
{
    public static int x =10;
    private static int y = 20;
    private int z = 30;
    public static int getIntY()
    {
        return y;
    }
    public int getIntZ()
    {
        return z;
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