/*
 Author: Clayton Brezinski
 UserID: 200220989
 Date:
 Notes:
 */
package ense471lab3;

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
public class WeatherSubscriber extends javax.swing.JFrame implements WeatherListener
{
    private int MAX_HEIGHT = 800;
    private int MAX_WIDTH = 800;
    
    private int id;

    public WeatherSubscriber(int inID)
    {
        this.id = inID;
        System.out.println("WeatherSubscriber: " + inID + ", created");
        defaultSetupUI();
        
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.DARK_GRAY);
        mainPanel.setSize(MAX_WIDTH, MAX_HEIGHT);
        
        this.add(mainPanel);
        this.setVisible(true);
    }

    private void defaultSetupUI()
    {
        // Define the title for the frame
        this.setTitle("Weather Subscriber: " + this.id);

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
    
    @Override
    public void weatherChange(WeatherEvent event)
    {
        System.out.println("WeatherSubscriber-" + id
                + ": I am notified of a weather change");

        if (event.temperature != 0 || event.weatherCondition != "")
        {
            System.out.println("WeatherSubscriber-" + id + ": temperature: " + event.temperature + " ,weather: " + event.weatherCondition);
        }
    }

    @Override
    public void temperatureChange(WeatherEvent event)
    {
        System.out.println("WeatherSubscriber-" + id
                + ": I am notified of a temperature change");

        if (event.temperature != 0 || event.weatherCondition != "")
        {
            System.out.println("WeatherSubscriber-" + id + ": temperature: " + event.temperature + " ,weather: " + event.weatherCondition);
        }
    }
}
/*
Purpose:
Arguments:
Outputs: 
Notes:
*/
