
package com.mycompany.racing;

public class Racing extends Thread {
    
    private static int goal = 100;  
    public static void main(String[] args) {
               
        Racer sebas = new Racer("Python", goal);
        Racer julian = new Racer("Java", goal);
        Racer tulio = new Racer("C++", goal);
        
        sebas.start();
        julian.start();
        tulio.start();       
    }
}
