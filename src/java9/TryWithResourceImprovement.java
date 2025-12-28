package java9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

// You can use a resource variable declared outside.
public class TryWithResourceImprovement {

	public static void main(String[] args) throws FileNotFoundException {
		
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
				
		try(br){   // Java 9: valid
			System.out.println(br.readLine());
		} catch(Exception exception) {
			
		}
	}
}
