/*
Classes: Blueprints for Objects.
Objects:Abstract/Virtual representation of real life entities that contain attraction and behaviour.
*/
import java.io.*;
import java.util.Scanner;
class OOPS
{       
    public static void main(String[] args) throws IOException
    {
        Shape s1 = new Shape(10,"Red");
        Shape s2 = new Shape(20,"Blue");
        System.out.println(Shape.numberOfSides); //20
        System.out.println(s1.numberOfSides); // 20
        System.out.println(s1.colour); // Blue
        System.out.println(s2.colour); // Blue
    }
}

class Shape
{
    public static int numberOfSides; 
    public static String colour;
    public Shape(int numberOfSides, String colour)
    {
        thid.numberOfSides=numberOfSides;
        this.colour=colour;
    }
    public static int whatifItHadOneMoreSide()
    {
        return numberOfSides+1;
    }
}