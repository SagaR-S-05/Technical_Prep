/* Types of Inheritance:  Single, Multiple(Not allowed in Java-leads to overriding functions), Multilevel, Hierarchical*/
/*A method that does not have its implementation or body is known as an abstract method */
import java.io.*;
class inheritance
{
    public static void main(String[] args) 
    {
        // Child obj = new Child(10);
        Child obj = new Child(10,20);
        // System.out.println(obj.parent); // 100
        System.out.println(obj.parent); 
        // Parent constructor called
        // 0 -> this is because there is empty parameters in Parent constructor, so it will be automatically initialized to 0.
        Child.Hello(); // Function overloading (Hello method present both in Parent and Child class), priority will be given to child class
    }  
}

class Parent
{
    public static int parent;
    Parent()
    {
        System.out.println("Parent constructor called");
    }
    // Parent(int x)
    // {
    //     parent=x;
    // }
    public static void Hello()
    {
        System.out.println("Hello");
    }
}

class Child extends Parent
{
    public static int child;
    // Child(int y)
    Child(int y, int x)
    {
        // super(100); // super() should be the first line of a child class
        child=y;
    }
    public static void Hello()
    {
        System.out.println("Hi");
    }
}