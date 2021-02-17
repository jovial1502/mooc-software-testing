package tudelft.ghappy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    private GHappy happy;

    @BeforeEach
    public void gHappyInit() {
        this.happy = new GHappy();
    }

    @Test
    public void oneTimeHappy() {
        happy.gHappy("xxggxx");
    }

    @Test
    public void oneTimeUnhappy() {
        happy.gHappy("xxgxx");
    }

    @Test
    public void manyTimesHappy() {
        happy.gHappy("xxggxxggxx");
    }

    @Test
    public void manyTimesHappyOneTimeNot() {
        happy.gHappy("xxggxxgxx");
    }

    @Test
    public void oneG() {
        happy.gHappy("g");
    }

    @Test
    public void noGs() {
        happy.gHappy("xxxx");
    }

    @Test
    public void nullString() {
        happy.gHappy(null);
    }
}
