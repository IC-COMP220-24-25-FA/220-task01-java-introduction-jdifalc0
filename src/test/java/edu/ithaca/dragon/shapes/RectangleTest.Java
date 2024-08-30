package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void sampleTestThatPasses(){
        assertEquals("This test should pass", "This test should pass");
        assertTrue(8>5);
        assertFalse(8<5);
    }
    
    @Test
    public void calcAreaTest(){
        Rectangle myRectangle = new Rectangle(1,2);
        //3rd parameter says how far off it can be since it is a double
        assertEquals(2, myRectangle.calcArea());
        
        myRectangle = new Rectangle(5,6);
        assertEquals(30, myRectangle.calcArea());

        myCircle = new Circle(1.5,3);
        assertEquals(4.5, myRectangle.calcArea());
    }
    @Test
    public void longestlinewithinTest(){
        Rectangle myRectangle = new Rectangle(3,4);
        assertEquals(5, myRectangle.longestLineWithin());
    

    }
    // This is not working for some reason. Refuses to run the test?
    @Test
    public void doubleSizeTest(){
        Rectangle myRectangle = new Rectangle(2,4);
        myRectangle.doubleSize();
        assertEquals("4,6",String(myRectangle));
    }

    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Circle(0));
    }


    
}