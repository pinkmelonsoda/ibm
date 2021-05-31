package utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import model.Spec; 

public class ReadFile {

	public static void readfile(String fileName) {
		 
		
		try {  
		File file = new File(fileName);    //creates a new file instance  
		FileReader fr = new FileReader(file);   //reads the file  
		BufferedReader br = new BufferedReader(fr);  //creates a buffering character input stream  
	 
		Spec spec = new Spec();
		String line;  
		while((line=br.readLine())!=null) {  
		  
			//If first Char is comment, continue
			char first = line.charAt(0);  
			if ( first == '#'  ) {
				continue;
			}
			
			//If first Char is comment, continue
			
			String[] splitedLine = line.split("\\s+");
			if (splitedLine.length >= 2) {
				if (splitedLine[0].equals("spec:bus")) {
					spec.bus = Integer.parseInt(splitedLine[1]);
				}
				else if (splitedLine[0].equals("spec:page")) {
					spec.page = Integer.parseInt(splitedLine[1]);
				}
				else if (splitedLine[0].equals("spec:ram")) {
					spec.ram = Integer.parseInt(splitedLine[1]);
				}
				else if (splitedLine[0].equals("spec:table")) {
					spec.table = splitedLine[1];
				}
				else if (splitedLine[0].equals("spec:entry")) {
					spec.entry = Integer.parseInt(splitedLine[1]);
				}
			} else {
				System.out.println("Line has no key and value");
			}
		 
		}  
		fr.close();    //closes the stream and release the resources  
		System.out.println("Content of Spec: ");  
		System.out.println("bus:  " + spec.bus); 
		System.out.println("page:  " + spec.page); 
		System.out.println("ram:  " + spec.ram); 
		System.out.println("table:  " + spec.table); 
		System.out.println("entry:  " + spec.entry);  
	 
		}  
		catch(IOException e) {  
			e.printStackTrace();  
		}  
	}  

}
