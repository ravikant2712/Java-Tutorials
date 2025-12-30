package java17;

// Multi-line strings without messy concatenation.
public class TextBlocks {


    public static void main(String[] args) {
        // Before
        String json = "{\n" +
                "  \"name\": \"Ravi\"\n" +
                "}";

        // After Cleaner and Redable
        String json2 = """
                {
                   "name": "Ravi"
                }
                """;

        System.out.println(json);
        System.out.println("--------------------------------------------");
        System.out.println(json2);
    }
}
