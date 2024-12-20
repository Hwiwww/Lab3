package Human;

import Enum.Job;

public class Molodec extends Human {
    private final double performance;
    private final String name;

    public Molodec(int age, String name, Job job, double performance) {
        super(age, name, job);
        this.performance = performance;
        this.name = name;
    }

    @Override
    public void work() {
        switch (getJob()) {
            case LAYER -> System.out.println(name + " закладывает фундамент из камня");
            case GLASSMAKER -> System.out.println(name + " закладывает хрусталь, строится мост из хрусталя");
            case MECHANIC -> System.out.println("Механик " + name + " собирает самсосильную машину.");
        }
    }

    public double getPerformance() {
        return performance;
    }
}
