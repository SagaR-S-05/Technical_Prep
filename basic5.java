import java.io.*;
import java.util.Scanner;
class basic5
{       
    public static void main(String[] args) 
    {
        // Underlying procedure of Scanner:
            // InputStreamReader isr  = new InputStreamReader(System.in);
            // BufferedReader br = new BufferedReader(isr);
            // int i = Integer.parseInt(br.readLine());
            // double d= Double.parseDouble(br.readLine());
            // float f = Float.parseFloat(br.readLine());
            // char c = br.readLine().split(" ")[0].charAt(0);
            // String s = br.readLine();
            // System.out.println("Integer"+i);
            // System.out.println("Double"+d);
            // System.out.println("Float"+f);
            // System.out.println("Character"+c);
            // System.out.println("String: "+s);

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        float f = scan.nextFloat();
        char c = scan.next().charAt(0); // Similar to str[0] in other languages.
        scan.nextLine();
        String s = scan.nextLine();
        System.out.println("Integer: "+i);
        System.out.println("Double: "+d);
        System.out.println("Float: "+f);
        System.out.println("Character: "+c);
        System.out.println("String: "+s);

    }
}