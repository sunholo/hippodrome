package HippodromeTest;

import hippodrome.Hippodrome;
import hippodrome.Horse;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GetMoveTest {
    @Test
    public void moveTest(){
        List<Horse> horseList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            horseList.add(mock(Horse.class));
        }

        Hippodrome hippodrome = new Hippodrome(horseList);
        hippodrome.move();

        for (Horse horse : horseList){
            verify(horse).move();
        }
    }
}
