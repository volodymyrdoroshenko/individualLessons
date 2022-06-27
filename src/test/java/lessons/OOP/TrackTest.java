package lessons.OOP;

import lessons.lesson1.OOP.Cat;
import lessons.lesson1.OOP.Track;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TrackTest {

    @Test
    @DisplayName("Obstacle Track passed")
    void testOvercomeTrue() {
        Cat cat = new Cat("cat", 100, 2000);
        Track track = new Track("track", 1500);
        Assertions.assertTrue(track.overcome(cat));
    }

    @Test
    @DisplayName("Obstacle Track failed")
    void testOvercomeFalse() {
        Cat cat = new Cat("cat", 50, 1000);
        Track track = new Track("track", 1500);
        Assertions.assertFalse(track.overcome(cat));
    }
}