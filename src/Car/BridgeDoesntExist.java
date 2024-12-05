package Car;

public class BridgeDoesntExist extends Exception {
    @Override
    public String getMessage() {
        return "Машина не может проехать";
    }
}
