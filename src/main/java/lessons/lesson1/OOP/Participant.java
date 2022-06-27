package lessons.lesson1.OOP;

public abstract class Participant {
    String name;
    int jump;
    int run;

    public String getName() {
        return name;
    }

    public int getJump() {
        return jump;
    }

    public int getRun() {
        return run;
    }

    public abstract void running();

    public abstract void jumping();
}
