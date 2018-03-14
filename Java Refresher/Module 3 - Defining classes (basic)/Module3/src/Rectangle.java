/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Rectangle {
    private int height;
    private int width;
    
    public Rectangle(){
        System.out.println("Creating a new rectangle.");
        this.width = Input.askInt("Enter width:");
        this.height = Input.askInt("Enter height:");
    }
    
    public void showArea(){
        int area = this.height * this.width;
        System.out.println("The rectangle's area is " + area);
    }
    
    public void show(){
        System.out.println("The rectangle has dimensions " + this.width + "x" + this.height);
    }
    
    public static void showNumberOfSides(){
        System.out.println("Rectangles have 4 sides");        
    }
}
