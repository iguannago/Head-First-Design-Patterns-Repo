package ObserverPattern.java_api;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by davicres on 27/10/2016.
 */
public class ObserverPatternJavaAPITest {

    private final WeatherData weatherData = new WeatherData();

    @Test
    public void subjectTest() {
        assertNotNull(weatherData);
    }

    @Test
    public void observerTest() {
        assertNotNull(new CurrentConditionDisplay(weatherData));
    }
}
