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
import java.text.NumberFormat;
import javax.swing.text.NumberFormatter;

/*

 @author Dolan
 */

 /*
 Purpose:
 Notes
 */
public class WeatherStation extends javax.swing.JFrame
{
    private int MAX_HEIGHT = 500;
    private int MAX_WIDTH = 500;

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

        // User weather selection
        String[] weathers =
        {
            "Sunny", "Raining", "Overcast"
        };
        JComboBox weatherChoice = new JComboBox(weathers);
        weatherChoice.setSelectedIndex(1);
        weatherChoice.setPreferredSize(new Dimension(100,100));
        weatherChoice.addActionListener(new weatherChoiceListener((String) weatherChoice.getSelectedItem()));
        mainPanel.add(weatherChoice, BorderLayout.WEST);
        
        // User temperature Selection
        NumberFormat format = NumberFormat.getInstance();
        NumberFormatter formatter = new NumberFormatter(format);
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(0);
        formatter.setMaximum(Integer.MAX_VALUE);
        formatter.setAllowsInvalid(false);
        JFormattedTextField temperatureChoice = new JFormattedTextField(formatter);
        temperatureChoice.setValue(this.currentTemperature);
        temperatureChoice.addActionListener(new temperatureChoiceListener((double) temperatureChoice.getValue()));
        temperatureChoice.setPreferredSize(new Dimension(100,100));
        
        mainPanel.add(temperatureChoice, BorderLayout.EAST);

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

    class temperatureChoiceListener implements ActionListener
    {
        double temperatureChoice;

        temperatureChoiceListener(double inChoice)
        {
            this.temperatureChoice = inChoice;
        }

        public void actionPerformed(ActionEvent event)
        {
            JTextField jt= (JTextField)event.getSource();
            this.temperatureChoice = Double.parseDouble(jt.getText());
            changeTemperature(this.temperatureChoice);
        }
    }

    class weatherChoiceListener implements ActionListener
    {
        String weatherChoice;

        weatherChoiceListener(String inChoice)
        {
            this.weatherChoice = inChoice;
        }

        public void actionPerformed(ActionEvent event)
        {
            JComboBox cb = (JComboBox) event.getSource();
            this.weatherChoice = (String) cb.getSelectedItem();
            changeWeather(this.weatherChoice);
        }
    }

}

/*
 Purpose:
 Arguments:
 Outputs:
 Notes:
 */
