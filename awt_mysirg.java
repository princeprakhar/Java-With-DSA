import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;
class component extends JFrame
{
	
	public component()
	{
		setSize(1800,1600);
		setVisible(true);
		setLayout(null);
		setTitle("Final exam");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPasswordField p1;
		JButton b1,b2;
		JTextField t1,t2,t3,t4,t5,t6,t7,t8;
		JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
		l1=new JLabel("Registration form");
		l2=new JLabel("Name: ");
		l3=new JLabel("UID: ");
		l4=new JLabel("Password: ");
		l5=new JLabel("Marks");
		l6=new JLabel("PAS: ");
		l7=new JLabel("Java: ");
		l8=new JLabel("DSA: ");
		l9=new JLabel("Python for machine learing: ");
		l10=new JLabel("Operating system: ");
		t1=new JTextField();
		t2=new JTextField();
		p1=new JPasswordField();
		t3=new JTextField();
		t4=new JTextField();
		t5=new JTextField();
		t6=new JTextField();
		t7=new JTextField();
		t8=new JTextField();
		b1=new JButton("RESET");
		b2=new JButton("SUBMIT");
		l1.setBounds(300,20,200,30);
		l2.setBounds(20,50,100,20);
		l3.setBounds(20,70,100,20);
		l4.setBounds(20,90,100,20);
		l5.setBounds(300,110,100,30);
		l6.setBounds(20,130,100,20);
		l7.setBounds(20,150,100,20);
		l8.setBounds(20,170,100,20);
		l9.setBounds(20,190,200,20);
		l10.setBounds(20,210,200,20);
		t1.setBounds(270,50,200,20);
		t2.setBounds(270,70,100,20);
		t3.setBounds(270,70,100,20);
		p1.setBounds(270,90,100,20);
		t4.setBounds(270,130,200,20);
		t5.setBounds(270,150,200,20);
		t6.setBounds(270,170,200,20);
		t7.setBounds(270,190,200,20);
		t8.setBounds(270,210,200,20);
		b1.setBounds(80,240,100,20);
		b2.setBounds(180,240,100,20);
		// b1.setBounds();
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l9);
		add(l10);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(t7);
		add(t8);
		add(p1);
		add(b1);
		add(b2);
	}
	public static void main(String args[])
	{
		component c=new component();
	}	
}

