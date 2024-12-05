package Human;

import Enum.Job;
import MagicRing.*;


import java.util.ArrayList;

public class Semyon extends Human {
    boolean confidence;

    public Semyon(int age, boolean confidence, Job job) {
        super(age, "Семён", job);
        this.confidence = confidence;
    }

    public boolean getConfidence() {
        return confidence;
    }

    public void work() {
        switch (getJob()) {
            case UNEMPLOYED:
                break;
        }
    }

    public ArrayList<Molodec> useRing(MagicRing ring) {
        System.out.println("Семён переметнул кольцо с одной руки на другую.");
        try {
            return ring.summon();
        } catch (UsagesException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
