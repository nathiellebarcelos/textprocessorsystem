import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 * @author: Nathiélle Nascimento
 * @date: 21/05/2021
 * TextProcessor.java
 * TABA - Software Development
 * National College of Ireland - Higher Diploma in Computing Science 
 */


public class TextProcessor {
	
	private String  paragraph, encoded;
	private int  intSentences, wordsQty, wordLenght, paragraphQty;
	StringBuffer strBuff;
	private String addWords[], shortestWords[], paragraphsList[];
	
	
	public TextProcessor() {
		paragraph = " ";
		encoded = " ";
		intSentences = 0;
		wordsQty = 0;
		paragraphQty = 0;
		strBuff = new StringBuffer();
		addWords = new String[wordsQty];
		shortestWords = new String[10];
		paragraphsList = new String[paragraphQty];
	}
	
	public void computeEncodedParagraph(){
		strBuff = new StringBuffer();
		paragraph = paragraph.toLowerCase();
		
		for(int i = 0; i< paragraph.length(); i++ ){
			
		///If to validate vowels and add "No" after each vowel
		if((paragraph.charAt(i) == 'a') || (paragraph.charAt(i) == 'e') || (paragraph.charAt(i) == 'i') || (paragraph.charAt(i) == 'o') || (paragraph.charAt(i) == 'u')) {
			
			paragraph.charAt(i + 1);
			strBuff.append(paragraph.charAt(i) + "No");
			
		}else if (paragraph.charAt(i) == '?'){
			
			intSentences++; 
			strBuff.append(paragraph.charAt(i));
			
		}else {
			strBuff.append(paragraph.charAt(i));
		}
		
		encoded = strBuff.toString();
		}
		
	}
	
	public void computeShortestWords(){
		//Function to search the shortest word in the array addWords.
		for(int i = 0; i< addWords.length; i++ ){
			
			wordLenght = addWords[i].length();
			
			i = i+1;
				//If to compare the strings 
				if(wordLenght < addWords[i].length()) {
					
					shortestWords[i] = addWords[i -1];
	
					
				} else if(addWords[i].length() == wordLenght) {
				
					shortestWords[i - 1] = addWords[i];
					shortestWords[i] = addWords[i - 1];

					
				}else if ((wordLenght > addWords[i].length())) {
					shortestWords[i -1] = addWords[i];

				}else {
					
				}

			}
				
		System.out.println("The Shortest value is" + Arrays.deepToString(shortestWords));
			
		}
	

	public int getIntSentences() {
		return intSentences;
	}

	
	public String getEncoded() {
		return encoded;
	}
	

	public void setShortestWords(String[] shortestWords) {
		this.shortestWords = shortestWords;
	}

	public void setParagraph(String paragraph) {
		this.paragraph = paragraph;
	}


	public void setWordsQty(int wordsQty) {
		this.wordsQty = wordsQty;
	}


	public void setAddWords(String[] addWords) {
		this.addWords = addWords;
	}
	
	

}
