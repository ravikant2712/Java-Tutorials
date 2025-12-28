package java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// Added Files.readString() & Files.writeString()
public class FileMethodAdded {
	
	public static void main(String[] args) {
		try {
		Path path = Path.of("data.txt");
		System.out.println(path.toAbsolutePath());
		// Write
	//	Files.writeString(path, "Hello Java 1144444");
		// Read
		String content = Files.readString(path);
		System.out.println(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
