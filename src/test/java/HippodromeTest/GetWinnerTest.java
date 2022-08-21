package HippodromeTest;

import hippodrome.Hippodrome;
import hippodrome.Horse;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertSame;

public class GetWinnerTest {
    @Test
    public void getWinner(){
        Horse h1 = new Horse("1",1,1);
        Horse h2 = new Horse("2",2,2);
        Horse h3 =new Horse("3",3,3);
        Hippodrome hippodrome = new Hippodrome(List.of(h1, h2, h3));

        assertSame(h3 , hippodrome.getWinner());

    }
}
