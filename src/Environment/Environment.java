package Environment;

import java.util.ArrayList;
import java.util.Random;

public class Environment {
    private final ArrayList<River> rivers;
    private final ArrayList<Ravine> ravines;

    public Environment() {
        Random random = new Random();
        int river = random.nextInt(1, 5);
        int ravine = random.nextInt(1, 5);
        rivers = new ArrayList<>();
        ravines = new ArrayList<>();
        for (int i = 0; i < river; i++) {
            int randomWidth = random.nextInt(10) + 50;
            rivers.add(new River(randomWidth));
        }
        for (int i = 0; i < ravine; i++) {
            int randomWidth = random.nextInt(15) + 6000;
            ravines.add(new Ravine(randomWidth));
        }
    }


    public int getSumRiversWidth() {
        int width = 0;
        for (int i = 0; i < rivers.size(); i++) {
            width += rivers.get(i).width();
        }
        return width;
    }

    public int getSumRavinesWidth() {
        int width = 0;
        for (int i = 0; i < ravines.size(); i++) {
            width += ravines.get(i).width();

        }
        return width;
    }
}
