package Human;

import Enum.Job;

public class Molodec extends Human {
    private double performance;

    public Molodec(int age, String name, Job job, double performance) {
        super(age, name, job);
        this.performance = performance;
    }

    @Override
    public void work() {
        switch (getJob()) {
            case LAYER -> System.out.println("Серёга закладывает фундамент из камня");
            case GLASSMAKER -> System.out.println("Иван закладывает хрусталь, строится мост из хрусталя");
            case MECHANIC -> System.out.println("Механик Вася собирает самсосильную машину");
        }
    }

    public double getPerformance() {
        return performance;
    }
}
