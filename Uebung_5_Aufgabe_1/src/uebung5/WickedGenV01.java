package uebung5;

import utility.ReadFile;

public class WickedGenV01 {

	public static void main(String[] args) {
		  
		System.out.println("Number of Arguments: " + args.length);
		if (args.length == 1) {
			String fullPathAndFilenameFromArgument = args[0];
			System.out.println("Filename passed as argument is: " + fullPathAndFilenameFromArgument);
			//READ configuration file
			ReadFile.readfile(fullPathAndFilenameFromArgument);
			
		}else {
			System.out.println("No Configuration file was provided when calling jar executable");
		}
	}

}
