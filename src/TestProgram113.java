//U10116048 �m�W:������ �@�~2 11.3 TestProgram
public class TestProgram113 {

	public static void main(String[] args) {
		int id;
		double ba;
		double air;
		double mi=0;
		//�إߪ���
		Account a1 =new Account();
		/*�w�]�b��*/
		System.out.println("Account to String:"+a1);//toString() Method
		id=a1.getid();
		System.out.println("�z��ID"+id);
		ba=a1.getBalance(id);
		System.out.println("�z���l�B"+ba);
		air=a1.getMonthlyInterestRate()*12;
		System.out.println("�z���~�Q�v"+air);
		mi=a1.getMonthlyInterest();
		System.out.println("�z���뮧"+mi);
		/*�x�W�b��*/
		SavingAccount sa=new SavingAccount();
		System.out.println("Saving Account to String:"+sa);//toString() Method
		sa.info();
		/*�䲼�b��*/
		CheckingAccount ca=new CheckingAccount();
		//toString() Method
		System.out.println("Checking Account to String:"+ca);
		ca.info();

	}

}
