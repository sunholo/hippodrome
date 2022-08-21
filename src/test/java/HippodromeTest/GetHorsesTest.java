package HippodromeTest;

import hippodrome.Hippodrome;
import hippodrome.Horse;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetHorsesTest {
    @Test
    public void checkListHorse(){
        List<Horse> horseList = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            horseList.add(new Horse(String.valueOf(i),i,i));
        }
        Hippodrome hippodrome = new Hippodrome(horseList);
        assertEquals(horseList, hippodrome.getHorses());
    }
}
