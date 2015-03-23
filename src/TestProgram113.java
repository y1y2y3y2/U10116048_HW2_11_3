//U10116048 姓名:楊明璋 作業2 11.3 TestProgram
public class TestProgram113 {

	public static void main(String[] args) {
		int id;
		double ba;
		double air;
		double mi=0;
		//建立物件
		Account a1 =new Account();
		/*預設帳戶*/
		System.out.println("Account to String:"+a1);//toString() Method
		id=a1.getid();
		System.out.println("您的ID"+id);
		ba=a1.getBalance(id);
		System.out.println("您的餘額"+ba);
		air=a1.getMonthlyInterestRate()*12;
		System.out.println("您的年利率"+air);
		mi=a1.getMonthlyInterest();
		System.out.println("您的月息"+mi);
		/*儲蓄帳戶*/
		SavingAccount sa=new SavingAccount();
		System.out.println("Saving Account to String:"+sa);//toString() Method
		sa.info();
		/*支票帳戶*/
		CheckingAccount ca=new CheckingAccount();
		//toString() Method
		System.out.println("Checking Account to String:"+ca);
		ca.info();

	}

}
