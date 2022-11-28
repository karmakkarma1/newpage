import java.util.Scanner;

public class Breakfast {

	int dosa_p = 50;
	int dosa_bill;
	int bonda_bill;
	int poori_p = 30;
	int poori_bill;
	int bonda_p = 20;
	int idly_p = 40;
	int idly_bill;
	Scanner sc = new Scanner(System.in);

	void idly()

	{
		System.out.println("How many plates do you want");
		int plates = sc.nextInt();
		idly_bill = plates * idly_p;
		System.out.println(plates + "Plates of idly bill: " + idly_bill);

	}


	void dosa() {
		System.out.println("How many plates do you want");
		int plates = sc.nextInt();
		dosa_bill = plates * dosa_p;
		System.out.println(plates + "Plates of dosa bill: " + dosa_bill);

	}

	void bonda() {
		System.out.println("How many plates do you want");
		int plates = sc.nextInt();
		bonda_bill = plates * bonda_p;
		System.out.println(plates + "Plates of bonda bill: " + bonda_bill);

	}

	void poori() {
		System.out.println("How many plates do you want");
		int plates = sc.nextInt();
		poori_bill = plates * poori_p;
		System.out.println(plates + "Plates of poori bill: " + poori_bill);

	}

	void bill() {

		System.out.println("idly bill: " + idly_bill);
		System.out.println("idly bill: " + poori_bill);
		System.out.println("idly bill: " + dosa_bill);
		System.out.println("idly bill: " + bonda_bill);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc1 = new Scanner(System.in);
		Breakfast demo = new Breakfast();
		while (true) {
			System.out.println("**********");
			System.out.println("             1)idly bill       			");
			System.out.println("             2)dosa bill  			");
			System.out.println("             3)bonda bill    			");
			System.out.println("             4)poori bill    			");
			System.out.println("             5)Bill      			");
			System.out.println("             6)Exit        			");
			System.out.println("**********");

			System.out.println("enter THe Breakfast");
			int choice = sc1.nextInt();
			switch (choice) {
			case 1:
				demo.idly();
				break;
			case 2:
				demo.dosa();
				break;
			case 3:
				demo.bonda();
				break;
			case 4:
				demo.poori();
				break;
			case 5:
				demo.bill();
				break;
			case 6:
				System.out.println("Thx for remembering our Resuatrant!");
				System.exit(0);
			default:
				System.out.println("choose 1 to 6");

			}

		}

	}
}
