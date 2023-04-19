package sg.edu.nus.iss;

import java.util.Random;
import java.util.UUID;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BankAccount dummyAccount = new BankAccount("Dummy", "122-34455-001", 100000);
        System.out.println(dummyAccount.toString());

        dummyAccount.deposit(100000);
        System.out.println(dummyAccount.toString());

        dummyAccount.withdrawal(50);
        System.out.println(dummyAccount.toString());

        dummyAccount.setClosed(true);
        dummyAccount.withdrawal(50);
        System.out.println(dummyAccount.toString());

        for(String transDetails: dummyAccount.getTransactions()){
            System.out.println(transDetails);
        }

        int n = 5;
        BankAccount [] bankAcct = new BankAccount[n];

        for (int i = 0 ; i < bankAcct.length; i++){
            String uuid = UUID.randomUUID().toString();
            
            float min = 1000.00f;
            float max = 100000.00f;
            Random randomNum = new Random();
            float initialBalance = min + randomNum.nextFloat();

            bankAcct[i] = new BankAccount("employee" + String.valueOf(i), uuid, initialBalance);
        }

        bankAcct[0].showAccount();
        bankAcct[1].withdrawal(100.00f);
        bankAcct[2].showAccount();

        FixedDeposit fredFixedD = new FixedDeposit("Fred", "002-11111-223-1", 30000.00f, 10.0f, 1);

        fredFixedD.deposit(20000.00f);
        fredFixedD.withdrawal(20000.00f);
        float computedBalance = fredFixedD.getBalance();
        System.out.println(fredFixedD.getAccountNumber() + "-" + fredFixedD.getFullName() + "--> Balance: " + computedBalance);

    }
}
