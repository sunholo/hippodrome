package MainTest;

import hippodrome.Main;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class MainTest {
    @Test
    @Disabled
    @Timeout(22)
    public void mainTest() throws Exception {
        Main.main(null);
    }
}
