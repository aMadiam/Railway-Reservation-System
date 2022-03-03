import java.awt.*;

import javax.swing.*;


public class Profile extends JFrame {
	JLabel L1;
  public Profile() {
	  setTitle("Profile");
	  setSize(500,500);
	  setLocationRelativeTo(null);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  setVisible(true);
	  
	  setLayout(new BorderLayout());
	  setContentPane(new JLabel(new ImageIcon("D:\\this pc\\Document\\Railway Reservation System\\IMAGE\\LR1back1.jpg")));

	 
	  setLayout(new FlowLayout());
	  L1 =new JLabel();
	  add(L1);
	  
	  setSize(400,400);
	  
 
}
  public static void main(String args[]) {
	 new Profile();
	 
	  
  }
}

