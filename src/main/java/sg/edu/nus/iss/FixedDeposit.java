package sg.edu.nus.iss;

import java.util.Date;
import java.util.List;

public class FixedDeposit extends BankAccount {

  private float interest;
  private Integer duration;


  
  public FixedDeposit(String fullName, String accountNumber) {
    super(fullName, accountNumber);
  }

  
  public FixedDeposit(String fullName, String accountNumber, float balance, float interest) {
    super(fullName, accountNumber, balance);
    this.interest = interest;
  }


  public FixedDeposit(String fullName, String accountNumber, float balance, float interest, Integer duration) {
    super(fullName, accountNumber, balance);
    this.interest = interest;
    this.duration = duration;
  }



  
  public float getInterest() {
    return interest;
  }
  public void setInterest(float interest) {
    this.interest = interest;
  }
  public Integer getDuration() {
    return duration;
  }
  public void setDuration(Integer duration) {
    this.duration = duration;
  }
  @Override
  public void deposit(float amount) {
    // TODO Auto-generated method stub
    System.out.println("No Withdraw operation allowed.");
  }
  @Override
  public void withdrawal(float amount) {
    // TODO Auto-generated method stub
    System.out.println("No deposit operation allowed.");
  }
 
  public float getBalance(){
    return super.getBalance() * (100 + interest) / 100;
  }
  
}
  
  





  

  

