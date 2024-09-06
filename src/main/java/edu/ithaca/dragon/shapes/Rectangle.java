package edu.ithaca.dragon.shapes;

public class Rectangle implements Shape {
    double length;
    double width;

    public Rectangle(double length, double width){
        this.length =length;
        this.width=width;
    }

    public double calcArea(){
        return this.length * this.width;
    }

    public void doubleSize(){
        this.length = this.length*2;
        this.width = this.width *2;
    }

    public double longestLineWithin(){
        return Math.sqrt(Math.pow(this.length,2)+Math.pow(this.width,2));
    }
    public String toString(){
        return"Square, Length:"+ this.length+"Width:"+this.width;
    } 
    
}
