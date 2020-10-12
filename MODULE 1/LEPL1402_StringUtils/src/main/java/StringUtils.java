public class StringUtils {


    /**
     * Split a strin according to a delimiter
     *
     * @param str The string to split
     * @param delimiter The delimiter
     * @return An array containing the substring which fall
     *          between two consecutive occurence of the delimiter.
     *          If there is no occurence of the delimiter, it should
     *          return an array of size 1 with the string at element 0
     */
    public static String [] split(String str, char delimiter){
        if (!str.contains(Character.toString(delimiter))){
            return null;
        }
        int count = 1;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == delimiter){
                count++;
            }
        }
        String[] array = new String[count];
        int iter  = 0;
        int begin = 0;
        for (int j = 0; j < str.length(); j++){
            if (str.charAt(j)== delimiter){
                array[iter] = str.substring(begin, j);
                iter++;
                begin = j+1;
            }
            if(j == str.length()-1){
                array[iter] = str.substring(begin, j+1);
            }
        }
        return array;
    }


    /**
     * Find the first occurence of a substring in a string
     *
     * @param str The string to look in
     * @param sub The string to look for
     * @return The index of the start of the first appearance of
     *          the substring in str or -1 if sub does not appear
     *          in str
     */
    public static int indexOf(String str, String sub){
        int index = -1;

        for (int i = 0; i <= str.length()-sub.length(); i++){
            if (str.substring(i, i + sub.length()).equals(sub)){
                index = i;
                return index;
            }
        }
        return index;
    }


    /**
     * Convert a string to lowercase
     *
     * @param str The string to convert
     * @return A new string, same as str but with every
     *          character put to lower case.
     */
    public static String toLowerCase(String str){
        char[] s1 = str.toCharArray();
        int diff = 'a' - 'A';
        for (int i = 0; i < s1.length; i++){
            if (s1[i] >= 'A' & s1[i] <='Z'){
                s1[i] += diff;
            }
        }
        return String.valueOf(s1);
    }


    /**
     * Check if a string is a palyndrome
     *
     * A palyndrome is a sequence of character that is the
     * same when read from left to right and from right to
     * left.
     *
     * @param str The string to check
     * @return true if str is a palyndrome, false otherwise
     */
    public static boolean palindrome(String str){
        for (int i = 0; i < str.length()/2; i++){
            if (str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }


}
