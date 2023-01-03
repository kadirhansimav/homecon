package Classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author baransonmez
 */
public class Admin extends AUser implements IAdmin{

    public Admin(String name, String surname, String userName, String password) {
        super(name, surname, userName, password);
    }

   
    
    
    
    @Override
    public void deleteAll() {
       
    }

    @Override
    public void addUser() {
        
    }
    
}
