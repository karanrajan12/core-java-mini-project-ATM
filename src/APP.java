import java.util.*;

import AccountDetails.UserDetails;
import Credentials.UserCredentials;
import Options.OperationsImplementation;
import Secuirity.UserSecuirity;
public class APP {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        OperationsImplementation operationsImplementation=new OperationsImplementation();
        UserDetails userDetails=new UserDetails();
        System.out.print("Enter The Card Number : ");
        String cardNumber=scan.next().trim();
        System.out.print("Enter The PIN Number : ");
        String pinNumber=scan.next().trim();
        if(UserSecuirity.hashpin(pinNumber).equals(UserCredentials.getHashpin(cardNumber))){
            System.out.println("Welcome\n1.Balance Inquiry\n2.Withdraw Amount\n3.Deposit Amount\n4.Mini Statement\n5.Exit\n\n");

            while(true){
                System.out.print("Select From The Above Options(Numbers) : ");
                int choice=scan.nextInt();
                if(choice==1){
                    operationsImplementation.balanceInguiry();
                }
                else if(choice==3){
                    System.out.print("Enter The Amount To Deposit : ");
                    double amount=scan.nextDouble();
                    System.out.println(amount +" Deposited Succesfully");
                    operationsImplementation.depositAmount(amount);
                }
                else if(choice==5){
                    System.exit(0);
                }
                else if(choice==2){
                    double withdrawAmount;
                    System.out.print("Enter the Amount to be Withdrawed : ");
                    withdrawAmount=scan.nextDouble();
                    operationsImplementation.withdrawAmount(withdrawAmount);
                }
                else if(choice==4){
                    operationsImplementation.miniStatement();
                }
                else{
                    System.out.println("Enter Numbers Only From the Above Mentioned Options");
                }
            }
        }
        else{
            System.out.println("Invalid Credentials");
            System.exit(0);
        }
    }
}
