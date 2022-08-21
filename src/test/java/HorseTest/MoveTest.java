package HorseTest;

import hippodrome.Horse;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.mockStatic;

public class MoveTest {


    @Test
    public void verifyGetRandomDouble(){
        try (MockedStatic<Horse> mockedStatic = mockStatic(Horse.class)){
            new Horse("Скакун",1,1).move();
            mockedStatic.verify(() -> Horse.getRandomDouble(0.2, 0.9));
        }
    }
}
