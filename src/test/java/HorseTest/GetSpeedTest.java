package HorseTest;

import hippodrome.Horse;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetSpeedTest {
    @Test
    public void getSpeedTest() {
        Horse horse = new Horse("Скакун", 3, 3);
        Field field;
        try {
            field = Horse.class.getDeclaredField("speed");
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        field.setAccessible(true);
        Double speed;
        try {
            speed = (Double) field.get(horse);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        assertEquals(speed, horse.getSpeed());

    }
}
