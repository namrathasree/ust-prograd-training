import java.util.Scanner;

class Account{
    public long accno;
    public long balance;
    public String name;

    Account(long balance){
        this.balance=balance;
    }
    public void details(){
        accno=123456;
        name="Namratha";
        System.out.println("Name of the Account Holder:  " +name);
        System.out.println("Account Number:  " +accno);
        System.out.println("Balance:  "+balance);
    }
    public void deposit(long amt)
    {
        this.balance=this.balance+ amt;
    }
    public void withdrawl(long withdrawAmt)
    {
        if(this.balance>=withdrawAmt){
            System.out.println("After withdraw your current balance is:"   +(this.balance-withdrawAmt));
        }
        else{
            System.out.println("Your balance is less than your withdraw amount");
        }
    }
}
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long amount = 10000;
        int n = 0;
        int a;
        String x;
        Account account = new Account(amount);
        do {
            System.out.println("Please Enter your Value");
            System.out.println("1.Deposit Amount\n 2.Withdraw Amount\n 3.Balance Amount");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("How much amout you want to deposit");
                    long depAmt=sc.nextLong();
                    account.deposit(depAmt);
                    break;
                case 2:
                    System.out.println("How much amout you want to withdraw");
                    long witAmt=sc.nextLong();
                    account.withdrawl(witAmt);
                    break;
                case 3:
                    account.details();
                    break;
                default:
                    System.out.println("You choose wrong Option");

            }
            System.out.println("Do you have another transaction(y/n)");
            x = sc.next();
            if (x == "n") {
                n = 1;
            }
        } while (n != 0);

    }
}

