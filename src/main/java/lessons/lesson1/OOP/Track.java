package lessons.lesson1.OOP;

public class Track extends Obstacle {
    String name;
    int distance;

    public Track(String name) {
        this.name = name;
        this.distance = (int) (Math.random() * 1500);
    }

    public Track(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean overcome(Participant participant) {
        if (participant.getRun() > this.distance) {
            System.out.println("Participant " + participant.getName() + " passed " +
                    this.getName() + " (run = " + participant.getRun() + ", distance = " + this.distance + ")");
            return true;
        } else {
            System.out.println("Participant " + participant.getName() + " fail " +
                    this.getName() + " (run = " + participant.getRun() + ", distance = " + this.distance + ")");
            return false;
        }
    }
}
