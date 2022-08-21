package HippodromeTest;

import hippodrome.Hippodrome;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ConstructorTest {

    @Test
    public void nullConstructorException() {
        assertThrows(IllegalArgumentException.class, () -> new Hippodrome(null));
    }
    @Test
    public void nullConstructorMassageException() {
        assertThrows(IllegalArgumentException.class, () -> new Hippodrome(null));
        try {
            new Hippodrome(null);
        } catch (IllegalArgumentException e) {
            assertEquals("Horses cannot be null.", e.getMessage());
        }
    }
    @Test
    public void emptyListConstructorException() {
        assertThrows(IllegalArgumentException.class, () -> new Hippodrome(new ArrayList<>()));
    }

    @Test
    public void emptyListConstructorMassageException() {
        try {
            new Hippodrome(new ArrayList<>());
        }catch (IllegalArgumentException e){
            assertEquals(e.getMessage(), "Horses cannot be empty.");
        }

    }


}
