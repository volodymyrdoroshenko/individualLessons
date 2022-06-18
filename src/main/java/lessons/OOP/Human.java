package lessons.OOP;

public class Human extends Participant {
    String name;
    int jump;
    int run;

    public Human(String name) {
        this.name = name;
        this.jump = (int) (Math.random() * 100);
        this.run = (int) (Math.random() * 3000);
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
        System.out.println("Human is running...");
    }

    @Override
    public void jumping() {
        System.out.println("Human is jumping...");
    }
}
