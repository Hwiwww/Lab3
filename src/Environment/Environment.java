package Environment;

import java.util.ArrayList;
import java.util.Random;

public class Environment {
    ArrayList<River> rivers;
    ArrayList<Ravine> ravines;

    public Environment(){
        Random random = new Random();
        int river = random.nextInt(1,5);
        int ravine = random.nextInt(1,5);
        rivers = new ArrayList<>();
        ravines = new ArrayList<>();
        for (int i = 0; i < river; i++) {
            rivers.add(new River(10));
        }
        for (int i = 0; i < ravine; i++) {
          ravines.add(new Ravine(15000));
        }
    }
    public void addRiver(River river){
        rivers.add(river);
    }
    public void addRavine(Ravine ravine){
        ravines.add(ravine);
    }
    public int getSumRiversWidth(){
        int width = 0;
        for (int i = 0; i < rivers.size(); i++) {
            width += rivers.get(i).width();
        }
        return width;
    }
    public int getSumRavinesWidth(){
        int width =0;
        for (int i = 0; i < ravines.size(); i++) {
            width += ravines.get(i).width();

        }
        return width;
    }
}
