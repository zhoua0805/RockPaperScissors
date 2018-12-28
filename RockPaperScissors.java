//AliceZU1A1Q1
//Alice Zhou
//For: Mrs. Harris
//February 20th, 2018
//Rock Paper Scissors Game: this game prompts the user to play rock paper scissors with the computer.
//Revision: None

package com.company;
import java.util.Scanner;                 //import the scanner class for inputs

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);           //create a new scanner

        String [] data  = {"Rock", "Scissors", "Paper"};  //create an array with values of "Rock", "Paper" and "Scissors"
        int x;                                            //initialize the integer variable x
        System.out.println("Hello! Today, we are going to play a game called Rock Paper Scissors. ");  //print out the intro

        do {                                              //this loop repeats until the user inputs to exit the game

            //this loop checks for invalid inputs
            //partly borrowed from https://stackoverflow.com/questions/39355239/java-incorrect-input
            do {
                System.out.println("Please input an integer, 0 for rock, 1 for scissors and 2 for paper: ");
                String k = input.next();                  //let string k be the next input value

                try {
                    x =  Integer.parseInt(k);             //convert string k to integer x
                    if (x == 0 || x == 1 || x == 2)
                        break;           //break the loop if x is 0, 1 or 2 (correct input)
                    else
                        System.out.println("invalid input!");  //if x is not 0, 1 or 2, print "invalid input" (then proceed to the beginning of the loop)

                } catch (IllegalArgumentException e) {     //if the try statement cannot go through (k cannot be converted to an integer)
                    System.out.println("invalid input!");     //print "invalid input" (then proceed to the beginning of the loop)
                }
            } while (true);


            int a = (int) (Math.random() * 3);   //generate a random integer from 0 to 2

            if (x == a) {    //print out the result when it's a tie
                System.out.println("You both chose " + data[a] + ", it is a tie. ");

            } else if (x - 1 == a || (x + 2 == a)) {       //print out the result when the user loses
                System.out.println("You chose " + data[x] + " and the computer chose " + data[a] + ", you lost! ");

            } else if (x + 1 == a || (x - 2 == a)) {        //print out the result when the user wins
                System.out.println("You chose " + data[x] + " and the computer chose " + data[a] + ", you won! ");
            }

            System.out.println();
            System.out.println("Do you want to play again? 0 for yes, 1 for no:");    //ask if the user wants to play again
            int y = input.nextInt();
            if (y == 1){          //if the user chooses 1 (which represents no), break the whole loop and exit the game
                break;
            }
            System.out.println();
            //go back to the beginning of the loop.
        }while (true);

    }
}
