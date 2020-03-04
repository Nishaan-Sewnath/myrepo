import java.util.*;
import java.io.*;

public class printAllAreas{

private String[] temp = new String[2976];
private File file;
private String tempS = "";
private int opCounter = 0;


	public printAllAreas(){

		  int i = 0;

		try{
                  file = new File("/home/nirata/SWNNIS001/Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt");
                  Scanner fl = new Scanner(file);
  
                  while(fl.hasNext()){
  
                          temp[i] = fl.nextLine();
  
                          i++;
                  }

		}catch(FileNotFoundException e){

			System.out.println("File Not Found!");

		}

	}



	public int getCount(){

			return opCounter;


	}
	public String toString(){

		for(int j = 0; j < 2976; j++){

			 System.out.println(temp[j]);

		}
		
		return "done";

	}


}
