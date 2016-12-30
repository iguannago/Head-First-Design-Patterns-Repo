package ObserverPattern.java_api;

import org.junit.Test;

import java.util.Observable;

import static org.junit.Assert.assertEquals;

/**
 * Created by davicres on 30/12/2016.
 */
public class ForecastDisplayTest {

    private final Observable subject = new Observable();
    private final CustomForecastDisplay customForecastDisplay = new CustomForecastDisplay(subject);

    @Test
    public void constructorTest() throws Exception {
        assertEquals(1, subject.countObservers());
    }

    @Test
    public void displayTest() throws Exception {


    }
}
