package EncryptionAndDecryption;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.*;

public class EncryptionAndDecryption extends JFrame {
    public static void encrptyAndDecrypt(int key)
    {
        JFileChooser jf=new JFileChooser();
        jf.showOpenDialog(null);
        File f=jf.getSelectedFile();
        try{
            FileInputStream fin=new FileInputStream(f);
            byte []data=new byte[fin.available()];
            fin.read(data);
            int i=0;
            for(byte b: data){
                data[i]= (byte) (b^key);
                i++;
            }

            FileOutputStream fout=new FileOutputStream(f);
            fout.write(data);
            fout.close();
            fin.close();
            JOptionPane.showMessageDialog(null,"Done");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    public static void main(String[] args)
    {
        JFrame f= new JFrame();
        f.setTitle("Encryption And Decryption");
        f.setSize(700,800);
        f.setLayout(null);
        f.setVisible(true);
        f.setBackground(Color.YELLOW);
        JTextArea ta= new JTextArea();
        f.setLocationRelativeTo(null);
        JLabel l2,l3,l4,l5l6,l7,l8,l9;
        l2=new JLabel("Enter you security key");
        l2.setBounds(20,50,120,35);
        f.add(l2);
//        creating button
        JButton b=new JButton();
        b.setText("Open file");

        Font font=new Font("Roboto",Font.BOLD,40);
        b.setFont(font);
        l2.setFont(font);
        JTextField tf=new JTextField(5);
        Font ft=new Font("Roboto",Font.PLAIN,20);
        tf.setFont(ft);
        b.addActionListener(e->{
                String s=tf.getText();
                Integer key=Integer.parseInt(s);
                encrptyAndDecrypt(key);
        });
        f.setLayout(new FlowLayout());
        f.add(tf);
        f.add(b);





    }

}
