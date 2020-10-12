import java.util.ArrayList;

public class Decoder {

    /*
     * Forbidden characters are passed as an array of int.
     * Each element of this array correspond to the decimal ASCII code
     * of a forbidden character OR null if there's no forbidden character
     * If you encounter one of these forbidden character
     * you must ignore it when you translate your sentence.
     *
     * the 2D array "sentences" contain a set of decimal ASCII code we want you
     * to translate. Each sub-element of this array is a different sentence.
     * Ex : if we pass this array : [ ["42", "72", "88"], ["98", "99", "111", "47", "55"]]
     * to your decode method, you should return : [ "*HX", "bco/7" ]
     *
     * You should NEVER return null or an array containing null
     */
    public static String [] decode(int[] forbidden, String[][] sentences){
        ArrayList< String > output = new ArrayList<>();

        for ( int i = 0; i < sentences.length; ++i ) {
            StringBuilder builder = new StringBuilder();

            for ( int j = 0; j < sentences[ i ].length; ++j ) {
                boolean isForbidden = false;

                // If we have a forbidden array check if the char is fobidden
                if ( forbidden != null ) {
                    for ( int forb = 0; forb < forbidden.length; ++forb ) {
                        if ( forbidden[ forb ] == Integer.parseInt( sentences[ i ][ j ] ) ) {
                            isForbidden = true;
                            break;
                        }
                    }
                }

                // If char is forbidden skip
                if ( isForbidden ) { continue; }

                // Else cast the string as int then get the ascii value into the builder
                builder.append( ( char ) Integer.parseInt( sentences[ i ][ j ] ) );
            }

            // Append the first string to our buffer
            output.add( builder.toString() );
        }

        // Allocate memory and assign the values
        String[] parsed = new String[ output.size() ];
        return output.toArray( parsed );

    }

}