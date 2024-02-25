package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {

     String pin;
     TextField textField;

     JButton b1,b2;

    Deposit(String pin){
        //we have to pass the pin generated in the signup3 class
        this.pin=pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1300,640, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1300,640);
        add(l3);


        JLabel l1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setBounds(365,130,350,30);
        l1.setForeground(Color.WHITE);
        l3.add(l1);

        textField=new TextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.white);
        textField.setBounds(375,170,300,25);
        textField.setFont(new Font("Raleway",Font.BOLD,22));

        l3.add(textField);

        b1=new JButton("Deposit");
        b1.setBounds(585,281,130,25);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        l3.add(b1);


        b2=new JButton("Back");
        b2.setBounds(585,317,130,25);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        l3.add(b2);









        setLayout(null);
        setSize(1400,700);
        setLocation(0,0);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = textField.getText();
            Date date = new Date();
            if(e.getSource()==b1){
                if(textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please Enter the amount you want to deposit");
                }else {
                    Con_1 c1 = new Con_1();
                    c1.statement.executeUpdate("insert into bank values ('"+pin+"','"+date+"','Deposit','"+amount+"')" );
                    JOptionPane.showMessageDialog(null,"Deposited Succesfully");
                    setVisible(false);
                    new main_class(pin);
                }
            } else if (e.getSource()==b2) {
                setVisible(false);
                new main_class(pin);
                
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {

        new Deposit("");
    }


}
