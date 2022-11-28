import java.util.Scanner;

public class Calculate {

	int fno;
	int sno;
	int result;
	Scanner sc = new Scanner(System.in);

	void add() {
		System.out.println("Enter First Number :");
		fno = sc.nextInt();
		System.out.println("Enter Second Number: ");
		sno = sc.nextInt();
		result = fno + sno;
		System.out.println("Addition of Two NUmbers" + result);

	}
	void sub() {
		System.out.println("Enter First Number :");
		fno = sc.nextInt();
		System.out.println("Enter Second Number: ");
		sno = sc.nextInt();
		result = fno - sno;
		System.out.println("Sub of Two NUmbers"+ result);

	}
	void mul() {
		System.out.println("Enter First Number :");
		fno = sc.nextInt();
		System.out.println("Enter Second Number: ");
		sno = sc.nextInt();
		result = fno * sno;
		System.out.println("Multiplication of Two NUmbers"+ result);
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
Calculate demo=new Calculate();
while (true)
{
	System.out.println("**********");
	System.out.println("             1)ADD        			");
	System.out.println("             2)sub        			");
	System.out.println("             3)Mul        			");
	System.out.println("             4)Exit        			");
	System.out.println("**********");
	
	System.out.println("enter THe Choice");
	int choice = sc.nextInt();
	switch(choice)
	{
	case 1:
		demo.add();
		break;
	case 2:
		demo.sub();
		break;
	case 3:
		demo.mul();
		break;
	case 4:
		System.out.println("Thx for using APP!");
		System.exit(0);
		default :
			System.out.println("choose 1 to 4");
			
	}
	
}
	}//end of while
}