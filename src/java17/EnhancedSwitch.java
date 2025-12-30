package java17;

// Supports expressions, arrows, and multiple labels.
// No break required
// Can return values
public class EnhancedSwitch {

    public static void main(String[] args) {

        String day = "Sat";

        String dayType = switch (day) {
            case "Sat", "Sun" -> "Weekend";
            default -> "Weekday";
        };

        System.out.println(dayType);
    }
}
