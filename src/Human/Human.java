package Human;

import Bridge.Bridge;
import Enum.Job;

public abstract class Human {
    private final int age;
    private final String name;
    private final Job job;

    public Human(int age, String name, Job job) {
        this.age = age;
        this.name = name;
        this.job = job;
        setName(name);
        setAge(age);
    }
    public void setName(String name) throws ZeroException{
        if (name == null || name.trim().isEmpty()){
            throw new ZeroException( "Имя не может быть пустым");
        }
    }
    public void setAge(int name) throws ZeroException{
        if (age < 0){
            throw new ZeroException(" Возраст не может быть отрицательным");
        }
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
        if (!(obj instanceof Human  human)) {
            return false;
        }
        return age == human.getAge()
                && (name != null && name.equals(getName())) && (job == human.getJob());
    }
}
