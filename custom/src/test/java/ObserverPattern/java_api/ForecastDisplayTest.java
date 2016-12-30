package ObserverPattern.java_api;

import org.junit.Test;

import java.util.Observable;

import static org.junit.Assert.assertEquals;

/**
 * Created by davicres on 30/12/2016.
 */
public class ForecastDisplayTest {
    @Test
    public void constructorTest() throws Exception {
        Observable subject = new Observable();
        CustomForecastDisplay customForecastDisplay = new CustomForecastDisplay(subject);
        assertEquals(1, subject.countObservers());
    }
}
