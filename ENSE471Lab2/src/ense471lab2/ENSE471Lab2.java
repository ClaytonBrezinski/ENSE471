/*
 Author: Clayton Brezinski
 Student ID: 200220989
 Notes:
 */
package ense471lab2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**

 @author Dolan
 */
public class ENSE471Lab2 extends javax.swing.JFrame
{
    private int MAX_HEIGHT = 800;
    private int MAX_WIDTH = 800;
    
    double cartTotal;
    JLabel lblTotalCartCost;
    
    public ENSE471Lab2()
    {
        defaultSetup();

        //-- Entire Panel --
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.LIGHT_GRAY);
        mainPanel.setSize(MAX_WIDTH, MAX_HEIGHT);

        // North Pane
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new BoxLayout(northPanel, BoxLayout.Y_AXIS));
        northPanel.setBackground(Color.LIGHT_GRAY);
        northPanel.setPreferredSize(new Dimension(MAX_WIDTH, 250));
        // add image for the pane 
        ImageIcon image = new ImageIcon("src/Resources/image.jpg");
        JLabel label = new JLabel("", image, JLabel.CENTER);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(label, BorderLayout.CENTER);
        northPanel.add(panel);

        // add navigational buttons panel
        JPanel navigationPanel = new JPanel(new FlowLayout());
        JButton btnHome = new JButton("Home");
        navigationPanel.add(btnHome);
        JButton btnAboutUs = new JButton("About Us");
        navigationPanel.add(btnAboutUs);
        JButton btnMenu = new JButton("Menu");
        navigationPanel.add(btnMenu);
        JButton btnCoupon = new JButton("Coupon");
        navigationPanel.add(btnCoupon);
        JButton btnSpecials = new JButton("Specials");
        navigationPanel.add(btnSpecials);
        JButton btnContact = new JButton("Contact");
        navigationPanel.add(btnContact);
        northPanel.add(navigationPanel);

        mainPanel.add(northPanel, BorderLayout.NORTH);

        // South Pane
        JPanel southPanel = new JPanel(new FlowLayout());
        southPanel.setBackground(Color.GREEN);
        southPanel.setPreferredSize(new Dimension(MAX_WIDTH, 50));
        
        JLabel designedBy = new JLabel("designed by clayton");
        southPanel.add(designedBy);
        
        lblTotalCartCost = new JLabel("Total Cart Cost: $" + String.format("%.2f", cartTotal));
        lblTotalCartCost.setFont(new Font("heading", 0, 30));
        southPanel.add(lblTotalCartCost);
        
        
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        // Buffer panels
        JPanel eastPanel = new JPanel();
        eastPanel.setPreferredSize(new Dimension(50, MAX_HEIGHT));
        mainPanel.add(eastPanel, BorderLayout.EAST);
        JPanel westPanel = new JPanel();
        westPanel.setPreferredSize(new Dimension(50, MAX_HEIGHT));
        mainPanel.add(westPanel, BorderLayout.WEST);
        
        JTabbedPane tabsPane = new JTabbedPane();
        tabsPane.setBackground(Color.ORANGE);
        tabsPane.setPreferredSize(new Dimension(MAX_WIDTH - 100, MAX_HEIGHT));

        // Appetizers Panel
        JPanel itemDescriptionPanelA = new JPanel();
        itemDescriptionPanelA.setBackground(Color.ORANGE);
        itemDescriptionPanelA.setLayout(new BoxLayout(itemDescriptionPanelA, BoxLayout.Y_AXIS));
        
        JPanel a1 = new JPanel();
        a1.setBackground(Color.ORANGE);
        a1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        fillInPanel(a1,"Veggie Samosa (2 pcs)", "Crisp patties stuffed with potatoes, served with tamarind sauce.", 3.00);
        itemDescriptionPanelA.add(a1);
        
        JPanel a2 = new JPanel();
        a2.setBackground(Color.ORANGE);
        a2.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        fillInPanel(a2,"Aaloo Tikki (2 pcs)", "Mashed potato patties deep fried served with chutney.", 3.50);
        itemDescriptionPanelA.add(a2);
        
        JPanel a3 = new JPanel();
        a3.setBackground(Color.ORANGE);
        a3.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        fillInPanel(a3,"Chicken Samosa (2 pcs)", "Crisp patties stuffed with minced chicken & bell peppers. Served with chutney.", 5.00);
        itemDescriptionPanelA.add(a3);
        
        JPanel a4 = new JPanel();
        a4.setBackground(Color.ORANGE);
        a4.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        fillInPanel(a4,"Chaat Papri", "Crisp Chips made with flour, mixed with potatoes, chick peas, tamarind sauce, mint sauce & Indian spices.", 7.99);
        itemDescriptionPanelA.add(a4);
        
        tabsPane.addTab("Appetizers", itemDescriptionPanelA);

        //Specialties Panel
        JPanel itemDescriptionPanelB = new JPanel();
        itemDescriptionPanelB.setBackground(Color.ORANGE);
        itemDescriptionPanelB.setLayout(new BoxLayout(itemDescriptionPanelB, BoxLayout.Y_AXIS));
        tabsPane.addTab("Specialties", itemDescriptionPanelB);
        
        JPanel b1 = new JPanel();
        b1.setBackground(Color.ORANGE);
        b1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        fillInPanel(b1,"Chicken Tikka", "Chickent breast marinated with yogurt, cream & saffron spices, roasted in clay oven, served with salad & chutney.",13.99);
        itemDescriptionPanelB.add(b1);
        
        JPanel b2 = new JPanel();
        b2.setBackground(Color.ORANGE);
        b2.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        fillInPanel(b2,"Tandoori Chicken", "Chicken marinated in traditional spices with ginger, garlic & yogurt, roasted in clay oven (6 pieces).", 13.99);
        itemDescriptionPanelB.add(b2);
        
        JPanel b3 = new JPanel();
        b3.setBackground(Color.ORANGE);
        b3.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        fillInPanel(b3,"Paneer Tikka Masala", "Crisp patties stuffed with potatoes, served with tamarind sauce.", 14.99);
        itemDescriptionPanelB.add(b3);
        
        JPanel b4 = new JPanel();
        b4.setBackground(Color.ORANGE);
        b4.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        fillInPanel(b4,"Tandoori Chicken Wings", "Hot or honey garlic (10 pieces) made in clay oven.", 9.99);
        itemDescriptionPanelB.add(b4);
        
        //Side Orders Panel
        JPanel itemDescriptionPanelC = new JPanel();
        itemDescriptionPanelC.setBackground(Color.ORANGE);
        itemDescriptionPanelC.setLayout(new BoxLayout(itemDescriptionPanelC, BoxLayout.Y_AXIS));
        tabsPane.addTab("SideOrders", itemDescriptionPanelC);
        
        JPanel c1 = new JPanel();
        c1.setBackground(Color.ORANGE);
        c1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        fillInPanel(c1,"Dahi Bhalla", "Specially made lentil balls mixed with yogurt & chutney.", 5.99);
        itemDescriptionPanelC.add(c1);
        
        JPanel c2 = new JPanel();
        c2.setBackground(Color.ORANGE);
        c2.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        fillInPanel(c2,"Raita", "Yogurt mixed with cucumbers, carrots, herbs and spices", 2.99);
        itemDescriptionPanelC.add(c2);
        
        JPanel c3 = new JPanel();
        c3.setBackground(Color.ORANGE);
        c3.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        fillInPanel(c3,"Papdum or Pickles or Mango Chutney", "Spicy lentil wafer roasted or deep fried.", 0.99);
        itemDescriptionPanelC.add(c3);
        
        JPanel c4 = new JPanel();
        c4.setBackground(Color.ORANGE);
        c4.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        fillInPanel(c4,"Green Salad or Onion Salad", "Crisp patties stuffed with potatoes, served with tamarind sauce.", 2.99);
        itemDescriptionPanelC.add(c4);
        
        //Dessert Panel
        JPanel itemDescriptionPanelD = new JPanel();
        itemDescriptionPanelD.setBackground(Color.ORANGE);
        itemDescriptionPanelD.setLayout(new BoxLayout(itemDescriptionPanelD, BoxLayout.Y_AXIS));
        tabsPane.addTab("Dessert", itemDescriptionPanelD);
        
        JPanel d1 = new JPanel();
        d1.setBackground(Color.ORANGE);
        d1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        fillInPanel(d1,"Ras Malai", "Crisp patties stuffed with potatoes, served with tamarind sauce.", 2.99);
        itemDescriptionPanelD.add(d1);
        
        JPanel d2 = new JPanel();
        d2.setBackground(Color.ORANGE);
        d2.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        fillInPanel(d2,"Gulab Jamun", "Crisp patties stuffed with potatoes, served with tamarind sauce.", 1.50);
        itemDescriptionPanelD.add(d2);
        
        JPanel d3 = new JPanel();
        d3.setBackground(Color.ORANGE);
        d3.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        fillInPanel(d3,"Kheer/Rice Pudding", "Crisp patties stuffed with potatoes, served with tamarind sauce.", 3.00);
        itemDescriptionPanelD.add(d3);
        
        JPanel d4 = new JPanel();
        d4.setBackground(Color.ORANGE);
        d4.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        fillInPanel(d4,"The Best Shit Ever", "I'm dead serious, and only $5.00", 5.00);
        itemDescriptionPanelD.add(d4);
        
        //centerPanel.add(tabsPane);
        mainPanel.add(tabsPane, BorderLayout.CENTER);

        // add the main panel
        this.add(mainPanel);
    }
    
    private void fillInPanel(JPanel originalPanel, String name, String description, double cost)
    {
        JPanel temp = new JPanel();
        // name
        JLabel lblName = new JLabel(name);
        lblName.setFont(new Font("heading", 0, 30));
        lblName.setPreferredSize( new Dimension(400, 35));
        originalPanel.add(lblName, BorderLayout.NORTH);
        
        // description
        JTextField txtDescription = new JTextField();
        txtDescription.setColumns(60);
        txtDescription.setText(description);
        txtDescription.setPreferredSize( new Dimension( 400, 30));
        originalPanel.add(txtDescription, BorderLayout.CENTER);
        
        // cost
        JLabel lblCost = new JLabel("Cost: $" + String.format("%.2f", cost));
        lblCost.setPreferredSize( new Dimension( 400, 30));
        originalPanel.add(lblCost, BorderLayout.SOUTH);
        
        // button
        JButton addToCartBtn = new JButton("Buy");
        addToCartBtn.addActionListener(new costListener(cost));
        originalPanel.add(addToCartBtn, BorderLayout.SOUTH);
    }

    class costListener implements ActionListener
    {
        double cost;
        costListener(double inCost)
        {
            this.cost = inCost;
        }
        public void actionPerformed(ActionEvent event)
        {
            cartTotal += this.cost;
            lblTotalCartCost.setText("Total Cart Cost: $" + String.format("%.2f", cartTotal));
        }
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
     @param args the command line arguments
     */
    public static void main(String[] args)
    {

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
