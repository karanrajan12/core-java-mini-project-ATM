package Options;

import AccountDetails.UserDetails;

import java.util.HashMap;
import java.util.Map;

public class OperationsImplementation implements OperationsInterface{
    UserDetails userDetails=new UserDetails();
    HashMap<Double,String> ministats=new HashMap<>();
    @Override
    public void balanceInguiry() {
        System.out.println("Available Balance : "+userDetails.getBalance());
    }

    public void withdrawAmount(double amount){
        if(amount<=userDetails.getBalance()){
            ministats.put(amount," Cash Withdrawn");
            System.out.println("Collect Your Cash of "+amount);
            userDetails.setBalance(userDetails.getBalance()-amount);
        }
        else{
            System.out.println("Insufficient Balance...!!!!");
        }
    }

    public void depositAmount(double amount){
        ministats.put(amount," Cash Deposited");
        userDetails.setBalance(userDetails.getBalance()+amount);
    }

    public void miniStatement(){
        for(Map.Entry<Double,String> ms:ministats.entrySet()){
            System.out.println(ms.getKey()+" "+ms.getValue());
        }
    }
}
