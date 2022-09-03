import java.util.HashMap;
import java.util.Map;

public class atm_operation implements atm_opteration_interface{
    atm obj = new atm();
    HashMap<Double,String> obj1 = new HashMap<Double,String>();

    @Override
    public void Balance() {
        System.out.println("Available Balance: Rs."+ obj.getViewBalance());
        System.out.println();
    }
 
    @Override
    public void WithdrawBalance(double WithdrawBalance) {
        if(WithdrawBalance % 500 == 0){
            if(obj.getDepositAmount() <= WithdrawBalance){
                obj1.put(WithdrawBalance,"---> Amount Withdrawn");
                System.out.println("please collect the cash: "+ WithdrawBalance);
                obj.setViewBalance(obj.getViewBalance() - WithdrawBalance);
            }
            else{
                System.out.println("Transaction has been declined due to Insufficient balance");
            }
        }
        else{
            System.out.println("Please enter the amount in multiple of 500");
        }
    }

    @Override
    public void DepositAmount(double DepositAmount) {
        obj1.put(DepositAmount,"---> Amount Deposited");
        System.out.println(DepositAmount+" Deposited Successfully!");
        System.out.println();
        obj.setViewBalance(obj.getViewBalance()+DepositAmount);
        //Balance();
    }

    @Override
    public void MiniStatement() {
        for(Map.Entry<Double, String> print : obj1.entrySet()){
            System.out.println(print.getKey()+" "+print.getValue());
        }
        System.out.println();
    }
    
}
