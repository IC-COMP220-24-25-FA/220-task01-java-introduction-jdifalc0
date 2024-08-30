package edu.ithaca.dragon.shapes;

import java.lang.classfile.instruction.ThrowInstruction;

public class Circle {
    private double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        this.radius = radius;
        
    }
    public double getRadius(){
        return this.radius;
    }
    /**
     * @return the area of this circle
     */
    public double calcArea(){
        return Math.PI * Math.pow(this.radius,2);
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        this.radius = radius *1.4142;
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        return (this.radius *2);
    }
}
