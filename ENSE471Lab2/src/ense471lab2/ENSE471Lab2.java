/*
Author: Clayton Brezinski
Student ID: 200220989
Notes:
*/
package ense471lab2;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Dolan
 */
public class ENSE471Lab2 extends javax.swing.JFrame
{
    private int MAX_HEIGHT = 800;
    private int MAX_WIDTH = 800;

    public ENSE471Lab2()
    {
        defaultSetup();
        
        
        
         //-- Entire Panel --
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.LIGHT_GRAY);
        mainPanel.setSize(MAX_WIDTH, MAX_HEIGHT);
        
        // North Pane
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new BoxLayout(northPanel, BoxLayout.LINE_AXIS));
        northPanel.setBackground(Color.GREEN);
        northPanel.setPreferredSize(new Dimension(MAX_WIDTH, 50));
        // add image for the pane 
        //northPanel.add()

        mainPanel.add(northPanel, BorderLayout.NORTH);
        
        // South Pane
        JPanel southPanel = new JPanel(new FlowLayout());
        southPanel.setBackground(Color.GREEN);
        southPanel.setPreferredSize(new Dimension(MAX_WIDTH, 50));
        mainPanel.add(southPanel, BorderLayout.SOUTH);
        

        
        
        
        // add the main panel
         this.add(mainPanel);
    }
    
    private void defaultSetup()
    {
        // Define the title for the frame
        this.setTitle("Flavours Of India");

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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new ENSE471Lab2().setVisible(true);
            }
        });
        
    }

}
/*
Purpose:
Arguments:
Outputs:
Notes:
*/