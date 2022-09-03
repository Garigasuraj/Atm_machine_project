import java.util.*;

public class Mainnn{
    public static void main(String[] args) {

        atm_opteration_interface obj = new atm_operation();
        
        Scanner Sc = new Scanner(System.in);
        System.out.println("Welcome To ATM Machine ");

        int atmNumber = 456123;
        int atmPin = 4258;

        System.out.println("Enter the ATM number: ");
        int Number = Sc.nextInt();
        System.out.println("Enter the ATM Pin: ");
        int pin = Sc.nextInt();

        if(Number == atmNumber && pin == atmPin){
            System.out.println(">>>Validation Done!!");
            System.out.println();
            while(true){
                System.out.println(" 1. View Balance \n 2. Withdraw Balance \n 3. Deposit Amount \n 4. Mini Statement \n 5. Exit");
                System.out.println("Please select the option");
                int option = Sc.nextInt();

                if(option == 1){
                    obj.Balance();
                }
                else if(option == 2){
                    System.out.println("Enter the amount in multiple of 500: ");
                    double amount = Sc.nextDouble();
                    obj.WithdrawBalance(amount);
                }
                else if(option == 3){
                    System.out.println("Enter amount to deposit: ");
                    double deposit_amount = Sc.nextDouble();
                    obj.DepositAmount( deposit_amount);
                }
                else if(option == 4){
                    obj.MiniStatement();
                    obj.Balance();
                }
                else if(option == 5){
                    System.out.println("Please! collect your card");
                    System.out.println("Thank you for choosing owr bank");
                    System.exit(0);
                }

            }
        }
        else{
            System.out.println("INVALID PIN");
            System.exit(0);
        }
    }
}