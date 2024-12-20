package Car;

import Bridge.Bridge;
import Human.Human;

public class Car {
    private final int speed;
    private final boolean automotive;

    public Car(int speed, boolean automotive) {
        this.speed = speed;
        this.automotive = automotive;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean isAutomotive() {
        return this.automotive;
    }

    public void travelOverBridge(Bridge bridge) throws BridgeDoesntExist {
        if (bridge.isBuilt) {
            System.out.println("Машина проехала по мосту.");
        } else {
            throw new BridgeDoesntExist();
        }

    }

    @Override
    public String toString() {
        return "Самоходная машина";
    }

    @Override
    public int hashCode() {
        return speed * 2;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Car car)){
            return false;
        }
        return speed == car.getSpeed() && automotive == car.isAutomotive();
    }

}
