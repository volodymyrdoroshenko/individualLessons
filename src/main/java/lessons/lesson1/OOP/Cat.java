package lessons.lesson1.OOP;

public class Cat extends Participant {
    String name;
    int jump;
    int run;

    public Cat(String name) {
        this.name = name;
        this.jump = (int) (Math.random() * 100);
        this.run = (int) (Math.random() * 3000);
    }

    public Cat(String name, int jump, int run) {
        this.name = name;
        this.jump = jump;
        this.run = run;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getJump() {
        return jump;
    }

    public int getRun() {
        return run;
    }

    @Override
    public void running() {
        System.out.println("Cat is running...");
    }

    @Override
    public void jumping() {
        System.out.println("Cat is jumping...");
    }
}
