package com.ventoday.bookrepo.config;


/**
 * @author ssaha (23.11.20)
 */
public class RunLengthEncoding {

    public static void main( String[] args ) {

        //aaabbcccdd -> 3a2b3c2d

        System.out.println(getEncodedValue( "aaabbcccdd" ));

    }

    public static String getEncodedValue(String input){

        //Check for null or empty string
        if(input == null || input.length() == 0){
            return null;
        }
        //Initialize helper variables
        char[] inputChars = input.toCharArray();
        char previous = 0;
        int counter = 0;
        StringBuilder result = new StringBuilder();

        for(char c : inputChars){
            if(c == previous){
                counter++;
            } else{
                if(previous != 0){
                    result.append( counter ).append( previous );
                }
                previous = c;
                counter = 1;
            }
        }
        result.append( counter ).append( previous );
        return result.toString();
    }
}
