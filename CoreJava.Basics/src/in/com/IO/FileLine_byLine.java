package in.com.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileLine_byLine {

	
	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("D:/Ram.txt");
		  
		BufferedReader br = new BufferedReader(reader);
		String line =br.readLine();
		while(line!=null) {
	
			System.err.println(line);	
			
			line=br.readLine();	
		}	
		reader.close();
	}
	
}
