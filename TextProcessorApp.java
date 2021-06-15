/*
 * @author: Nathiélle Nascimento
 * @date: 21/05/2021
 * TextProcessorApp.java
 * TABA - Software Development
 * National College of Ireland - Higher Diploma in Computing Science 
 */

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TextProcessorApp {
public static void main (String args[]) {
		
		//Declare variables
		String  paragraph = " ", encoded;
		int  intSentences, shortestWordsQty = 0, option, paragraphQty = 0, paragraphOption;
		StringBuffer strBuff;
		
		
		
        
        
        //Create object
		TextProcessor myOption = new TextProcessor();
		Scanner sc = new Scanner(System.in);
        //Input
       /* Keep the menu open unless is pressed 3 to exit the application*/
        do {
        	
        	System.out.println("Please enter number: " + 
								"\n1 - Add a Paragraph" +
								"\n2 - Add words" +
								"\n3 - Exit application" +
								"\nEnter your choice: ");
      
		option = Integer.parseInt(sc.nextLine());
		//Process
		
 
		//Output
       
        
        switch(option) {
    	case 1: 
    	{	//Process
    		
    		System.out.println("How many paragraph do you want to insert?");
    		paragraphQty = Integer.parseInt(sc.nextLine());
    		String paragraphsList[] = new String[paragraphQty];
    		
    		for(int i=0; i< paragraphsList.length; i++){
	    		System.out.println("Please insert the " + (i+1)+ " paragraph:");
	    		paragraphsList[i] = sc.nextLine();
    		}
	    	
    		System.out.println("Please choose a paragraph to be encoded: ");
    		for(int i=0; i< paragraphsList.length; i++){
	    		System.out.println(
	    				"\n" + i + " - "+ paragraphsList[i]);
    		}
    		
    		paragraphOption = Integer.parseInt(sc.nextLine());
    		
    		
    		
    		for(int i=0; i< paragraphsList.length; i++){
    			if(paragraphOption == i) {
    				
    				paragraph = paragraphsList[i];
    			}
    			
    		}
    		
    		myOption.setParagraph(paragraph);
    		//Process
    		myOption.computeEncodedParagraph();
    		
    		intSentences = myOption.getIntSentences();
    		encoded = myOption.getEncoded();
    		

    		System.out.println(intSentences + encoded + "\n");
    		
    		
    		break;
    	}
    	
    	case 2:
    	{
    		System.out.println("How many words do you want to add?");
    		int wordsQty = Integer.parseInt(sc.nextLine());
    		String addWords[] = new String[wordsQty];
    		
    		myOption.setWordsQty(wordsQty);
    		
    		for(int i = 0; i< addWords.length; i++ ){
    			
    			System.out.println("Please insert your " + (i +1) +  " word.");
    			addWords[i] = sc.nextLine();
    			
    		}
    		
    		myOption.setAddWords(addWords);
    		
    		String shortestWords[] = new String[wordsQty];
    		myOption.setShortestWords(shortestWords);
    		myOption.computeShortestWords();
    		
    		break;
    	}
    		
    	case 3:
    	{
    		
    		break;
    	}
    	
    	default:
    	{
    		//Validate if the number entered weren't between 1 and 5
    		System.out.println("Incorrect number entered.");
    	}
		}
	
       }while(option != 3);  
		
	}//main
	
}//class
