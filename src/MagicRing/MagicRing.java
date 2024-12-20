package MagicRing;


import Human.Human;
import Human.Molodec;

import java.util.ArrayList;
import java.util.Random;
import Enum.Job;

public class MagicRing implements Magic {
    private final String color;
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
        molodecs.add(new Molodec(66, "Вася", Job.MECHANIC, 26));
        int chance = random.nextInt(1, 101);
        if (chance <= 40) {
            molodecs.add(new Molodec(55, "Серега", Job.LAYER, 30));
            molodecs.add(new Molodec(44, "Иван", Job.GLASSMAKER, 40));
        }
        else if (chance <= 60) {
            molodecs.add(new Molodec(44, "Иван", Job.GLASSMAKER, 40));
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
        if (!(obj instanceof MagicRing magicRing)) {
            return false;
        }
        return usages == magicRing.usages
                && (color.equals(magicRing.color));
    }

}
