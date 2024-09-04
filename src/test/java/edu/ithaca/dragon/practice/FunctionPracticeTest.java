package edu.ithaca.dragon.practice;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2)); // Tests largest in second
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2)); // Tests largest in first
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5)); // Tests largest in third
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5)); // Tests all the same

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
    }

    @Test
    public void calcSalePriceTest(){
        assertEquals(76, FunctionPractice.calcSalePrice(100, 25, 1));
        assertEquals(0, FunctionPractice.calcSalePrice(100, 100, 0));
        assertEquals(101, FunctionPractice.calcSalePrice(100, 0,1));
    }

    @Test
    public void isGoodDog(){
        assertEquals(true, FunctionPractice.isGoodDog(5, 1, true));
        assertEquals(false, FunctionPractice.isGoodDog(2, 3, false));
        assertEquals(false, FunctionPractice.isGoodDog(2, 0, true));
    }
    @Test
    public void findFirstLargestTest(){
        List<Integer> testList;
        testList= new ArrayList<Integer>();
        testList.add(0,1);
        testList.add(1,2);
        testList.add(2,3);
        testList.add(3,4);
        testList.add(4,5);
        assertEquals(4, FunctionPractice.findFirstLargest(testList));
        testList.add(5,5);
        assertEquals(4, FunctionPractice.findFirstLargest(testList)); 
    }
    public void findLastLargestTest(){
        List<Integer> testList;
        testList= new ArrayList<Integer>();
        testList.add(0,1);
        testList.add(1,2);
        testList.add(2,3);
        testList.add(3,4);
        testList.add(4,5);
        assertEquals(4, FunctionPractice.findLastLargest(testList));
        testList.add(2,5);
        assertEquals(4, FunctionPractice.findLastLargest(testList));
    }
    public void findFirstMostOccurencesOfLettertest(){
        List<String> testList;
        testList= new ArrayList<String>();
        testList.add(0,"apple");
        testList.add(1,"core");
        testList.add(2,"people");
        testList.add(3,"symetrical");
        testList.add(4,"lines");
        assertEquals(2, FunctionPractice.findFirstMostOccurencesOfLetter(testList, 'e'));
        assertEquals(0, FunctionPractice.findFirstMostOccurencesOfLetter(testList, 'p'));
    }
}
