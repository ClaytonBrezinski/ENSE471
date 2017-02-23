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
    private int MAX_HEIGHT = 400;
    private int MAX_WIDTH = 400;
    
    private int id;

    JPanel mainPanel;
    JLabel label;
    
    public WeatherSubscriber(int inID)
    {
        this.id = inID;
        System.out.println("WeatherSubscriber: " + inID + ", created");
        defaultSetupUI();
        
        this.mainPanel = new JPanel(new BorderLayout());
        this.mainPanel.setBackground(Color.DARK_GRAY);
        this.mainPanel.setSize(MAX_WIDTH, MAX_HEIGHT);
        
        label = new JLabel();
        label.setText("Temperature: 21 C");
        label.setPreferredSize(new Dimension(100,100));
        
        mainPanel.add(label, BorderLayout.CENTER);
        this.add(this.mainPanel);
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
        
        if (event.weatherCondition != "")
        {
            if (event.weatherCondition.equalsIgnoreCase("sunny"))
            {
                this.mainPanel.setBackground(Color.YELLOW);
            }
            else if (event.weatherCondition.equalsIgnoreCase("overcast"))
            {
                this.mainPanel.setBackground(Color.LIGHT_GRAY);
            }
            else if (event.weatherCondition.equalsIgnoreCase("raining"))
            {
                this.mainPanel.setBackground(Color.BLUE);
            }
            else
            {
                this.mainPanel.setBackground(Color.DARK_GRAY);
            }
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
        this.label.setText("Temperature: " + Double.toString(event.temperature) + " C");
    }
}
/*
Purpose:
Arguments:
Outputs: 
Notes:
*/
