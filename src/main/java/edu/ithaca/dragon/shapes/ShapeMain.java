package edu.ithaca.dragon.shapes;
import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner; 
import java.util.random.*;
public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times
        Rectangle[] rectangles = new Rectangle[5];
        rectangles[0] = new Rectangle(Math.random(),Math.random());
        rectangles[1] = new Rectangle(Math.random(),Math.random());
        rectangles[2] = new Rectangle(Math.random(),Math.random());
        rectangles[3] = new Rectangle(Math.random(),Math.random());
        rectangles[4] = new Rectangle(Math.random(),Math.random());
        // Must type 1,2,3,4 or 5
        for (int i = 0; i < 5; i++) {
            System.out.println("Choose one: Rectangle 1 Area:"+rectangles[0].calcArea()+"Rectangle 1 Longest Line:"
            +rectangles[0].longestLineWithin() +"Rectangle 2 Area:"+rectangles[1].calcArea()+"Rectangle 2 Longest Line:"
            +rectangles[1].longestLineWithin() +"Rectangle 3 Area:"+rectangles[2].calcArea()+"Rectangle 3 Longest Line:"
            +rectangles[2].longestLineWithin() +"Rectangle 4 Area:"+rectangles[3].calcArea()+"Rectangle 4 Longest Line:"
            +rectangles[3].longestLineWithin() +"Rectangle 5 Area:"+rectangles[4].calcArea()+"Rectangle 5 Longest Line:"
            +rectangles[4].longestLineWithin() ) ;
            Scanner myObj = new Scanner(System.in);
            int choiceint= myObj.nextInt();
            rectangles[choiceint].doubleSize();
        
        }
        List<Shape> shapeList= new ArrayList<Shape>();
        for (int i =0; i<10;i++){
            int typeShape= (int)(Math.random()*2);
            if (typeShape == 0){
                shapeList.add(new Circle(Math.random()));
            }
            else if (typeShape==1){
                shapeList.add(new Rectangle(Math.random(),Math.random()));
            }
            else{
                shapeList.add(new Triangle(Math.random(),Math.random(),Math.random()));
            }

        }
        for (int i =0; i<shapeList.size();i++){
            System.out.println(shapeList.get(i));
        }
        for (int i =0; i<shapeList.size();i++){
            shapeList.get(i).doubleSize();
            System.out.println(shapeList.get(i));
        }


    }
}
