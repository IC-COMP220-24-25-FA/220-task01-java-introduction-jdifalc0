package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void sampleTestThatPasses(){
        assertEquals("This test should pass", "This test should pass");
        assertTrue(8>5);
        assertFalse(8<5);
    }
    
    @Test
    public void calcAreaTest(){
        Triangle myTriangle = new Triangle(4,6,8);
        //3rd parameter says how far off it can be since it is a double
        assertEquals(11.62, myTriangle.calcArea(),.001);
        
        myTriangle = new Triangle(1,3,3);
        assertEquals(1.479, myTriangle.calcArea(),.0001);

        myTriangle = new Triangle(1.5,3,2.5);
        assertEquals(1.871, myTriangle.calcArea(),.0001);
    }
    @Test
    public void longestlinewithinTest(){
        Triangle myTriangle = new Triangle(4,6,8);
        assertEquals(3.8733, myTriangle.longestLineWithin(),.001);
        myTriangle = new Triangle(1,3,3);
        assertEquals(0.986, myTriangle.longestLineWithin(),.0001);

        myTriangle = new Triangle(1.5,3,2.5);
        assertEquals(1.24733, myTriangle.longestLineWithin(),.0001);
    

    }
    // This is not working for some reason. Refuses to run the test?
    @Test
    public void doubleSizeTest(){
        Triangle myTriangle = new Triangle(4,6,8);
        myTriangle.doubleSize();
        //3rd parameter says how far off it can be since it is a double
        assertEquals(23.24, myTriangle.calcArea(),.001);
        
        myTriangle = new Triangle(1,3,3);
        myTriangle.doubleSize();
        assertEquals(2.958, myTriangle.calcArea(),.0001);

        myTriangle = new Triangle(1.5,3,2.5);
        myTriangle.doubleSize();
        assertEquals(3.742, myTriangle.calcArea(),.0001);
    
    }

    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Triangle(0));
    }
}

    