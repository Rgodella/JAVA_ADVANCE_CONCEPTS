package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fileHandle {
	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("src/main/resources/org1.txt");
		Scanner sc=new Scanner(f);
		List<String> lst=new ArrayList<String>();
		while(sc.hasNextLine()) {
			lst.add(sc.nextLine());
		}
		
		for(String s : lst) {
			System.out.println(s + " : ");
		}
				
	}

}
