package observer_pattern.java_api;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by davicres on 30/12/2016.
 */
public class ForecastDisplayTest {

    private final WeatherData subject = new WeatherData();
    private final CustomForecastDisplay customForecastDisplay = new CustomForecastDisplay(subject);

    @Test
    public void constructorTest() {
        assertEquals(1, subject.countObservers());
    }

    @Test
    public void displayTest() {
        subject.setMeasurements(15.0f, 0.0f, 0.0f);
        assertEquals("observer temperature is NOT the same that the subject one",
                subject.getTemp(),
                customForecastDisplay.getTemp(),
                0.0);
    }
}
