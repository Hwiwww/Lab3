package Human;

import Enum.Job;

public abstract class Human {
    private int age;
    private String name;
    private Job job;

    public Human(int age, String name, Job job) {
        this.age = age;
        this.name = name;
        this.job = job;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return name;
    }

    public Job getJob() {
        return job;
    }

    public abstract void work();

    @Override
    public String toString() {
        return String.format("Человек по имени %s", name);
    }

    @Override
    public int hashCode() {
        return age * 14 + name.hashCode() * 7 + job.hashCode() - 2;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        Human person = (Human) obj;
        return age == person.getAge()
                && (name != null && name.equals(getName())) && (job == person.getJob());
    }
}
