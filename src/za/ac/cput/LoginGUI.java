/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class LoginGUI extends JFrame implements ActionListener {
    private JLabel lblUsername;
    private JLabel lblPassword;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JButton btnExit;
    private Font ft;
    
    public LoginGUI() {
        super("User Authentication");
        lblUsername = new JLabel("Username: ");
        lblPassword = new JLabel("Password: ");
        txtUsername = new JTextField();
        txtPassword = new JPasswordField();
        btnLogin = new JButton("Login");
        btnExit = new JButton("Exit");
        
        ft = new Font("Arial", Font.PLAIN, 24);
    }
    
    public void setGUI() {
        this.setLayout(new GridLayout(3, 2));
        
        lblUsername.setFont(ft);
        txtUsername.setFont(ft);
        lblPassword.setFont(ft);
        txtPassword.setFont(ft);
        btnLogin.setFont(ft);
        btnExit.setFont(ft);
        
        this.add(lblUsername);
        this.add(txtUsername);
        this.add(lblPassword);
        this.add(txtPassword);
        this.add(btnLogin);
        this.add(btnExit);
              
        btnLogin.addActionListener(this);
        btnExit.addActionListener(this);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
    
    public boolean isValidUser(String Username, String Password) 
    {
    return true;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getActionCommand().equals("Login"))
        {
            String Username= txtUsername.getText();
            String Password= txtPassword.getText();
            if (isValidUser(Username,Password))
           {
                JOptionPane.showMessageDialog(null, "Welcome Login successfully");
           }
            else
           {
               JOptionPane.showMessageDialog(null, "invalid");    
           }
            
           } 
        else 
           {
            if (e.getActionCommand().equals("Exit"))
           {
                System.exit(0);
           }
            }
            }
    public static void main(String [] args)
            {
        new LoginGUI().setGUI();
            }
}
