import javax.swing.*;
//import java.sql.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
class Registration extends JFrame
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JTextField t1,t3,t8;
	JComboBox j1,j2;
	//String Gender[]=new String[]{"Male","Female"},City[]=new String[]{"MOHALI","GORAKHPUR"};
	JButton b1,b2;
	JPasswordField p1,p2;
  Registration()
  {
	setVisible(true);
	setLayout(null);
	setSize(700,700);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("Registration form: (WORKSHEET 10)");
	l1=new JLabel("Registration form: ");	
	l1.setForeground(Color.blue);
	l1.setFont(new Font("Camille",Font.BOLD,22));
	l2=new JLabel("Name: ");
	l3=new JLabel("Gender: ");
	l4=new JLabel("Father Name: ");
	l5=new JLabel("Password: ");
	l6=new JLabel("Confirm password: ");
	l7=new JLabel("City: ");
	l8=new JLabel("Email: ");
	t1=new JTextField();
	j1=new JComboBox();
	t3=new JTextField();
	p1=new JPasswordField();
	p2=new JPasswordField();
	j2=new JComboBox();
	t8=new JTextField();
	b1=new JButton("Register");
	b2=new JButton("Reset");
	l1.setBounds(100,30,400,30);
	l2.setBounds(80,70,200,30);
	l3.setBounds(80,100,200,30);
	l4.setBounds(80,130,200,30);
	l5.setBounds(80,160,200,30);
	l6.setBounds(80,190,200,30);
	l7.setBounds(80,220,200,30);
	l8.setBounds(80,250,200,30);
	t1.setBounds(280,70,200,30);
	j1.setBounds(280,100,200,30);
	t3.setBounds(280,130,200,30);
	p1.setBounds(280,160,200,30);
	p2.setBounds(280,190,200,30);
	j2.setBounds(280,220,200,30);
	t8.setBounds(280,250,200,30);
	b1.setBounds(60,350,100,30);
	b2.setBounds(150,350,100,30);
	add(l1);
	add(l2);
	add(l3);
	add(l4);
	add(l5);
	add(l6);
	add(l7);
	add(l8);
	add(t1);
	add(j1);
	add(t3);
	add(p1);
	add(p2);
	add(j2);
	add(t8);
	add(b1);
	add(b2);
  }
}
class Main0
{
	public static void main(String args[])
	{
		Registration r=new Registration();
	}
}
	