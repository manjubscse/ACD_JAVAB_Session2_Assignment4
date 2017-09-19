//PROGRAM TO PRINT THE ASCII VALUE WITH TYPE OF VALUE MESSAGE

import java.util.Scanner;
public class TestDemo {

	// MAIN METHOD OF CLASS TESTDEMO
	public static void main(String[] args) {
		//DECLARE THE VARIABLE OF TYPE STRING
		String intNum ;
		//INITIATE THE SCANNER OBJECT FOR TAKING INPUTS FROM USER
		Scanner scanInput= new Scanner(System.in);
		//ASK THE USER TO ENTER A NUMBER 
		System.out.println("Enter the a Number");
		intNum=scanInput.next();
		
		// CHECK THE WHETER THE GIVEN INPUT IS GREATER THAN 0
		if (Integer.parseInt(intNum)>0){
			// PRINT THE BELOW MESSAGE WITH ASCII VALUE OF GIVEN INPUT
			System.out.println("You have entered Positive Value " + (int)intNum.toString().charAt(0));	
		}
		// CHECK THE WHETER THE GIVEN INPUT IS LESSER THAN 0
		else if(Integer.parseInt(intNum)<0){
			// PRINT THE BELOW MESSAGE WITH ASCII VALUE OF GIVEN INPUT
			System.out.println("You have entered Negetive Value " + (int)intNum.toString().charAt(0));	
		}
		// PRINT THE BELOW MESSAGE IF VALUE IS ZERO
		else
		{
			// PRINT THE BELOW MESSAGE WITH ASCII VALUE OF GIVEN INPUT
			System.out.println("You have entered Zero " + (int)intNum.toString().charAt(0));	
		}
		//CLOSE THE SCANNER OBJECT
		scanInput.close();
	}
}
