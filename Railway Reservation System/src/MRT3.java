import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
 

@SuppressWarnings("serial")
public class MRT3<ImagePanel> extends JFrame  
{
	JMenu menu, submenu;  
	JMenuItem i1, i2, i3, i4, i5;  
	Color c1 = Color.WHITE; 
	Color c2 = Color.GRAY;
	Color c3 = Color.BLUE;
    
	      MRT3(){  
    	  
    	 JLabel l1,l2,l6,l7,l9,l10,l12; 
    	 JTextField l4,l5,l8,l13;
    	    l1=new JLabel(" From");  
    	    l2=new JLabel("To");
    	    
    	    l4=new JTextField();
       	    l4.setEditable(false);
       	    l5=new JTextField();
       	    l5.setEditable(false);
       	    l8=new JTextField();
       	    l8.setEditable(false);
       	    
       	    l7=new JLabel(" Type of Ticket ");  
       	    l6=new JLabel(" Type of Ticket ");
       	    l9=new JLabel("From:");  
       	    l10=new JLabel("To:");   	   
       	    l12=new JLabel("Price of Ticket:"); 
       
       	    l13=new JTextField();  
       	    l13.setEditable(false);
    	    JButton b=new JButton("CONFIRM");
            JButton c=new JButton("Return");
            JButton d=new JButton("Exit");
            
    	    l1.setBounds(95,4, 180,20);
    	    l2.setBounds(250,4, 180,20); 
    	    l4.setBounds(370,190,150,20);
    	    l5.setBounds(370,100,150,20); 
    	    l7.setBounds(390,4, 180,20); 
    	    l6.setBounds(370,80, 180,20);
    	    l8.setBounds(370,150,150,20); 
    	    l9.setBounds(370,130, 180,20);	    
    	    l10.setBounds(370,170, 180,20);
    	    l12.setBounds(370,210, 180,20); 
    	    l13.setBounds(370,230,150,20); 
    	    b.setBounds(420,250,90,30);
            c.setBounds(420,300,90,30);  
            d.setBounds(420,350,90,30);
            
        JFrame f= new JFrame(); 
        ImageIcon img = new ImageIcon("img/mrt3.png");
        f.setIconImage( img.getImage() );
        JPanel p = (JPanel) f.getContentPane();
        JPanel pp = new JPanel();
        p.add( pp );
        f.pack();    
        JMenuBar mb=new JMenuBar();  
        menu=new JMenu("Menu");  
        
        i1=new JMenuItem("Setting");  
        i3=new JMenuItem("Profile");    
       
        menu.add(i1);menu.add(i3);  
        mb.add(menu);  
        mb.setBackground(c2);
       
        menu.setForeground(c1); 
        f.setJMenuBar(mb); 
        
        final DefaultListModel<String> l11 = new DefaultListModel<>(); 
          l11.addElement("Grand Central");    
          l11.addElement("North Avenue");  
          l11.addElement("Quezon Avenue");  
          l11.addElement("Kamuning");  
          l11.addElement("Araneta Center�Cubao");  
          l11.addElement("Santolan-Annapolis");  
          l11.addElement("Ortigas");  
          l11.addElement("Shaw Boulevard");  
          l11.addElement("Boni");
          l11.addElement("Guadalupe");
          l11.addElement("Buendia");
          l11.addElement("Ayala");  
          l11.addElement("Magallanes");  
          l11.addElement("Taft Avenue");  
          l11.addElement("F.B Harrison");  
          l11.addElement("Roxas Boulevard");
          l11.addElement("MOA");  
          
          final JList<String> list1 = new JList<>(l11);  
          
          list1.setBounds(20,30, 160,310);
          list1.setForeground(c1); 
          list1.setBackground(c2);
          DefaultListModel<String> l21 = new DefaultListModel<>();  
          l21.addElement("Grand Central");    
          l21.addElement("North Avenue");  
          l21.addElement("Quezon Avenue");  
          l21.addElement("Kamuning");  
          l21.addElement("Araneta Center�Cubao");  
          l21.addElement("Santolan-Annapolis");  
          l21.addElement("Ortigas");  
          l21.addElement("Shaw Boulevard");  
          l21.addElement("Boni");
          l21.addElement("Guadalupe");
          l21.addElement("Buendia");
          l21.addElement("Ayala");  
          l21.addElement("Magallanes");  
          l21.addElement("Taft Avenue");  
          l21.addElement("F.B Harrison");  
          l21.addElement("Roxas Boulevard");
          l21.addElement("MOA");  
          final JList<String> list2 = new JList<>(l21);
          
          list2.setBounds(200,30, 160,310);   
          list2.setForeground(c1); 
          list2.setBackground(c2);
          DefaultListModel<String> l23 = new DefaultListModel<>();  
          l23.addElement("Single Journey Ticket-SJT");  
          l23.addElement("Beep Card");  
          final JList<String> list3 = new JList<>(l23);
          
          list3.setBounds(370,30, 160,50);   
          list3.setForeground(c1); 
          list3.setBackground(c2);
          f.add(list1); f.add(list2); f.add(list3); f.add(b); f.add(l4); f.add(c);f.add(d);f.add(l1);f.add(l2);
          f.add(l5);f.add(l6);f.add(l7);f.add(l8);f.add(l9);f.add(l10);
          f.setTitle("Metro Rail Transit Corporation/Metro Rail Transit Line-3");
          f.setSize(550,550);  
          f.setLayout(null);  
          f.setVisible(true);
          f.setLocationRelativeTo(null);
          c.setForeground(c1); 
          c.setBackground(c2);
          c.addActionListener(new ActionListener() {  
        	  @Override
              public void actionPerformed(ActionEvent e)
                  {
                  f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                  f.getContentPane().add(c);	
              	  c.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                  f.dispose();
        		  new Linelist();
              	   }
          		  }); 
                  }
          }); 
          d.setForeground(c1); 
          d.setBackground(c2);
          d.addActionListener(new ActionListener() {        
          public void actionPerformed(ActionEvent e)
              {
        	  System.exit(0);
              }
          }); 
          b.setForeground(c1); 
          b.setBackground(c2);
          b.addActionListener(new ActionListener() {  
              public void actionPerformed(ActionEvent e) {   
                 String data = "";  
                 if (list1.getSelectedIndex() != -1) {                       
                    data = ""+ list1.getSelectedValue();
                    data +="Station";      
                    l8.setText(data);  

                 }  
                 if (list2.getSelectedIndex() != -1) {                       
                     data = ""+ list2.getSelectedValue();
                     data +=" Station";      
                     l4.setText(data); 
                 }
                
              
                 if (list3.getSelectedIndex() != -1) {                       
                     data = ""+ list3.getSelectedValue();
                     data +="";      
                     l5.setText(data); 
                 }
              }
              
              
           });   
         
     }
	     
     
     
protected void reset() {
		
	}

@SuppressWarnings("rawtypes")
public static void main(String args[])  
    {  
   new MRT3();  
    }

public void showWindows() {
	
}

}

