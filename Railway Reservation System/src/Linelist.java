import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class Linelist  extends JFrame {

          JMenu menu, submenu;  
          JMenuItem i1, i2, i3, i4, i5;  
          JLabel L1;
          public JFrame frame;
          public JMenu logo;
          Color c1 = Color.WHITE; 
          Color c2 = Color.GRAY;
          Color c3 = Color.BLUE;
          
          public Linelist(){ 
        	  JFrame f= new JFrame("Rail Line List");  
              JMenuBar mb=new JMenuBar();  
              menu=new JMenu("Menu");  
              
              i1=new JMenuItem("Setting");  
              i3=new JMenuItem("Profile");   
             
              menu.add(i1);menu.add(i3);  
              mb.add(menu);  
              mb.setBackground(c2);
              f.setForeground(c2);
              menu.setForeground(c1); 
             

              f.setJMenuBar(mb);  
              f.setSize(400,400);  
              f.setLayout(null);  
              f.setVisible(true);  
        	  
          JButton b=new JButton("LRT-1"); 
          b.setBounds(50,100,95,30);
          f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
          f.getContentPane().add(b);
          b.setForeground(c1); 
          b.setBackground(c2);
      	  b.addActionListener(new ActionListener() {
      		  
          public void actionPerformed(ActionEvent e) {
          f.dispose();
		  new LRT1();
      	   }
  		  });	
      	  JButton c=new JButton("LRT-2");  
          c.setBounds(150,100,95,30);
          f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
          f.getContentPane().add(c);
          c.setForeground(c1); 
          c.setBackground(c2);
      	  c.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
          f.dispose();
		  new LRT2();
      	   }
  		  });	
    	  JButton d=new JButton("MRT-3");  
          d.setBounds(250,100,95,30);
          f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
          f.getContentPane().add(d);
          d.setForeground(c1); 
          d.setBackground(c2);
      	  d.addActionListener(new ActionListener() {
          @SuppressWarnings("rawtypes")
		public void actionPerformed(ActionEvent e) {
          f.dispose();
		  new MRT3();
      	   }
  		  });
      	  JButton e=new JButton("MRT-7");  
          e.setBounds(50,150,95,30);
          f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
          f.getContentPane().add(e);	
          e.setForeground(c1); 
          e.setBackground(c2);
    	  e.addActionListener(new ActionListener() {
          @SuppressWarnings("rawtypes")
		public void actionPerformed(ActionEvent e) {
         f.dispose();
		  new MRT7();
    	   }
		  });
    	  JButton g=new JButton("PNR");  
          g.setBounds(150,150,95,30);
          f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
          f.getContentPane().add(g);
          g.setForeground(c1); 
          g.setBackground(c2);
    	  g.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
          f.dispose();
		  new PNR();
    	   }
		  });
    	  JButton H=new JButton("PNR NSCR");  
          H.setBounds(250,150,95,30);
          f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
          f.getContentPane().add(H);
          H.setForeground(c1); 
          H.setBackground(c2);
    	  H.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
          f.dispose();
		  new PNRNSCR();
    	   }
		  });           
          }
          
public static void main(String args[])  
{  
new Linelist();  
}
}