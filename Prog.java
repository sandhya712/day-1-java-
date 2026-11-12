import java .util.Scanner;
public class Prog{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a,b,c;
        System.out.println("enter a number");
        a=sc.nextInt();
        System.out.println("enter a number");
        b=sc.nextInt();
        System.out.println("enter a number");
        c=sc.nextInt();
        int d=a+b-c;
        System.out.println(d);

    }
}