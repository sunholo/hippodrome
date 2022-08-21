package HorseTest;

import hippodrome.Horse;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetDistanceTest {
    @Test
    public void getDistanceTest() {
        Horse horse = new Horse("Скакун", 3, 3);
        Field field;
        try {
            field = Horse.class.getDeclaredField("distance");
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        field.setAccessible(true);
        Double distance;
        try {
            distance = (Double) field.get(horse);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        assertEquals(distance, horse.getDistance());

    }

    @Test
    public void getDistanceDefaultConstructorTest(){
       Horse horse = new Horse("Скакун",1);
        assertEquals(0,horse.getDistance());
    }
}
