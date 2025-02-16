
package com.mycompany.racing;

public class Racing extends Thread {
    
    private static int goal = 100;  
    public static void main(String[] args) {
               
        Racer racer1 = new Racer("Python", goal);
        Racer racer2 = new Racer("Java", goal);
        Racer racer3 = new Racer("C++", goal);
        
        racer1.start();
        racer2.start();
        racer3.start();       
    }
}
