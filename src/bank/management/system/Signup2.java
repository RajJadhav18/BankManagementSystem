package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textPan,textAdhaar;
    JRadioButton r1,r2,e1,e2;
    JButton next;
    String formno;
     Signup2(String formno){
         super("APPLICATION FORM");
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno=formno;

        JLabel l1= new JLabel("Page 2:-");
        l1.setFont(new Font("Raleway",Font.BOLD,22 ));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2=new JLabel("Additional Details");
         l2.setFont(new Font("Raleway",Font.BOLD,22));
         l2.setBounds(300,60,600,40);
         add(l2);

         JLabel l3= new JLabel("Religion");
         l3.setFont(new Font("Raleway",Font.BOLD,18));
         l3.setBounds(100,160,100,30);
         add(l3);

         //religion dropdown we have to use combobox
         String religion[]={"HINDU","MUSLIM","SIKH","CHRISTIAN","OTHER"};
         comboBox=new JComboBox(religion);
         comboBox.setBackground(new Color(252,208,76));
         comboBox.setFont(new Font("Raleway",Font.BOLD,14));
         comboBox.setBounds(350,160,320,30);
         add(comboBox);


         JLabel l4= new JLabel("Category");
         l4.setFont(new Font("Raleway",Font.BOLD,18));
         l4.setBounds(100,200,100,30);
         add(l4);

         String category[]={"General","OBC","SC","ST","OTHER"};
         comboBox2=new JComboBox(category);
         comboBox2.setBackground(new Color(252,208,76));
         comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
         comboBox2.setBounds(350,200,320,30);
         add(comboBox2);

         JLabel l5= new JLabel("Income");
         l5.setFont(new Font("Raleway",Font.BOLD,18));
         l5.setBounds(100,240,100,30);
         add(l5);

         String income[]={"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","above 10,00,000"};
         comboBox3=new JComboBox(income);
         comboBox3.setBackground(new Color(252,208,76));
         comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
         comboBox3.setBounds(350,240,320,30);
         add(comboBox3);


         JLabel l6= new JLabel("Education");
         l6.setFont(new Font("Raleway",Font.BOLD,18));
         l6.setBounds(100,280,100,30);
         add(l6);

         String education[]={"Non-Graduate","Graduate","Post-Graduate","Doctrate","OTHER"};
         comboBox4=new JComboBox(education);
         comboBox4.setBackground(new Color(252,208,76));
         comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
         comboBox4.setBounds(350,280,320,30);
         add(comboBox4);

         JLabel l7= new JLabel("Occupation");
         l7.setFont(new Font("Raleway",Font.BOLD,18));
         l7.setBounds(100,320,150,30);
         add(l7);

         String occupation[]={"Salaried","Self-Employed","Buisness","Student","Retired","Other"};
         comboBox5=new JComboBox(occupation);
         comboBox5.setBackground(new Color(252,208,76));
         comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
         comboBox5.setBounds(350,320,320,30);
         add(comboBox5);


         JLabel l8= new JLabel("PAN NUMBER");
         l8.setFont(new Font("Raleway",Font.BOLD,18));
         l8.setBounds(100,360,200,30);
         add(l8);

        textPan=new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,18));
        textPan.setBounds(350,360,320,30);
        add(textPan);

         JLabel l9= new JLabel("ADHAAR NUMBER");
         l9.setFont(new Font("Raleway",Font.BOLD,18));
         l9.setBounds(100,400,200,30);
         add(l9);

         textAdhaar=new JTextField();
         textAdhaar.setFont(new Font("Raleway",Font.BOLD,18));
         textAdhaar.setBounds(350,400,320,30);
         add(textAdhaar);

         JLabel l10= new JLabel("Senior Citizen");
         l10.setFont(new Font("Raleway",Font.BOLD,18));
         l10.setBounds(100,440,200,30);
         add(l10);

         r1=new JRadioButton("Yes");
         r1.setFont(new Font("Raleway",Font.BOLD,14));
         r1.setBackground(new Color(252,208,76));
         r1.setBounds(350,440,100,30);
         add(r1);


         r2=new JRadioButton("No");
         r2.setFont(new Font("Raleway",Font.BOLD,14));
         r2.setBackground(new Color(252,208,76));
         r2.setBounds(460,440,100,30);
         add(r2);

         ButtonGroup buttonGroup= new ButtonGroup();
         buttonGroup.add(r1);
         buttonGroup.add(r2);


         JLabel l11= new JLabel("Existing Account");
         l11.setFont(new Font("Raleway",Font.BOLD,18));
         l11.setBounds(100,480,150,30);
         add(l11);

         e1=new JRadioButton("Yes");
         e1.setFont(new Font("Raleway",Font.BOLD,14));
         e1.setBackground(new Color(252,208,76));
         e1.setBounds(350,480,100,30);
         add(e1);

         e2=new JRadioButton("No");
         e2.setFont(new Font("Raleway",Font.BOLD,14));
         e2.setBackground(new Color(252,208,76));
         e2.setBounds(460,480,100,30);
         add(e2);

         ButtonGroup buttonGroup1= new ButtonGroup();
         buttonGroup1.add(e1);
         buttonGroup1.add(e2);

         JLabel l12= new JLabel("Form No:");
         l12.setFont(new Font("Raleway",Font.BOLD,14));
         l12.setBounds(650,10,100,30);
         add(l12);

         JLabel l13= new JLabel(formno);
         l13.setFont(new Font("Raleway",Font.BOLD,14));
         l13.setBounds(710,10,100,30);
         add(l13);

         next = new JButton("Next");
         next.setFont(new Font("Raleway",Font.BOLD,14-2));
         next.setBackground(Color.BLACK);
         next.setForeground(Color.WHITE);
         next.setBounds(570,520,80,30-2);
         next.addActionListener(this);
         add(next);




         setLayout(null);
        setSize(850,650);
        setLocation(200,20);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate=(String) comboBox2.getSelectedItem();
        String inc= (String) comboBox3.getSelectedItem();
        String edu= (String) comboBox4.getSelectedItem();
        String occ=(String) comboBox5.getSelectedItem();

        String pan= textPan.getText();
        String addhar=textAdhaar.getText();

        String scitizen= null;
        if (r1.isSelected()) scitizen="Yes";
        else scitizen="No";

        String eAccount= null;
        if (r1.isSelected()) eAccount="Yes";
        else eAccount="No";


        try {
            if (textPan.getText().equals("") || textAdhaar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }
            else {
                Con_1 c1=new Con_1();
                String q= "insert into signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+addhar+"','"+scitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);

            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
