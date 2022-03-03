import javax.swing.*;

import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import db.database;

@SuppressWarnings("serial")
public class login extends JFrame implements ActionListener {
	
	public JLabel lname,lpass,welc,lrail;
	public static JTextField uname;
	public static Object tuname;
	public JPasswordField pass;
	public JButton loginnn,exit,register;
	public Connection con = database.getConnection();
	public char[] getp;
	public String password;
	public ResultSet rs;
	Font head = new Font("Arial",Font.BOLD, 28);
	Font para = new Font("Arial",Font.BOLD, 15);
	
	public login(){
		setContentPane(new JLabel(new ImageIcon("src/images/bg.jpg")));
		Container box = getContentPane();

		box.setLayout(null);
		box.add(lname = new JLabel("Username"));
		box.add(lpass = new JLabel("Password"));
		box.add(welc = new JLabel("Welcome to "));
		box.add(lrail = new JLabel("Railway Reservation System"));
		box.add(uname = new JTextField(50));
		box.add(pass = new JPasswordField(50));
		box.add(loginnn = new JButton("LOG-IN"));
		box.add(exit = new JButton("EXIT"));
		box.add(register = new JButton("REGISTER"));
		
		welc.setBounds(250, 0, 300, 100);
		lrail.setBounds(170, 0, 400, 170);
		lname.setBounds(190,88,120,110);
		lpass.setBounds(190,128,120,110);
		uname.setBounds(290,130,220,25);
		pass.setBounds(290,170,220,25);
		loginnn.setBounds(140, 250, 120, 40);		
		exit.setBounds(440, 250, 120, 40);
		register.setBounds(290, 250, 120, 40);
		loginnn.addActionListener(this);
		
		IconFontSwing.register(FontAwesome.getIconFont());
		Icon icn_user = IconFontSwing.buildIcon(FontAwesome.USER,15);
	    Icon icn_pass = IconFontSwing.buildIcon(FontAwesome.KEY,15);
	    Icon icn_log = IconFontSwing.buildIcon(FontAwesome.UNLOCK,15);
	    Icon icn_back = IconFontSwing.buildIcon(FontAwesome.UNDO,15);
	    Icon icn_reg = IconFontSwing.buildIcon(FontAwesome.ADDRESS_CARD_O,15);
	    
	    
	    lname.setIcon(icn_user);
	    loginnn.setIcon(icn_log); 
	    lpass.setIcon(icn_pass);
	    exit.setIcon(icn_back);
	    register.setIcon(icn_reg);
	    
	    welc.setFont(head);
	    lrail.setFont(head);
	    lname.setFont(para);
	    lpass.setFont(para);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==loginnn) {
			getp = pass.getPassword();
			 password = String.valueOf(getp);
			PreparedStatement ps;
			try {
				ps = con.prepareStatement("Select * from passengerdatabase Where Username=? and pass=?;");
				ps.setString(1, uname.getText());
	        	ps.setString(2, password);
	        	ResultSet rs = ps.executeQuery();
	        	if (rs.next()) {
	        		dispose();
	        		new Linelist();	        	}
	        	else {
	        		JOptionPane.showMessageDialog(null, "Invalid.");
	        	}
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			} 
			 if (e.getSource() ==exit) {
		            System.exit(0);
			 }  
		}		
}
	
	public static void main(String[]args) {
		
		login loginform = new login();
		loginform.setTitle("RRS Login");   
		loginform.setVisible(true);
		loginform.setSize(700,400);
	}	
}