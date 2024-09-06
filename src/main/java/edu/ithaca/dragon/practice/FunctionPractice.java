package edu.ithaca.dragon.practice;

import java.util.List;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        if (first>second && first>third){
            return first;
        
        } else if (second>first  && second>third){
            return second;
        }else{
            return third;
        }
    }
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
         double percentage = (discountPercent /100)*originalPrice;
        return (originalPrice-percentage)+salesTax;
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        if (daysSinceShoesChewed == 0){
            return false;
        }else if (fetchedThePaperToday == false){
            return false;
        }else{
            return true;
        }
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        int size = numbers.size();
        int largest = 0;
        int number = 0;
        if (size == 0){
            return -1;
        }
        for (int i =0;i<size;i++) {
            if (number<numbers.get(i)){
                number = numbers.get(i);
                largest =i;
            }
        }
        return largest;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        int size = numbers.size();
        int largest = 0;
        int number = 0;
        if (size == 0){
            return -1;
        }
        for (int i =0;i<size;i++) {
            if (number<=numbers.get(i)){
                number = numbers.get(i);
                largest =i;
            }
        }
        return largest;
    }
    

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        int size = words.size();
        int largest = 0;
        int index = 0;
        for (int i =0;i<size;i++) {
            int counter = 0;
            for (int c = 0; c<words.get(i).length();c++){
                if (letter == words.get(i).charAt(c)){
                    counter = counter +1;
                }
            }
            if (counter>largest){
                largest = counter;
                index = i;
            }
        }
        return words.get(index);
    }
    } 



