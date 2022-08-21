package HorseTest;

import hippodrome.Horse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.MockedStatic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mockStatic;

public class MoveTest {


    @Test
    public void verifyGetRandomDouble(){
        try (MockedStatic<Horse> mockedStatic = mockStatic(Horse.class)){
            new Horse("Скакун",1,1).move();
            mockedStatic.verify(() -> Horse.getRandomDouble(0.2, 0.9));
        }
    }

    @ParameterizedTest
    @ValueSource(doubles = {0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9})
    public void checkFormulaMove(double randomMove){
        try (MockedStatic<Horse> mockedStatic = mockStatic(Horse.class)){
            Horse horse = new Horse("Скакун",1,1);
            mockedStatic.when(() -> Horse.getRandomDouble(0.2, 0.9)).thenReturn(randomMove);
            horse.move();
            double moveFormula = 1 + 1 * randomMove;
            assertEquals(moveFormula , horse.getDistance());
        }

    }
}
