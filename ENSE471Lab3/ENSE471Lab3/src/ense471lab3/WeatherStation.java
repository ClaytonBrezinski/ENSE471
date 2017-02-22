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

    public void changeWeather(String inWeather)
    {
        this.currentWeather = inWeather;
        notifyListeners(false);
    }

    public void changeTemperature(double inTemperature)
    {
        this.currentTemperature = inTemperature;
        notifyListeners(true);
    }

    private void notifyListeners(boolean tempChange)
    {
        // this is not a very OO method of solving this problem
        WeatherEvent event = new WeatherEvent(this, this.currentTemperature, this.currentWeather);
        for (WeatherListener listener : listeners)
        {
            if (tempChange == true)
            {
                listener.temperatureChange(event);
            }
            else
            {
                listener.weatherChange(event);
            }
        }
    }
}

/*
 Purpose:
 Arguments:
 Outputs:
 Notes:
 */
