package mvcexample;

/**
 *
 * @author savi
 */
// Launcher for application

public class Main {
   
    public static void main(String args[]) {
     
        Model model = new Model();// Create shared database
        //Controllers Take in model, frame title, xLocation, yLocation
        Controller1 c1 = new Controller1(model, "Controller 1", 0, 0); 
        Controller2 c2 = new Controller2(model, "Controller 2", 40, 200); 
        Controller2 c3 = new Controller2(model, "Controller 2", 40, 400); 
        
    } // main
  
} // Main
