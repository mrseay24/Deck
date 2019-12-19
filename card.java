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

card class

File(s): Deck.java, card.java

Purpose: Gain experience with vectors and generic algorithms
  
*/


import java.awt.*;
import java.io.*;
import java.util.*;

public class card  {

    /*
    String deckCardRank[] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
    		"10", "Jack", "Queen", "King"};
    */
    //**************************************************************
	/*
	 *  translate deckCardRank to the following value for sorting purpose
	 *  sort in correct order
	 *  reference method cardDeckSort
	 *  do not change values order
	 */
    String deckCardRank[] = {"1A", "1M", "1L", "1K", "1J", "1I", "1H", "1G", "1F",
    	    		"1E", "1D", "1C", "1B"};
    //
    //**************************************************************
    /*
    String deckCardToken[] = {"Hearts", "Diamonds", "Clubs", "Spades"};
    */
    //**************************************************************    
	/*
	 *  translate deckCardToken to the following value for sorting purpose
	 *  sort in correct order
	 *  reference method cardDeckSort
	 *  do not change values order  
	 */
    String deckCardToken[] = {"1", "4", "2", "3"};
    //
    //**************************************************************
    String deck[] = new String[52];
    
    //private static java.util.List<Object> deck = new ArrayList<Object>();
    
    int cardIndex = 0;  // card deck array index 
    int numberOfCards[] = new int[52];  // number of cards in the deck
    
    /*
     * 1. Populate card deck
     * 2. Sort and print card deck
     * 3. Shuffle sorted card deck
     * 4. Print shuffle card deck
     * 
     */
    card() {
    	populateCardDeck();
    	
    	cardDeckSort(deck);
    	
    	cardDeckShuffle(deck);    	

    }

    /*
     *  constructor
     */
    card(String cardRank, String cardToken) {
    	
    }
    
    /*
     * Populate card deck
     */    
    private void populateCardDeck() {

    	for (int iCardToken = 0; iCardToken <= 3; iCardToken++) {
        	for (int iDeckRank = 0; iDeckRank < 13; iDeckRank++) {
        		deck[cardIndex] = cardDeckPopulate(iCardToken, iDeckRank);
        		cardIndex++;
        	}	
    	}
    }

    /*
     * Populate card deck to be sorted later in method
     * cardDeckSort
     */    
    private String cardDeckPopulate(int cardToken, int deckRank) {
    	
    	String dcToken = deckCardToken[cardToken];
    	String dcRank = deckCardRank[deckRank];
    	
        //return (dcRank + " of " + dcToken);
    	
    	/*
    	 *  return the following format for sorting purpose
    	 *  card deck must sort in the correct order
    	 *  
    	 *  see method cardDeckSort 
    	 */
    	return (dcToken + " " + dcRank + " of ");
    }
    
    /*
     *  Create comparator for sorting card deck values
     */
    private void cardDeckSort(String[] cardDeck) {
    
    	String  tempCardDeck = ""; 

        for(int j = 0; j < cardDeck.length - 1; j++){
            for (int i = j + 1 ; i < cardDeck.length; i++){
                if(cardDeck[i].compareToIgnoreCase(cardDeck[j]) < 0) {
                    tempCardDeck = cardDeck[j];
                    cardDeck[j]= cardDeck[i]; 
                    cardDeck[i] = tempCardDeck;
                }
            }
         }

        for(int i = 0; i < cardDeck.length; i++){

        	translateCardDeckValues(cardDeck[i]);

        }
    }
    
    /*
     *  Reference deckCardToken and deckCardRank
     *  used to convert/translate card deck values     
     */
    private void translateCardDeckValues(String cardDeck) {
    	
    	String cardDeckToken = "";
    	String cardDeckRank = "";    	
    	/*
    	 * get card deck value from cardDeck
    	 * reference deckCardToken and deckCardRank
    	 */
    	cardDeckToken = cardDeck.substring(0,1);
    	cardDeckRank = cardDeck.substring(2,7);
    	/*
    	 * convert card deck value to Suit and Rank
    	 */
    	cardDeckToken = cardDeckToken.replace("1", "Hearts");
    	cardDeckToken = cardDeckToken.replace("2", "Clubs");
    	cardDeckToken = cardDeckToken.replace("3", "Spades");    	
    	cardDeckToken = cardDeckToken.replace("4", "Diamonds");
    	//
    	cardDeckRank = cardDeckRank.replace("1A", "Ace");
    	cardDeckRank = cardDeckRank.replace("1B", "King");
    	cardDeckRank = cardDeckRank.replace("1C", "Queen");
    	cardDeckRank = cardDeckRank.replace("1D", "Jack");    	
    	cardDeckRank = cardDeckRank.replace("1E", "10");    	
    	cardDeckRank = cardDeckRank.replace("1F", "9");    	
    	cardDeckRank = cardDeckRank.replace("1G", "8");    	
    	cardDeckRank = cardDeckRank.replace("1H", "7");    	
    	cardDeckRank = cardDeckRank.replace("1I", "6");    	
    	cardDeckRank = cardDeckRank.replace("1J", "5");    	
    	cardDeckRank = cardDeckRank.replace("1K", "4");    	
    	cardDeckRank = cardDeckRank.replace("1L", "3");    	
    	cardDeckRank = cardDeckRank.replace("1M", "2");    	
        // print card deck    	
    	System.out.println(cardDeckRank + " " + cardDeckToken);

    }
    
    /*
     * Shuffle sorted card deck
     * Print shuffle card deck
     */
    private void cardDeckShuffle(String[] cardDeck) {

    	 String sCardDeck = "";
    	 int pIndex = 0;
    	 
    	 Random rIndex = new Random();
         
    	 for (int cardIndex = 0; cardIndex < 20; cardIndex++) {
        	 // get random index between 0 and 19
        	 pIndex = rIndex.nextInt(19);
        	 // swap card position
        	 // this is the shuffle processes
             sCardDeck = cardDeck[cardIndex];
             cardDeck[cardIndex] = cardDeck[pIndex];
             cardDeck[pIndex] = sCardDeck;
             
         }
    	 System.out.println(" ");
    	 System.out.println("Shuffle Card Deck");    	 
    	 System.out.println(" ");
    	 // print shuffle card deck
         for(int i = 0; i < cardDeck.length; i++){

         	translateCardDeckValues(cardDeck[i]);

         }    	
    }
    

}