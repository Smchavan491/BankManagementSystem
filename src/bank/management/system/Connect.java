package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
public class Connect {
    Connection connection;
    Statement statement;
    public Connect(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Root_123");
            statement = connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
