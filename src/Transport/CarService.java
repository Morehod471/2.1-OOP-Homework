package Transport;

public class CarService {
    public static String validTrait(String trait, String defaultValue) {
        return (trait == null || trait.isEmpty() || trait.isBlank()) ? defaultValue : trait;
    }

    public static Boolean validOption(Boolean value) {
        return value != null && value;
    }
}
