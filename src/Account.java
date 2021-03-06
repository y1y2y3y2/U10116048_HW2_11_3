//U10116048 楊明璋 作業2 11.3 BankAccount
import java.util.Date;
import java.util.Scanner;


public class Account {//模擬銀行
	Scanner keyin=new Scanner(System.in);//建立物件:Scanner
	private int id=0;//帳號
	private double balance=0;//餘額
	private double annualInterestRate=0.045;//年利息 題目指定
	private Date dateCreated;
	Account(){//no-arg constructor
		//建立default Account
		id=1;
		balance=0;
		annualInterestRate=0;
	}
	//accessor method for id
	public int getid(){
		return id;
	}
	//mutator method for id
	public void setId(){
		id=id+1;
	}
	
	//accessor method for balance
	public double getBalance(int id){
		return balance;
	}
	//mutator method for balance
	public void setBalance(int id){
			
	}
	//accesor method for create date
	public Date getDateCreated(){
		return dateCreated;
	}
	/*月利率*/
	public double getMonthlyInterestRate(){
		double MonthlyInterestRate=0;
		annualInterestRate=0.045;
		MonthlyInterestRate=annualInterestRate/12;//月利率=年利率/12
		return MonthlyInterestRate;
	}
	/*月利息*/
	public double getMonthlyInterest(){
		double MonthlyInterest=0;
		annualInterestRate=0.045;
		MonthlyInterest=balance+(balance*(annualInterestRate/12));//月息=餘額*(1+月利率)
		
		return MonthlyInterest;
	}
	/*領錢*/
	public void withDraw(){
		int money=0;//暫存器:用來放入提款金額
		System.out.println("請輸入提款金額");
		money=keyin.nextInt();
		balance=balance-money;//運算
		money=0;//運算完畢 暫存器歸零
		System.out.println("您已提款"+money+"元 餘額:"+balance+"元");
	}
	/*存錢*/
	public void deposit(){
		int put=0;
		System.out.println("請輸入存款金額");
		put=keyin.nextInt();
		balance=balance+put;
		put=0;
		System.out.println("您已完成存款"+put+"元 餘額:"+balance+"元");
	}
		
}
class SavingAccount extends Account{
	//儲蓄帳戶
	int id=0;//新的ID
	double annualInterestRate=0.045;//因為private不能繼承，故重新定義及初始化
	public void info(){
		System.out.println("您的ID:"+id);
		System.out.println("您的年利率:"+annualInterestRate);
		System.out.println("您的餘額:"+getBalance(id)+"元");
	}
}
class CheckingAccount extends Account{
	//支票帳戶
	int id=0;//新的ID
	double overl=10000;//透支額度 overdraft limit
	double annualInterestRate=0.045;//因為private不能繼承，故重新定義及初始化
	public void info(){
		System.out.println("您的ID:"+id);
		System.out.println("您的年利率:"+annualInterestRate);
		System.out.println("您的餘額:"+getBalance(id)+"元");
		System.out.println("您已透支:"+overl+"元");
	}
	
}
