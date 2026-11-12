import java.util.Scanner;
class Bankaccount {
   double  balance=0;
   void deposit(int amount){
    balance=balance+amount;
    System.out.println("Integer deposit:"+amount);
    System.out.println("balance:"+balance);
   }
void deposit(double amount){
    balance=balance+amount;
    System.out.println("decimal deposit:"+amount);
    System.out.println("balance:"+balance);
}
void deposit(int amount,String description){
    balance=balance+amount;
    System.out.println("description:"+description);
    balance=balance+amount;

}
}
 class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Bankaccount account=new Bankaccount();
        System.out.println("enter interger deposit:");
        int a=sc.nextInt();
        account.deposit(a);
        System.out.println(" enter decimal deposit:");
        double b=sc.nextDouble();
        account.deposit(b);
        sc.nextLine();
        System.out.println("enter deposit amount:");
        int c=sc.nextInt();
        sc.nextLine();
        System.out.println("enter dscription:");
        String desc=sc.nextLine();
        account.deposit(c,desc);
        System.out.println("final account balance:"+account.balance);
        sc.close();

    }
}    
