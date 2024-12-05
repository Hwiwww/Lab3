package Car;

import Bridge.Bridge;
import Human.Human;

public class Car {
    private int speed;
    private boolean automotive;

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
        if(bridge.isBuilt){
            System.out.println( "Машина проехала по мосту" );
        }
        else{
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
        Car representative = (Car) obj;
        return speed == representative.getSpeed() && automotive == representative.isAutomotive();
    }

}
