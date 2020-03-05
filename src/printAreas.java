import java.io.*;
import java.util.*;

class printAreas{

private String stage;
private String day;
private String startTime;
private String input;
int i = 0;
private int count = 0;
private String fInput;
private String[] arrIn = new String[2976];
private File file;
private String temp = "";
private String[] val = new String[8];
private int opCounter = 0;

	public printAreas(String stage, String day, String startTime){
		
		this.stage = stage;
		this.day = day;
		this.startTime = startTime;
		fInput = "" + stage + "_" + day + "_" + startTime;

		try{
                  file = new File("/home/nirata/SWNNIS001/Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt");
  		
                  Scanner fl = new Scanner(file);
                  while(fl.hasNext()){
  
			arrIn[i] = fl.nextLine();

			i++;
                  }

	}catch(FileNotFoundException e){

		System.out.println("File Not Found!");
	
	}

	for(int j = 0; j != arrIn.length ; j++){

		input = arrIn[j];
		val = input.split(" ");	
		opCounter++;
		if(fInput.equals(val[0])){
			
			while(count<val.length-1){
			count++;
			temp = temp + val[count]+ " ";
			}

			break;

		}else if(j==arrIn.length-1){

			
			System.out.println("Data not found!");


		}


	}

}

	public int getCount(){


		return opCounter;

	}

	public String toString(){
		

		if(temp.equals(null)){

			System.out.println("Areas not found");

			return "Areas not found";

		}else{
			System.out.println(temp);
			return temp;

		}
  
  
        }


}

