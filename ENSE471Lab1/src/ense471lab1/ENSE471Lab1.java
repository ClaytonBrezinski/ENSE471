/*
Clayton Brezinski
200220989
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

        // disable resizability and set the default close operation for the frame
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ----- Panel setup -----
        //-- Entire Panel --
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.LIGHT_GRAY);
        mainPanel.setLayout(null);
        mainPanel.setBounds(0, 0, MAX_WIDTH, MAX_HEIGHT);
        
        // -- Upper Panel --
        JPanel upperPanel = new JPanel();
        upperPanel.setBackground(Color.BLUE);
        upperPanel.setLayout(null);
        upperPanel.setBounds(0, 0, MAX_WIDTH, 50);

        // -- Center Panel --
        JPanel centerWhitePanel = new JPanel();
        centerWhitePanel.setBackground(Color.white);
        centerWhitePanel.setLayout(null);
        centerWhitePanel.setBounds(50 , upperPanel.getBounds().height + 50  , 375 , 175);
        centerWhitePanel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));

        // -- line across center panel
        JPanel lineInCenterPanel = new JPanel();
        lineInCenterPanel.setBackground(Color.DARK_GRAY);
        lineInCenterPanel.setLayout(null);
        lineInCenterPanel.setBounds(centerWhitePanel.getBounds().x - 40 , centerWhitePanel.getBounds().y - 60, centerWhitePanel.getBounds().width - 20 , 1);
        centerWhitePanel.add(lineInCenterPanel);
        
        mainPanel.add(centerWhitePanel);
        
        // ----- Label, Button, Textbox setup -----
        // --- UpperPanel Facebook Label ---
        JLabel lblFacebook = new JLabel("facebook");
        lblFacebook.setFont(new Font("heading", 0, 30));
        lblFacebook.setForeground(Color.WHITE);
        lblFacebook.setBounds(5, 5, 150, 50);
        upperPanel.add(lblFacebook);

        // --- Button ---
        JButton btnSignup = new JButton("Signup");
        btnSignup.setBackground(Color.GREEN);
        btnSignup.setForeground(Color.WHITE);
        btnSignup.setBounds(150, 25, 75, 20);
        upperPanel.add(btnSignup);

        mainPanel.add(upperPanel);

        // --- lblFacebookLogin ---
        JLabel lblFacebookLogin = new JLabel("Facebook Login");
        lblFacebookLogin.setFont(new Font("bold", 0, 20));
        lblFacebookLogin.setBounds(5, 1, 150, 40);
        centerWhitePanel.add(lblFacebookLogin);
        
        // --- label2 ---
        JLabel lblEmailOrPhone = new JLabel("Email or phone: ");
        lblEmailOrPhone.setBackground(Color.GREEN);
        lblEmailOrPhone.setBounds(20, 45, 100, 12);
        centerWhitePanel.add(lblEmailOrPhone);

        // --- text box ---
        JTextField txtEmailOrPhone = new JTextField();
        txtEmailOrPhone.setColumns(25);
        txtEmailOrPhone.setBounds(lblEmailOrPhone.getBounds().x + lblEmailOrPhone.getBounds().width + 5, lblEmailOrPhone.getBounds().y , 200, 20);
        centerWhitePanel.add(txtEmailOrPhone);

        // --- label2 ---
        JLabel lblPassword = new JLabel("Password: ");
        lblPassword.setBackground(Color.GREEN);
        lblPassword.setBounds(lblEmailOrPhone.getBounds().x , lblEmailOrPhone.getBounds().y + 20, 100, 12);
        centerWhitePanel.add(lblPassword);

        // --- text box ---
        JTextField txtPassword = new JTextField();
        txtPassword.setColumns(25);
        txtPassword.setBounds(lblPassword.getBounds().x + lblPassword.getBounds().width + 5, lblPassword.getBounds().y , 200, 20);
        centerWhitePanel.add(txtPassword);

        JCheckBox keepLoggedIn = new JCheckBox();
        keepLoggedIn.setBounds(txtEmailOrPhone.getBounds().x, lblPassword.getBounds().y + 20, 20, 20);
        centerWhitePanel.add(keepLoggedIn);
        
        // --- label4 ---
        JLabel lblKeepMeLoggedIn = new JLabel("Keep me logged in");
        lblKeepMeLoggedIn.setBounds(keepLoggedIn.getBounds().x + keepLoggedIn.getBounds().width , lblPassword.getBounds().y + 20, 150, 20);
        centerWhitePanel.add(lblKeepMeLoggedIn);
        

        // --- Button ---
        JButton btnLogin = new JButton("Log In");
        btnLogin.setBackground(Color.BLUE);
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setBounds(keepLoggedIn.getBounds().x, lblKeepMeLoggedIn.getBounds().y+ 20, 80,  20);
        centerWhitePanel.add(btnLogin);

        // --- label5 ---
        JLabel lblSignUpForFacebook = new JLabel("or Sign up for FaceBook");
        lblSignUpForFacebook.setForeground(Color.BLUE);
        lblSignUpForFacebook.setBounds(btnLogin.getBounds().x + btnLogin.getBounds().width + 5, btnLogin.getBounds().y, 200, btnLogin.getBounds().height);
        centerWhitePanel.add(lblSignUpForFacebook);

        // --- label6 ---
        JLabel lblForgotPassword = new JLabel("Forgot your password? ");
        lblForgotPassword.setForeground(Color.blue);
        lblForgotPassword.setBounds(btnLogin.getBounds().x, btnLogin.getBounds().y + 20, 200, 20);
        centerWhitePanel.add(lblForgotPassword);

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
