package cp213;

/**
 * @author Ashish Sharma 169044454
 * @version 2023-05-23
 */
public class Strings {
    // Constants
    public static final String VOWELS = "aeiouAEIOU";

    /**
     * Determines if string is a "palindrome": a word, verse, or sentence (such as
     * "Able was I ere I saw Elba") that reads the same backward or forward. Ignores
     * case, spaces, digits, and punctuation in the string parameter s.
     *
     * @param string a string
     * @return true if string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(final String string) {

	// your code here
    	boolean palindrome = false;
    	String reversedStr = "";
    	char character;
    	
    	// reverse the string
    	for (int i = 0; i < string.length(); i++) {
    		character = string.charAt(i);
    		reversedStr = character + reversedStr;
    	}
    	
    	// only include letters for both string 
    	String strLetters = "", revLetters = "";
    	
    	for (int i = 0; i < string.length(); i++) {
    		// only add letters from string
    		if (Character.isAlphabetic(string.charAt(i))) {
    			character = string.charAt(i);
    			strLetters += character;
    		}
    	}
    	
    	for (int i = 0; i < reversedStr.length(); i++) {
    		if (Character.isAlphabetic(reversedStr.charAt(i))) {
    			character = reversedStr.charAt(i);
    			revLetters += character;
    		}
    	}
    	
    	if (strLetters.toLowerCase().equals(revLetters.toLowerCase())) {
    		palindrome = true;
    	}

	return palindrome;
    }

    /**
     * Determines if name is a valid Java variable name. Variables names must start
     * with a letter or an underscore, but cannot be an underscore alone. The rest
     * of the variable name may consist of letters, numbers and underscores.
     *
     * @param name a string to test as a Java variable name
     * @return true if name is a valid Java variable name, false otherwise
     */
    public static boolean isValid(final String name) {

	// your code here
    	boolean validVariable = true; // assume variable is acceptable
    	if (Character.isDigit(name.charAt(0))) {
    		validVariable = false; // false if the variable starts with an number
    	}
    	for (int i = 1; i < name.length(); i++) {
    		if (!Character.isDigit(name.charAt(i)) && !Character.isAlphabetic(name.charAt(i))) {
    			validVariable = false;
    		}
    	}
    	
	return validVariable;
    }

    /**
     * Converts a word to Pig Latin. The conversion is:
     * <ul>
     * <li>if a word begins with a vowel, add "way" to the end of the word.</li>
     * <li>if the word begins with consonants, move the leading consonants to the
     * end of the word and add "ay" to the end of that. "y" is treated as a
     * consonant if it is the first character in the word, and as a vowel for
     * anywhere else in the word.</li>
     * </ul>
     * Preserve the case of the word - i.e. if the first character of word is
     * upper-case, then the new first character should also be upper case.
     *
     * @param word The string to convert to Pig Latin
     * @return the Pig Latin version of word
     */
    public static String pigLatin(String word) {

	// your code here
    	// check if string begins with vowels
    	
    	

	return null;
    }

}
