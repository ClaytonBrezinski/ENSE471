/*
 Author: Clayton Brezinski
 UserID: 200220989
 Date:
 Notes:
 */
package ense471lab3;

import java.util.ArrayList;
import java.util.List;

/*

 @author Dolan
 */

 /*
 Purpose:
 Notes
 */
public class WeatherStation
{

    private String currentWeather;
    private double currentTemperature;   // in degrees C

    // Listener list
    private List<WeatherListener> listeners = new ArrayList<WeatherListener>();

    /**
     Constructor
     */
    public WeatherStation()
    {
        this.currentWeather = "Sunny";
        this.currentTemperature = 21.0;
    }

    /**
     Add the given LightListener
     */
    public void addWeatherListener(WeatherListener inListener)
    {
        listeners.add(inListener);
        System.out.println("Added a listener");
    }
}
/*
Purpose:
Arguments:
Outputs: 
Notes:
*/
