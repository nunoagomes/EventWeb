/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventapp;

/**
 *
 * @author nunoandrebarbosagomes
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RegularUser ru = new RegularUser();
        ru.setEmail("nuno_7@hotmail.com");
        ru.setPassword("N699819a");
        
        User u = new User();
        u.setEmail("nuno_7@hotmail.com");
        u.setPassword("N699819a");
        
        System.out.println(ru.getPassword());
        System.out.println(u.getPassword());
        
        
    }
    
}
