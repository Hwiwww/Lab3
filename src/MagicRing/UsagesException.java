package MagicRing;

public class UsagesException extends Exception {
    @Override
    public String getMessage() {
        return "Кольцо исчезло.";
    }
}
