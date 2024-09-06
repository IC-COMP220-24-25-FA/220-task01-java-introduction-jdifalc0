package edu.ithaca.dragon.shapes;

import java.lang.classfile.instruction.ThrowInstruction;

public class Triangle implements Shape {
    double sideA;
    double sideB;
    double sideC;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public double calcArea(){
        double s = (sideA + sideB + sideC)/2;
        return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));

    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        sideA= sideA *1.5;
        sideB=sideB *1.5;
        sideC=sideC * 1.5;
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        double area = calcArea();
        return 2*(area/sideB);
    }
    public String tostring(){
        return "Triangle, SideA:"+ this.sideA+"SideB:"+this.sideB+"SideC"+this.sideC;
    }
}