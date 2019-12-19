/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deck;

/*
  CSC3410 - Fall 2015
  Sidney Seay -  sseay5@student.gsu.edu

  Assignment: #1

  Deck class

  File(s): Deck.java, card.java

  Purpose: Gain experience with vectors and generic algorithms
    
*/


import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import deck.card;

public class Deck {

    private card deckCards;  // reference class card
    
    /*
     * 1. create instance of class card
     * 2. populate card deck - reference class card 
     * 3. print card deck - reference class card
     */
    Deck() {
    	/*
    	 * create instance of class card
    	 * 
    	 * call method card()
    	 * 
    	 * populate card deck
    	 * sort card deck
    	 * print sorted card deck
    	 * print shuffle card deck
      	 */
    	
    	deckCards = new card();

    }
    
    /*
     * Main program logic
     */
    public static void main(String args[]){
    	
    	Deck cardDeck = new Deck(); // call method Deck()
    	
    }
}