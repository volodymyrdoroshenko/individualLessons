package lessons.OOP;

public class Main {

    public static void main(String[] args) {
        Participant[] participants = getParticipants();
        Obstacle[] obstacles = getObstacles();
        passingCheck(participants, obstacles);
    }

    public static void passingCheck(Participant[] participants, Obstacle[] obstacles) {
        System.out.println();
        for (int i = 0; i < participants.length; i++) {
            for (Obstacle obstacle : obstacles) {
                if (participants[i] != null && !obstacle.overcome(participants[i])) {
                    System.out.println("Dropped out of the competition!");
                    participants[i] = null;
                }
            }
            System.out.println();
        }
        System.out.print("Passed all obstacles: ");
        for (Participant participant : participants) {
            if (participant != null)
                System.out.print("\t" + participant.getName());
        }
        System.out.println();
    }

    public static Participant[] getParticipants() {
        Cat cat1 = new Cat("cat1");
        Cat cat2 = new Cat("cat2");
        Human human1 = new Human("human1");
        Human human2 = new Human("human2");
        Robot robot1 = new Robot("robot1");
        Robot robot2 = new Robot("robot2");
        return new Participant[]{cat1, cat2, human1, human2, robot1, robot2};
    }

    public static Obstacle[] getObstacles() {
        Wall wall1 = new Wall("wall1");
        Wall wall2 = new Wall("wall2");
        Track track1 = new Track("track1");
        Track track2 = new Track("track2");
        return new Obstacle[]{wall1, wall2, track1, track2};
    }
}
