package Human;

public class ZeroException extends RuntimeException {
    private final String customMessage;

    public ZeroException(String message) {
        super(message);
        this.customMessage = message;
    }

    @Override
    public String getMessage() {
        return "ZeroException" + customMessage;
    }
}
