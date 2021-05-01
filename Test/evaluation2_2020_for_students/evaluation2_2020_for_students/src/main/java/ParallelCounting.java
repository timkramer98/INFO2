import java.util.Optional;

/**
 *  You can ADD any code you like in this class (new members, new methods, etc.).
 *  You can also add imports.
 */

public class ParallelCounting {
    /**
     * Return the number of values equal to v using a parallel algorithm.
     *
     * @param "nThreads is a value between 1 and values.length
     * @param v the value that you want to count
     * @param values an array of numbers
     * @return the number of elements equal to v in values (or 0 if no values are provided)
     *
     * Example: For
     *     values = [4.5f,3.2f,5.0f,6.6f,7.2f,1.5f,3.7f,5.8f,6.0f,9.0f,1.3f,2.3f,4.5f,1.5f]
     * and
     *     v = 4.5
     * the method returns 2 because the value 4.5 appears two times in the array.
     *
     * Try to give all threads more or less the same amount of work!
     */
    public static int search(float v, float[] values ){
        int sum = 0;
        for (int i = 0; i < values.length; i++){
            if (values[i] == v){
                sum+=1;
            }
        }
        return sum;
    }
    public static float[] listdiv(int div, Optional<float[]> values){
        float[] sum = new float[div];
        for (int i = 0; i < values.get().length; i++){
            sum[i] =  values.get()[i];
        }
        return sum;
    }

    public static int parallelCount (Optional<float[]> values, float v, int nThreads) {
        return 0;
    }
}