
package com.mycompany.racing;
public class Racer extends Thread {
    
    private int stepsCounter = 0;
    private int goal;
    private static boolean isWinner = false;
    private static final Object lock = new Object();
    
    int max = 10;
    int min = 1;
    int range = max - min + 1;
    
    public Racer(String nameInput, int goal) {
        super(nameInput);
        this.goal = goal;
    }
       
    @Override
    public void run() {
      
        while (!isWinner) {
            
            int step = (int)(Math.random() * range) + min;
            this.stepsCounter += step;
            
            // Time between each step while running
            try {               
                Thread.sleep(10);              
            } catch (InterruptedException e) {
                e.printStackTrace();               
            }
            
            synchronized (lock) {
                
                if (isWinner) break;                
                System.out.println("Racer: " + getName() + "| Steps: " + stepsCounter + "\n");
               
                if (stepsCounter >= goal) {
                    isWinner = true;                        
                    System.out.println("Racer " + getName() + " has won!");  
                    break;
                }          
                
            } // sincronized            
        } // while      
    } // run
}
