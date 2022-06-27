package lessons.OOP;

import lessons.lesson1.OOP.Cat;
import lessons.lesson1.OOP.Wall;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WallTest {

    @Test
    @DisplayName("Obstacle Wall passed")
    void testOvercomeTrue() {
        Cat cat = new Cat("cat", 100, 200);
        Wall wall = new Wall("wall", 50);
        Assertions.assertTrue(wall.overcome(cat));
    }

    @Test
    @DisplayName("Obstacle Wall failed")
    void testOvercomeFalse() {
        Cat cat = new Cat("cat", 50, 200);
        Wall wall = new Wall("wall", 100);
        Assertions.assertFalse(wall.overcome(cat));
    }
}