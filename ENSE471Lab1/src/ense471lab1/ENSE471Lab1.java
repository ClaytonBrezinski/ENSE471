/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ense471lab1;

import java.awt.*;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

/**
 *
 * @author clayt
 */
public class ENSE471Lab1 extends javax.swing.JFrame
{

    /**
     * Creates new form ENSE471Lab1
     */
    public ENSE471Lab1()
    {
        // Define the title for the frame
        this.setTitle("Facebook");

        int MAX_HEIGHT = 500;
        int MAX_WIDTH = 500;
        // Define the size of the frame
        this.setSize(MAX_HEIGHT, MAX_WIDTH);

        // open frame in the middle of the screen 
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPos, yPos);

        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //-- Entire Panel --
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.LIGHT_GRAY);
        mainPanel.setLayout(null);
        mainPanel.setBounds(0, 0, MAX_WIDTH, 50);
        
        // -- Upper Panel --
        JPanel upperPanel = new JPanel();
        upperPanel.setBackground(Color.BLUE);
        upperPanel.setLayout(null);
        upperPanel.setBounds(0, 0, MAX_WIDTH, 50);

        // --- label ---
        JLabel labelA = new JLabel("facebook");
        labelA.setFont(new Font("heading", 0, 30));
        labelA.setForeground(Color.white);
        labelA.setBounds(5, 5, 150, 50);
        upperPanel.add(labelA);

        // --- Button ---
        JButton button1 = new JButton("Signup");
        button1.setBackground(Color.GREEN);
        button1.setBounds(150, 25, 75, 20);
        upperPanel.add(button1);

        mainPanel.add(upperPanel);

        // -- Center Panel --
        JPanel centerWhitePanel = new JPanel();
        centerWhitePanel.setBackground(Color.yellow);
        centerWhitePanel.setLayout(null);
        centerWhitePanel.setBounds(5, 55, MAX_WIDTH, MAX_HEIGHT - 56);

        mainPanel.add(centerWhitePanel);

        // --- label ---
        JLabel label1 = new JLabel("Email or phone");
        label1.setBackground(Color.GREEN);
        label1.setBounds(5, 15, 100, 40);
        centerWhitePanel.add(label1);

        // --- text box ---
        JTextField textField1 = new JTextField();
        textField1.setColumns(25);
        centerWhitePanel.add(textField1);

        // --- label ---
        JLabel label2 = new JLabel("Password");
        centerWhitePanel.add(label2);

        // --- text box ---
        JTextField textField2 = new JTextField();
        textField2.setColumns(25);
        centerWhitePanel.add(textField2);

        // --- label ---
        JLabel label3 = new JLabel("Keep me logged in");

        centerWhitePanel.add(label3);

        // --- Button ---
        JButton button2 = new JButton("Login");
        centerWhitePanel.add(button2);

        // --- label ---
        JLabel label4 = new JLabel("or Sign up for FaceBook                      ");
        //label4.setFont();
        centerWhitePanel.add(label4);

        // --- label ---
        JLabel label5 = new JLabel("Forgot your password? ");
        //label3.label5();
        centerWhitePanel.add(label5);

        this.add(mainPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new ENSE471Lab1().setVisible(true);
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
