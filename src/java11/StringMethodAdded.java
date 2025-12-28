package java11;


// New String Methods added - isBlank() , lines(), strip(), stripLeading(), stripTrailing(), repeat(int count)
public class StringMethodAdded {
	
	public static void main(String[] args) {
		
		//isBlank()
		String string = "  ";
		System.out.println("Checking Is Blank : " + string.isBlank());
		System.out.println("----------------------------");
		
		//lines() is NOT for printing, it is for processing lines.
		String textString = "Hello\nJava\nWorld";
		System.out.println(textString);
        textString.lines().forEach(System.out::println);
        
    	System.out.println("----------------------------");
    	//strip(), stripLeading(), stripTrailing()   - remove the spaces
    	String s = " Java ";
    	System.out.println("strip() : " + s.strip());  //removes both space
    	System.out.println("stripLeading() : " + s.stripLeading());   //removes space from start
    	System.out.println("stripTrailing() : " + s.stripTrailing());  //remove space from end

    	System.out.println("----------------------------");
    	// repeat(int count)  - Repeat the string
    	System.out.println("Java ".repeat(3));
    	
    	System.out.println("----------------------------");
    	
	}

}
