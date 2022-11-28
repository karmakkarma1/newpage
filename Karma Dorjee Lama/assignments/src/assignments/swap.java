package assignments;

public class swap {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int sno=200; int tno=300; int fno=100;
		 System.out.println(" swap three Number");
		System.out.println(" Before Swap");
		System.out.println(" First number = " + sno);
		System.out.println(" Second number =" + tno);
		
		// value of sno is assined to temporary
		int temporary = sno;
		
		// vlaue of tno is assigned to sno
		sno = tno;
		
		// Value of temporary (which contains the initial value of sno ) is assined to tno
		sno = temporary;
		System.out.println(" After swap");
		System.out.println(" sno number = " + sno);
		System.out.println(" tno number =" + tno);
		
		{
			
		}
	}

}
