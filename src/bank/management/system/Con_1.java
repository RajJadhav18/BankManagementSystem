package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Con_1 {
    Connection connection;
    Statement statement;
    public Con_1(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem1","root","Rajjadhav@18");
            statement=connection.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
