import java.util.*;
public class LSArrayApp{

public static void main(String[] args){
	

	int opNo = 0;
	String input;
	String[] arrIn = new String[3];
	Scanner kb = new Scanner(System.in);
	input = kb.nextLine();
	
	if(!input.equals("")){

		arrIn = input.split(" ");

		if(arrIn.length<3){
			
			System.out.println("Please enter a valid input in the form stage_month_time");
			System.exit(0);

		}
		printAreas pA = new printAreas(arrIn[0], arrIn[1], arrIn[2]);
		String s = pA.toString();
		opNo = pA.getCount();
	
	}else{

		printAllAreas pAl = new printAllAreas();
		String s = pAl.toString();
		opNo = pAl.getCount();
	
	}
	int total = opNo;
	System.out.println("The number of operations used is: " + total);

}
}
