package lessons.OOP;

public class Wall extends Obstacle {
    String name;
    int height;

    public Wall(String name) {
        this.name = name;
        this.height = (int) (Math.random() * 50);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean overcome(Participant participant) {
        if (participant.getJump() > this.height) {
            System.out.println("Participant " + participant.getName() + " passed " +
                    this.getName() + " (jump = " + participant.getJump() + ", height = " + this.height + ")");
            return true;
        } else {
            System.out.println("Participant " + participant.getName() + " fail " +
                    this.getName() + " (jump = " + participant.getJump() + ", height = " + this.height + ")");
            return false;
        }
    }
}
