package sample;

import java.sql.*;

public class DBHandler {

    String url = "jdbc:mysql://127.0.0.1:3306/atmlab2?user=root&password=root";
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    public DBHandler(){
        try {
            connection= DriverManager.getConnection(url);

        }catch (SQLException e){
            System.out.println("Connection failed");
        }
    }

    public boolean logIn(String user , String pass){
        String tempUser = null;
        String tempPass = null;
        try{
            statement = connection.createStatement();
            resultSet=statement.executeQuery("select * from customer where username='" +user+ "'" );
            while (resultSet.next()){
                tempUser = resultSet.getString(1);
                tempPass = resultSet.getString(2);
            }
        }catch (SQLException e){

        }
        if (tempUser.equals(user) && tempPass.equals(pass)){
            return true;
        }
        else return false;
    }

    public double checkBalance(String user){
      double balance = 0;
        try{
            statement = connection.createStatement();
            resultSet=statement.executeQuery("select balance from account where customer_username='" + user + "'");
            while (resultSet.next()){
                balance = resultSet.getDouble(1);
            }
        }catch (SQLException e){

        }
        return balance;
    }

}
