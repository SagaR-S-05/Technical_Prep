public class Main
{
    public static void main(String[] args) 
    {
        Human h1 = new Human(25);
        Human h2 = new Human(-30);
        System.out.println("Total humans created: "+Human.getAlive());
        
    }
}

class Human 
{
    private static int numberOfHumans;
    public static int age;
    Human(int age)
    {
        if(age<0 || age>200)
        {
            age=10;
        }
        numberOfHumans++;   
    }
    public static int getAlive()
    {
        return numberOfHumans;
    }
}

