package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FIleReader {
	public static void main(String[] args) throws IOException {
		System.out.println("File Reader!");
		File f =new File("src/main/resources/org.txt");
		
		try {
			FileReader fr=new FileReader(f);
			int i;
			while((i=fr.read()) !=-1) {
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
