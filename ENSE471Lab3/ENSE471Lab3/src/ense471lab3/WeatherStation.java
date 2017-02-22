/*
 Author: Clayton Brezinski
 UserID: 200220989
 Date:
 Notes:
 */
package ense471lab3;

import java.util.ArrayList;
import java.util.List;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/*

 @author Dolan
 */

 /*
 Purpose:
 Notes
 */
public class WeatherStation extends javax.swing.JFrame 
{
    private int MAX_HEIGHT = 800;
    private int MAX_WIDTH = 800;
    
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
        defaultSetupUI();
        
        //-- Entire Panel --
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.LIGHT_GRAY);
        mainPanel.setSize(MAX_WIDTH, MAX_HEIGHT);
        
        this.add(mainPanel);
        this.setVisible(true);
    }

    private void defaultSetupUI()
    {
        // Define the title for the frame
        this.setTitle("Weather Station");

        // Define the size of the frame
        this.setSize(MAX_HEIGHT, MAX_WIDTH);

        // open frame in the middle of the screen 
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPos, yPos);

        // disable resizability and set the default close operation for the frame
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
