import Bridge.Bridge;
import Environment.Environment;
import Human.*;
import Enum.*;
import Car.*;
import MagicRing.MagicRing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Semyon semyon = new Semyon(35, true, Job.UNEMPLOYED);
        MagicRing ring = new MagicRing("Жёлтый");
        Car car1 = new Car(50, true);
        ArrayList<Molodec> molodecs = semyon.useRing(ring);
        Environment environment = new Environment();
        Material material = null;
        switch (molodecs.size()) {
            case 1:
                material = Material.WOOD;
                break;
            default:
                material = Material.GLASS;
                break;
        }
        Bridge bridge = new Bridge(Bridge.calcLength(environment.getSumRiversWidth(), environment.getSumRavinesWidth()), material);
        double sumPerformance = 0;
        for (int i = 0; i < molodecs.size(); i++) {
            molodecs.get(i).work();
            sumPerformance += molodecs.get(i).getPerformance();
        }
        double time = bridge.getLength() / sumPerformance;
        DayTime dayTime;
        if (time <= 6) {
            dayTime = DayTime.NIGHT;
        } else if (time <= 12) {
            dayTime = DayTime.MORNING;

        } else if (time <= 18) {
            dayTime = DayTime.AFTERNOON;


        } else {
            dayTime = DayTime.EVENING;

        }
        if (dayTime == DayTime.NIGHT || dayTime == DayTime.MORNING) {
            bridge.isBuilt = true;
            System.out.println("Молодцы завершили работу в нужный срок. Мост построен.");
        } else {
            bridge.isBuilt = false;
            System.out.println("Молодцы не справились с роботой. Мост не построен.");
        }
        try {
            car1.travelOverBridge(bridge);
        } catch (BridgeDoesntExist e) {
            System.out.println(e.getMessage());
        }
    }


}