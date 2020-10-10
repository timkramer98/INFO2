public class MergeSort {

    /**
     * Pre-conditions: a[lo..mid] and a[mid+1..hi] are sorted
     * Post-conditions: a[lo..hi] is sorted
     */
    private static void merge(int[] a, int[] aux, int lo, int mid, int hi) {
        int i = lo;
        int j = mid+1;
        for(int k=lo; k <= hi; k++)
            aux[k] = a[k];
        for(int k=lo; k <= hi; k++){
            if(i > mid)         a[k] = aux[j++];
            else if (j > hi)    a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else    a[k] = aux[i++];
        }
    }
    /**
     * Rearranges the array in ascending order, using the natural order
     */
    public static void sort(int[] a) {
        int N = a.length;
        int[] aux = new int[N];
        for(int sz = 1; sz < N; sz = sz + sz){
            for(int lo = 0; lo < N-sz; lo += sz +sz){
                merge(a,aux, lo, lo+sz-1, Math.min(lo+sz+sz-1, N-1));
            }
        }
    }
    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }


}
