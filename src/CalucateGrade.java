//PROGRAM TO CALCULATE THE GRADE ON THE AVERAGE 
import java.util.Scanner;
public class CalucateGrade {

	// MAIN METHOD FOR CLASS CALCULATEGRADE
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//INITIATE CLASS SCANNER FOR TAKING INPUT
		Scanner scanInput = new Scanner(System.in);
		double subPhysics,subChemistry,subMaths; //DECALRE VARIABLE OF TYPE DOUBLE

		//ASK THE USER TO ENTER THE MARKS FOR PHYSICS
		System.out.println("Please enter the marks for physics");
		subPhysics=scanInput.nextDouble();
		//ASK THE USER TO ENTER THE MARKS FOR CHEMISTRY
		System.out.println("Please enter the marks for Chemistry");
		subChemistry=scanInput.nextDouble();
		//ASK THE USER TO ENTER THE MARKS FOR MATHEMATICS
		System.out.println("Please enter the marks for Mathematics");
		subMaths=scanInput.nextDouble();
		
		// CHECK THE IF AVERAGE IS ABOVE 70
		if ((((subPhysics+subChemistry+subMaths)/300)*100)>70) {
			System.out.println("Grade A" );	
		}
		// CHECK THE IF AVERAGE IS ABOVE 60 AND BELOW 71
		else if (((((subPhysics+subChemistry+subMaths)/300)*100)>=61 ) && ((((subPhysics+subChemistry+subMaths)/300)*100)<=70))
		{
			System.out.println("Grade B" );	
		}
		//IF THE AVERAGE IS BELOW 61
		else
		{
			System.out.println("Grade C" );		
		}
		scanInput.close();
	}
}
