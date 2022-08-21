package HorseTest;

import hippodrome.Horse;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetNameTest {
    @Test
    public void getNameTest() {
        Horse horse = new Horse("Скакун", 3, 3);
        Field field;
        try {
            field = Horse.class.getDeclaredField("name");
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        field.setAccessible(true);
        String name;
        try {
            name = (String) field.get(horse);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        assertEquals(name, horse.getName());

    }
}
