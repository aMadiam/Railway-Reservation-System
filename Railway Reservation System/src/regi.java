import javax.swing.*;

import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

import java.awt.*;  
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.sql.*;  
import db.database;
import javax.imageio.*;

public class regi extends JFrame implements ActionListener{ 

    JLabel lregis, lname, lemail, lpass, lcpass, lphone;  
    JTextField tfname, tfemail, tfphone;  
    JPasswordField jpass, jcpass;  
    JButton btn1, btn2;  
    regi()  
    {  
        setVisible(true);  
        setSize(600, 500);  
        setLayout(null);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setTitle("REGISTRATION FORM of RAILWAY RESERVATION SYSTEM");  
        
        lregis = new JLabel("REGISTRATION FORM (RRS)");  
        
        lregis.setForeground(Color.BLACK);  
        
        lregis.setFont(new Font("arial", Font.BOLD, 25)); 
        
    	Font body = new Font("Arial",Font.PLAIN, 15);
    	
        lname = new JLabel("Name:");  
        lemail = new JLabel("Email-ID:");  
        lpass = new JLabel("Create Passowrd:");  
        lcpass = new JLabel("Confirm Password:");   
        lphone = new JLabel("Phone No:");   
        
        tfname = new JTextField();  
        tfemail = new JTextField();  
        jpass = new JPasswordField();  
        jcpass = new JPasswordField();  
        tfphone = new JTextField();  
        
        btn1 = new JButton("Submit");  
        btn2 = new JButton("Clear");  
        
        btn1.addActionListener(this);  
        btn2.addActionListener(this);  
        
        lregis.setBounds(125, 30, 400, 30);  
        lname.setBounds(120, 100, 200, 30);  
        lemail.setBounds(120, 140, 200, 30);  
        lpass.setBounds(120, 180, 200, 30);  
        lcpass.setBounds(120, 220, 200, 30);   
        lphone.setBounds(120, 260, 200, 30);  
        tfname.setBounds(280, 100, 200, 30);  
        tfemail.setBounds(280, 140, 200, 30);  
        jpass.setBounds(280, 180, 200, 30);  
        jcpass.setBounds(280, 220, 200, 30);  
        tfphone.setBounds(280, 260, 200, 30);  
        btn1.setBounds(170, 350, 100, 30);  
        btn2.setBounds(320, 350, 100, 30);  
        
		IconFontSwing.register(FontAwesome.getIconFont());
		Icon icn_user = IconFontSwing.buildIcon(FontAwesome.USER_CIRCLE_O,20);
	    Icon icn_pass = IconFontSwing.buildIcon(FontAwesome.KEY,15);
	    Icon icn_cpass = IconFontSwing.buildIcon(FontAwesome.CHECK_SQUARE_O,15);
	    Icon icn_email = IconFontSwing.buildIcon(FontAwesome.ENVELOPE,15);
	    Icon icn_phone = IconFontSwing.buildIcon(FontAwesome.HASHTAG,15);
	    Icon icn_save = IconFontSwing.buildIcon(FontAwesome. FLOPPY_O, 15);
	    Icon icn_reset = IconFontSwing.buildIcon(FontAwesome. UNDO, 15);
	    
	    lname.setIcon(icn_user);
	    lemail.setIcon(icn_email); 
	    lpass.setIcon(icn_pass);
	    lcpass.setIcon(icn_pass);
	    lphone.setIcon(icn_phone);
	    btn1.setIcon(icn_save);
	    btn2.setIcon(icn_reset);
	    
        add(lregis);  
        add(lname);  
        add(tfname);  
        add(lemail);  
        add(tfemail);  
        add(lpass);  
        add(jpass);  
        add(lcpass);  
        add(jcpass);    
        add(tfphone);    
        add(lphone);  
        add(btn1);  
        add(btn2);  
        
	    lname.setFont(body);
	    lemail.setFont(body);
	    lpass.setFont(body);
	    lcpass.setFont(body);
	    lphone.setFont(body);
    }  

	public void actionPerformed(ActionEvent e)   
    {  
        if (e.getSource() == btn1)  
         {  
            int x = 0;  
            String s1 = tfname.getText();  
            String s2 = tfemail.getText();  
            char[] s3 = jpass.getPassword();  
            char[] s4 = jcpass.getPassword();   
            String s8 = new String(s3);  
            String s9 = new String(s4);  
            String s5 = tfphone.getText();   
            if (s8.equals(s9))  
            {  
                try  
                {  
                    Class.forName("com.mysql.cj.jdbc.Driver");  
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/passengerdatabase", "root", "admin12345"); 
                    PreparedStatement ps = con.prepareStatement("insert into reg values(?,?,?,?,?)");  
                    ps.setString(1, s1);  
                    ps.setString(2, s2);  
                    ps.setString(3, s8);  
                    ps.setString(4, s5);  
                    ResultSet rs = ps.executeQuery();  
                    x++;  
                    if (x > 0)   
                    {  
                        JOptionPane.showMessageDialog(btn1, "Registration Success!");  
                    }  
                }  
                catch (Exception ex)   
                {  
                    System.out.println(ex);  
                }  
            }  
            else  
            {  
                JOptionPane.showMessageDialog(btn1, "PASSWORD Doesn't Match");  
            }   
          }   
          else  
          {  
            tfname.setText("");  
            tfemail.setText("");  
            jpass.setText("");  
            jcpass.setText("");  
            tfphone.setText("");  
          }  
    }   
    public static void main(String args[])  
    {  
        new regi();  
    }  
}  