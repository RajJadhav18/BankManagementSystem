package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.jar.JarEntry;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,m1,m2,m3;

    JButton next;
    Random ran = new Random();   // to show the random no on the form
    long first4 = (ran.nextLong()%9000L)+1000L;
    String first = " "+ Math.abs(first4);  // Maths.abs returs the absolute value of the number with using the negative sign

    JTextField textName,textFname,textEmail,textMs,textAdd,textCity,textPin;
    JDateChooser dateChooser;


    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);


        JLabel label1= new JLabel("APPLLICATION FORM NO : "+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38-2));
        add(label1);

        JLabel label2=new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22-2));
        label2.setBounds(330,70,600,30-2);
        add(label2);

        JLabel label3= new JLabel("Personal Details :");
        label3.setFont(new Font("Raleway",Font.BOLD,22-2));
        label3.setBounds(290,90,600,30-2);
        add(label3);


        JLabel labelName= new JLabel("Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,20-2));
        labelName.setBounds(100,140,100,30-2);
        add(labelName);

        textName=new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14-2));
        textName.setBounds(300,140,400,30-2);
        add(textName);


        // Fathers name
        JLabel labelFname=new JLabel("Father's Name :");
        labelFname.setFont(new Font("Raleway",Font.BOLD,20-2));
        labelFname.setBounds(100,190,200,30-2);
        add(labelFname);

        textFname =new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14-2));
        textFname.setBounds(300,190,400,30-2);
        add(textFname);


        JLabel DOB=new JLabel("DOB :");
        DOB.setFont(new Font("Raleway",Font.BOLD,20-2));
        DOB.setBounds(100,290,200,30-2);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,290,400,30-2);
        add(dateChooser);

        JLabel labelg = new JLabel("Gender");
        labelg.setFont(new Font("Raleway",Font.BOLD,20-2));
        labelg.setBounds(100,240,200,30-2);
        add(labelg);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14-2));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,240,60,30-2);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14-2));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,240,90,30-2);
        add(r2);
        //after this both the radio buttons can be selected on the page to solve this we have to group the buttons

        ButtonGroup buttonGroup= new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);


        JLabel labelemail = new JLabel("Email:");
        labelemail.setFont(new Font("Raleway",Font.BOLD,20-2));
        labelemail.setBounds(100,340,200,30-2);
        add(labelemail);

        textEmail=new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14-2));
        textEmail.setBounds(300,340,400,30-2);
        add(textEmail);

        //married status

        JLabel labelMS = new JLabel("Married Status");
        labelMS.setFont(new Font("Raleway",Font.BOLD,20-2));
        labelMS.setBounds(100,390,200,30-2);
        add(labelMS);

        m1 = new JRadioButton("Married");
        m1.setBounds(300,390,100,30-2);
        m1.setBackground(new Color(222,255,228));
        m1.setFont(new Font("Raleway",Font.BOLD,14-2));
        add(m1);


        m2 = new JRadioButton("Unmarried");
        m2.setBounds(450,390,100,30-2);
        m2.setBackground(new Color(222,255,228));
        m2.setFont(new Font("Raleway",Font.BOLD,14-2));
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setBounds(635,390,100,30-2);
        m3.setBackground(new Color(222,255,228));
        m3.setFont(new Font("Raleway",Font.BOLD,14-2));
        add(m3);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);
        //address

        JLabel labelAdd = new JLabel("Address");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20-2));
        labelAdd.setBounds(100,440,200,30-2);
        add(labelAdd);

        textAdd=new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD,14-2));
        textAdd.setBounds(300,440,400,30-2);
        add(textAdd);


        JLabel labelCity = new JLabel("City : ");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20-2));
        labelCity.setBounds(100,490,200,30-2);
        add(labelCity);

        textCity=new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14-2));
        textCity.setBounds(300,490,400,30-2);
        add(textCity);


        JLabel labelpin = new JLabel("PIN CODE : ");
        labelpin.setFont(new Font("Raleway",Font.BOLD,20-2));
        labelpin.setBounds(100,540,200,30-2);
        add(labelpin);

        textPin=new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,14-2));
        textPin.setBounds(300,540,400,30-2);
        add(textPin);


        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14-2));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,600,80,30-2);
        next.addActionListener(this);
        add(next);








        JScrollPane jScrollPane = new JScrollPane();
        this.getContentPane().add(jScrollPane);
        getContentPane().setBackground(new Color(222,255,228)); // used for getting the colr\or
        setLayout(null);
        setSize(800,750);  // sets the size of the frame
        setLocation(260,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // transfer of data into the database
        String formno=first;
        String name = textName.getText();
        String fname=textFname.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if (r1.isSelected()){
            gender="Male";

        }
        else if(r2.isSelected()){
            gender="Female";
        }

        String emial=textEmail.getText();
        String marital=null;
        if (m1.isSelected()){
            marital="Married";
        } else if (m2.isSelected()) {
            marital="Unmarried";
        }
        else if(m3.isSelected()){
            marital="Other";
        }

        String address= textAdd.getText();
        String city = textCity.getText();
        String pincode=textPin.getText();

        try{
            if (textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");

            }else {
                Con_1 con1=new Con_1();
                String q= "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob +"','"+gender+"','"+emial+"','"+marital+"','"+address+"','"+city+"','"+pincode+"')";
                // for executing the query, executeupdate is used to input the value into the table
                con1.statement.executeUpdate(q);
                new Signup2(formno);  // passing first to get the form no in page 2 also
                setVisible(false);  // to close the page 1
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }


}
