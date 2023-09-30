package markscalculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class internalmark extends JFrame {
    public internalmark(String s)
    {
        setSize(1800,1600);
        setVisible(true);
        setLayout(null);
        setTitle("Internal Marks Calculator");
        JButton b1,b2;
        JTextField name,final_practical,uid,suprise_test,assignement,practical_avg,quiz,attendance,mst1,mst2;
        JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
        l1=new JLabel("Welcome");
        l2=new JLabel("Name");
        l3=new JLabel("UID");
        l4=new JLabel("Final Practical Marks");
        l5=new JLabel("Suprise test Marks");
        l6=new JLabel("Assignment Marks");
        l7=new JLabel("Practical Avg. marks");
        l8=new JLabel("Quiz marks");
        l9=new JLabel("MST 1 marks");
        l10=new JLabel("MST 2 marks");
        l11=new JLabel("Attendance Marks");
        name=new JTextField();
        uid =new JTextField();
        final_practical =new JTextField();
        suprise_test =new JTextField();
        assignement =new JTextField();
        practical_avg =new JTextField();
        quiz =new JTextField();
        mst1 =new JTextField();
        mst2=new JTextField();
        attendance = new JTextField() ;
        b1=new JButton("RESET");
        b2=new JButton("SUBMIT");
        l1.setBounds(210,20,200,30);
        l2.setBounds(20,50,120,35);
        l3.setBounds(20,90,120,35);
        l4.setBounds(20,130,120,35);
        l5.setBounds(20,170,120,35);
        l6.setBounds(20,210,120,35);
        l7.setBounds(20,250,120,35);
        l8.setBounds(20,290,120,35);
        l9.setBounds(20,330,200,35);
        l10.setBounds(20,370,200,35);
        l11.setBounds(20,410,200,35);
        name.setBounds(500,50,200,35);
        uid.setBounds(500,90,200,35);
        final_practical.setBounds(500,130,200,35);
        suprise_test.setBounds(500,170,200,35);
        assignement.setBounds(500,210,200,35);
        practical_avg.setBounds(500,250,200,35);
        quiz.setBounds(500,290,200,35);
        mst1.setBounds(500,330,200,35);
        mst2.setBounds(500,370,200,35);
        attendance.setBounds(500,410,200,35);
        b1.setBounds(120,450,100,30);
        b2.setBounds(270,450,100,30);
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
        add(l11);
        add(name);
        add(uid);
        add(final_practical);
        add(suprise_test);
        add(assignement);
        add(practical_avg);
        add(quiz );
        add(mst1);
        add(mst2);
        add(attendance);
        add(b1);
        add(b2);
    }
    public internalmark()
    {
        setSize(1800,1600);
        setVisible(true);
        setLayout(null);
        setTitle("Internal Marks Calculator");
        JButton b1,b2;
        JTextField name,uid,suprise_test,assignement,quiz,attendance,mst1,mst2;
        JLabel l1,l2,l3,l5,l6,l8,l9,l10,l11;
        l1=new JLabel("Welcome");
        l2=new JLabel("Name");
        l3=new JLabel("UID");
        l5=new JLabel("Suprise test Marks");
        l6=new JLabel("Assignment Marks");
        l8=new JLabel("Quiz marks");
        l9=new JLabel("MST 1 marks");
        l10=new JLabel("MST 2 marks");
        l11=new JLabel("Attendance Marks");
        name=new JTextField();
        uid =new JTextField();
        suprise_test =new JTextField();
        assignement =new JTextField();
        quiz =new JTextField();
        mst1 =new JTextField();
        mst2=new JTextField();
        attendance = new JTextField();
        b1=new JButton("RESET");
        b2=new JButton("SUBMIT");
        l1.setBounds(180,20,200,30);
        l2.setBounds(20,50,200,40);
        l3.setBounds(20,90,200,40);
        l5.setBounds(20,130,200,40);
        l6.setBounds(20,170,200,40);
        l8.setBounds(20,210,200,40);
        l9.setBounds(20,250,200,40);
        l10.setBounds(20,290,200,40);
        l11.setBounds(20,330,200,40);
        name.setBounds(270,50,200,35);
        uid.setBounds(270,90,200,35);
        suprise_test.setBounds(270,130,200,35);
        assignement.setBounds(270,170,200,35);
        quiz.setBounds(270,210,200,35);
        mst1.setBounds(270,250,200,35);
        mst2.setBounds(270,290,200,35);
        attendance.setBounds(270,330,200,35);
        b1.setBounds(110,375,100,30);
        b2.setBounds(260,375,100,30);
        add(l1);
        add(l2);
        add(l3);
        add(l5);
        add(l6);
        add(l8);
        add(l9);
        add(l10);
        add(l11);
        add(name);
        add(uid);
        add(suprise_test);
        add(assignement);
        add(quiz );
        add(mst1);
        add(mst2);
        add(attendance);
        add(b1);
        add(b2);
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Is the Subject is Hybrid or not if it is Enter 'Yes' else Enter 'No'");
        String s=sc.next();
        if(s.equalsIgnoreCase("yes"))
        {
            internalmark c=new internalmark(s);
        }
        else
        {
            internalmark c1=new internalmark();
        }
    }

}
