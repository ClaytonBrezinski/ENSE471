/*
 Author: Clayton Brezinski
 Student ID: 200220989
 Notes:
 */
package ense471lab3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**

 @author Dolan
 */
public class ENSE471Lab3
{
    private int MAX_HEIGHT = 800;
    private int MAX_WIDTH = 800;
    
    public ENSE471Lab3()
    {
        WeatherStation ws = new WeatherStation();
        WeatherSubscriber s1 = new WeatherSubscriber(1);
        WeatherSubscriber s2 = new WeatherSubscriber(2);
        WeatherSubscriber s3 = new WeatherSubscriber(3);
        
        ws.addWeatherListener(s1);
        ws.addWeatherListener(s2);
        ws.addWeatherListener(s3);
        
        ws.changeTemperature(30);
        ws.changeWeather("overcast");
    }

    /**
     @param args the command line arguments
     */
    public static void main(String[] args)
    {
    }
}
/*
Purpose:
Arguments:
Outputs:
Notes:
*/
