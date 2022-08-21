package HorseTest;

import hippodrome.Horse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ConstructorTest {
    @Test
    public void nullNameException() {
        assertThrows(IllegalArgumentException.class, () -> new Horse(null, 3, 3));
    }

    @Test
    public void nullNameMessageException() {
        try {
            new Horse(null, 3, 3);
        } catch (IllegalArgumentException e) {
            assertEquals("Name cannot be null.", e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {" ","\t","\n",""})
    public void whiteSpaceNameException(String name) {
        assertThrows(IllegalArgumentException.class, () -> new Horse(name, 3, 3));
    }

    @ParameterizedTest
    @ValueSource(strings = {" ","\t","\n",""})
    public void whiteSpaceNameMessageException(String name) {
    try {
        assertThrows(IllegalArgumentException.class, () -> new Horse(name, 3, 3));
    }catch (IllegalArgumentException e){
        assertEquals("Name cannot be blank.", e.getMessage());
    }
    }

    @Test
    public void negativeSpeedException() {
        assertThrows(IllegalArgumentException.class, () -> new Horse("Скакун", -3, 3));
    }

    @Test
    public void negativeSpeedMessageException() {
        try {
            new Horse("Скакун",-3,3);
        }catch (IllegalArgumentException e){
            assertEquals("Speed cannot be negative.", e.getMessage());
        }
    }

    @Test
    public void negativeDistanceException() {
        assertThrows(IllegalArgumentException.class, () -> new Horse("Скакун", 3, -3));
    }

    @Test
    public void negativeDistanceMessageException() {
        try {
            new Horse("Скакун", 3, -3);
        } catch (IllegalArgumentException e) {
            assertEquals("Distance cannot be negative.", e.getMessage());
        }

    }


}
