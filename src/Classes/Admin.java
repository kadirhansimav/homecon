package Classes;

import Frames.AddNewHousemateFrame;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.*;
 
 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author baransonmez
 */
public class Admin extends AUser implements IAdmin{
     Connection connection = null;
    dbHelper dbHelper1 = new dbHelper();
    Statement statement ;
    ResultSet resultSet;

    public Admin(String name, String surname, String userName, String password) {
        super(name, surname, userName, password);
    }

   
    
    
   
    @Override
    public void deleteAll() {
         try {
            String sql = "delete * from  ?,?";
            connection = dbHelper1.getConnection();
            statement = connection.createStatement();
            statement.executeQuery(sql);
        } catch (Exception e) {
             System.out.println("Classes.Admin.deleteAll()");
        } finally {
              
        }
         
    }

    
 
    public void addNewHousemate(String name,String surname, String userName, String password) {
         Connection connection =null; 
        dbHelper dbHelper1 = new dbHelper();
         PreparedStatement statement =null;
         ResultSet resultSet ;
        //!!!!!!!!! PERSON YERİNE ADMİN  !!!!!!!
       User person = new User(name,surname, userName, password);
        
        
        try {
            String username = userName;
            String pass = password;
            String nameIn = name;
            String surnameIn = surname;
            connection = dbHelper1.getConnection(); 
            String sql = "insert into deneme (UserName,Password,Name,Surname) values (?,?,?,?)";
            statement = connection.prepareStatement(sql);         
            statement.setString(1, username);
            statement.setString(2, pass);
            statement.setString(3, nameIn);
            statement.setString(4, surnameIn);
            statement.executeUpdate();
            System.out.println("AddNewHousemate.jButton1ActionPerformed() ekleme");         
        } catch (Exception e) {
            System.out.println("hkullanıcı mevcut");
        } finally {
             try {
                 connection.close();
                 statement.close();
                 
             } catch (SQLException ex) {
                 System.out.println("Classes.Admin.addNewHousemate()");
             }
            
        }
          
    }

   
    
 
    
}
