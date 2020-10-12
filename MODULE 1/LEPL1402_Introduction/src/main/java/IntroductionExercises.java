public class IntroductionExercises {

    public static int variable = 0;

    public static int[] squares;

    /*
     * Function that bound variable to value
     */
        public static void attribute(int value){
            variable = value;
        }

    /*
     * Function that return the addition of the two parameters
     */
    //TODO add(int a, int b) method

    /*
     * return true is a and b are equal
     */
    //TODO equalsIntegers(int a, int b) method

    /*
     * Function that return the max between a and b
     * You must use a ternary operation
     */
    public static int max(int a, int b){
        return a;
    }

    /*
     * Function that return the middle value.
     * If a > b > c, the function must return b.
     * If two value are equals, return -1.
     */
    //TODO middleValue(int a, int b, int c) method

    /*
     * This function must return :
     * "Good morning, sir!" if str is "Morning"
     * "Good evening, sir!" if str is "Evening"
     * "Hello, sir!" otherwise
     * Use a switch case statement
     * Your implementation must be case sensitive
     */
    //TODO greetings(String str) method
    public static String greetings(String str) {
        switch (str) {
            case "Morning":
                return "Good morning, sir!";
            case "Evening":
                return "Good evening, sir!";
            default:
                return "Hello, sir!";
        }
    }
    public static  int[] lastFirstMiddle(int[] a){
        int[] b = new int[3];
        b[0] = a[a.length-1];
        b[1] = a[0];
        b[2] = a[a.length/2];
        return b;
    }
    public static int sum(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            count += array[i];
        }
        return count;
    }
    public static int maxArray(int[] array){
        int count = 0;
        int max  = 0;
        while (count  != array.length){
            if(array[count] > max){
                max = array[count];
            }
            count++;
        }
        return max;

    }
    /*
     * This function must return a new array of length 3
     * The first element of this new array is the last element of a
     * The second element is the first element of a
     * The last element is the middle element of a
     */
    //TODO lastFirstMiddle(int[] a)

    /*
     * This function must return the sum of the elements of array using a for loop
     */
    //TODO sum(int[] array) method

    /*
     * return the maximum element of array using a while loop
     */
    //TODO maxArray(int[] array) method

    /*
     * Using the argument of the program
     * Bound the variable squares with the square of
     * the elements passed in argument.
     * Look at the java API : https://docs.oracle.com/javase/8/docs/api/index.html
     * If an exception occurs, assign the value 0 at the index where its occurs
     */
    public static void main(String... args){
        //TODO main body
    }

}
