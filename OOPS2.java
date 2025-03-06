import java.io.*;
public class OOPS2{
    public static void main(String[] args){
        SomeClass obj1=new SomeClass(10,20);
        SomeClass obj2=new SomeClass(30,40);
        // SomeClass.showStaticData(obj2);
        obj1.showNonStaticData(obj2);
    }
}
public class SomeClass{
    public static int staticInt;
    public int nonStaticInt;
    public SomeClass(int a, int b){
        staticInt=a;
        nonStaticInt=b;
    }
    public static void showStaticData(SomeClass x){
        System.out.println("Static : "+staticInt);
        System.out.println("Non static : "+x.nonStaticInt);
    }
    public void showNonStaticData(SomeClass x){
        System.out.println("Static : "+staticInt);
        System.out.println("Non static : "+nonStaticInt);
        System.out.println("Non static : "+x.nonStaticInt);
    }
}