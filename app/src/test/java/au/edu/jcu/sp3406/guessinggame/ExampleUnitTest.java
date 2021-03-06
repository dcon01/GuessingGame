package au.edu.jcu.sp3406.guessinggame;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void run_game() {

        boolean guessedCorrect = false;
        for (int i = 1; i < 10; ++i) {
            guessedCorrect = Game.check(i);
            if(guessedCorrect){
                break;
            }
        }
        assertTrue(guessedCorrect);

    //public void addition_isCorrect() {
    //    assertEquals(4, 2 + 2);
    }

}