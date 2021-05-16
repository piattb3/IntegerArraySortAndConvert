/**
 * @author Benjamin Piatt
 * @date 5/16/2021
 * @description Program to declare arrays, sort based on value in ascending order, convert to string, and format print statement to append arrays.
 */

package edu.cscc;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Java style Array declarations to be used for sorting purposes, initialized with values pre-assigned, modified from C-Style declarations
        int[] setOne = {1,2,3,7,5,6};
        int[] setTwo = {1,8,3,4,2,9};

        // Ease of use integers to remove clutter from nested For loop declarations
        int s1 = setOne.length-1;
        int s2 = setTwo.length-1;

//        Arrays.sort(setOne); -- Old code, omitted based on request, here for reference
//        Arrays.sort(setTwo); -- Old code, omitted based on request, here for reference

        // Placeholder Variable 'other' corresponding to setOne
        int other;
        // Placeholder Variable 'another' corresponding to setTwo
        int another;

        // Nested for loop to sort array setOne
        // For loop Initialization, Termination, Incrementation
        // Outer loop to tell which position in setOne to fill next, and increment to indicate number of cycles based on array length-1
        for(int i=0; i<s1; i++){
            // Inner for loop to find smallest value left in array index in the unsorted portion of the array
            for(int j=0; j<s1; j++){
                // If statement to compare array values to sort ascending by inserting it before, depending on comparison result
                // Used to swap values in indices using placeholder variable to maintain array integrity
                if(setOne[j]>setOne[j+1]){
                    // Placeholder to hold value of next item within array setOne
                    other=setOne[j+1];
                    // Assign placeholder value to new index position within array
                    setOne[j+1]=setOne[j];
                    // Reassign values to set variable 'other' to position j within setOne
                    setOne[j]=other;
                }
            }
        }

        // Nested for loop to sort array setTwo
        // For loop Initialization, termination, incrementation
        // Outer loop to tell which position in setTwo to fill next, and increment to indicate number of cycles based on array length-1
        for(int i=0; i<s2; i++){
            // Inner for loop to find smallest value left in array index in the unsorted portion of the array
            for(int j=0; j<s2; j++){
                // If statement to compare array values to sort ascending by inserting it before, depending on comparison result
                // Used to swap values in indices using placeholder variable to maintain array integrity
                if(setTwo[j]>setTwo[j+1]){
                    // Placeholder to hold value of next item within array setTwo
                    another=setTwo[j+1];
                    // Assign placeholder value to new index position within array
                    setTwo[j+1]=setTwo[j];
                    // Reassign values to set variable 'another' to position j within setTwo
                    setTwo[j]=another;
                }
            }
        }

        // cubeList refers to original prompt of having two cubes displaying the date, with the following number indicating which set it refers to.
        // Arrays.toString function to return a string representation of contents of specified array as a list within hard brackets, separated with commas and spaces
        // .replace function to format strings to remove hard brackets, commas, and spaces
        String cubeList1 = Arrays.toString(setOne).replace("[", "").replace("]","").replace(",", "").replace(" ", "");
        String cubeList2 = Arrays.toString(setTwo).replace("[", "").replace("]","").replace(",", "").replace(" ", "");

        // Print statement to append converted array values 
        System.out.println(cubeList1 + cubeList2);
    }

}