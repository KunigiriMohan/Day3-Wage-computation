import java.util.Scanner;
class Bankdetails
{
	public static final String bank_Name="ICICI Bank ";
	
	public static void main(String[] args)
		{
		Bankdetails n = new Bankdetails();
		System.out.println("Enter Account number ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		
		switch(a)
			{
				case 1:
					n.method1();
				break;
				
				case 2:
					n.method2();
				break;

				default:
					n.method3();
				break;
			}
		}
	void method1() {
		int bank_Account_number = 123456789;
		String name_of_Customer = "Mohan";
		long mobile_number = 987654321;
		int age = 23;
		 
		System.out.println("Bank name : "+Bankdetails.bank_Name);
		System.out.println("Account number : "+bank_Account_number);
		System.out.println("Name : "+name_of_Customer);
		System.out.println("Age : "+age);
		System.out.println("Mobile number : "+mobile_number);
		}

	void method2() {
		int bank_Account_number = 546543464;
		String name_of_Customer = "Abcd";
		long mobile_number = 846366111;
		int age = 25;
		 
		System.out.println("Bank name : "+Bankdetails.bank_Name);
		System.out.println("Account number : "+bank_Account_number);
		System.out.println("Name : "+name_of_Customer);
		System.out.println("Age : "+age);
		System.out.println("Mobile number : "+mobile_number);
		}

	void method3() {
		int bank_Account_number = 656532122;
		String name_of_Customer = "Efgh";
		long mobile_number = 962142152;
		int age = 19;
		 
		System.out.println("Bank name : "+Bankdetails.bank_Name);
		System.out.println("Account number : "+bank_Account_number);
		System.out.println("Name : "+name_of_Customer);
		System.out.println("Age : "+age);
		System.out.println("Mobile number : "+mobile_number);
		}
}
