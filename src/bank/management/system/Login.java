
package  bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {   //java swing  // actionlistner used for making the button work
    JLabel label1, label2,label3;  //globally declare

    JTextField textField2;
    JPasswordField passwordField3;

    JButton button1,button2,button3;
    Login(){  // constructor
        super("Bank Management System");  // super class is used to refer to the immediate parent and here it gives the title to the frame .
        // Note super class should always be on the top
        //1
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        //2 scaling of image
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        // 3 to make the image visible we have to make the icon
        ImageIcon i3 = new ImageIcon(i2);
        //4 default the img is not on the frame we have to pass it onto to the frame
        JLabel image= new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);


        // 2nd img

        ImageIcon ii1= new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage= new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);

        // labels

        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);



        //lable2
        label2 = new JLabel("Card No: ");
        label2.setForeground(Color.white);
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setBounds(150,190,375,30);
        add(label2);

        //textfield for label 2
        textField2= new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);





        //lable3
        label3 = new JLabel("Pin: ");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setBounds(150,250,375,30);
        add(label3);

        //password field for the label 3
        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);


        //button 1
        button1 =new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(322,300,105,30);
        button1.addActionListener(this);
        add(button1);

        //button2
        button2= new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.setBounds(452,300,105,30);
        button2.addActionListener(this);
        add(button2);

        //button 3
        button3=new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setBackground(Color.BLACK);
        button3.setForeground(Color.WHITE);
        button3.setBounds(322,350,235,30);
        button3.addActionListener(this);
        add(button3);


        //background img
        ImageIcon iii1= new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage= new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);



        // Image icon creates the not utilized img icon
        //ClassLoader.getSystemResource is used to find the resource from the given path and load it into the variable
       setLayout(null);  // coz we don't want the default layout
        setSize(850,480);   // size of the frame
        setLocation(230,140);   //location from the left anf top
        setVisible(true);  // frame is invisible by default
        //Note set visibility should always come later so that it will run at last and all the images are visible
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource()==button1){
                Con_1 c= new Con_1();
                String cardno=textField2.getText();
                String pin = passwordField3.getText();
                String q= "select * from login where card_number = '"+cardno+"' and pin = '"+pin+"'";

                ResultSet resultSet=c.statement.executeQuery(q);
                if (resultSet.next()){
                    setVisible(false);
                    new main_class(pin);
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
                }


            }else if (e.getSource()==button2){
                textField2.setText("");
                passwordField3.setText("");

            }else  if (e.getSource()==button3){
                new Signup();
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new Login();//object
    }

}
