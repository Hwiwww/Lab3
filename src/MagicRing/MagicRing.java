package MagicRing;


import Human.Molodec;

import java.util.ArrayList;
import java.util.Random;
import Enum.Job;

public class MagicRing implements Magic {
    private String color;
    private int usages;


    public MagicRing(String color) {
        this.color = color;
        this.usages = 0;
    }

    @Override
    public ArrayList<Molodec> summon() throws UsagesException {
        if(usages>=1){
            throw new UsagesException();
        }
        Random random = new Random();
        ArrayList<Molodec> molodecs = new ArrayList<Molodec>();
        molodecs.add(new Molodec(66, "vasya", Job.MECHANIC, 26));
        int chance = random.nextInt(1, 101);
        if (chance <= 40) {
            molodecs.add(new Molodec(55, "serega", Job.LAYER, 26));
            molodecs.add(new Molodec(44, "ivan", Job.GLASSMAKER, 26));
        }
        else if (chance <= 60) {
            molodecs.add(new Molodec(44, "ivan", Job.GLASSMAKER, 26));
        }
        System.out.println("Кольцо вызвало Молодцов и исчезло.");
        usages += 1;
        return molodecs;
    }

    @Override
    public String toString() {
        return "Волшебное кольцо";
    }

    @Override
    public int hashCode() {
        return usages * 8;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        MagicRing ring = (MagicRing) obj;
        return usages == ring.usages
                && (color == ring.color);
    }

}
