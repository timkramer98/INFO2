
public class Search {

    /**
     * @param tab is an ordered array of int.
     * @return index of elem or -1
     */
    public static int search(int[] tab, int elem){
        int high = tab.length;
        int low = 0;
        for (int i = 0; i < tab.length; i++){
            int mid = (high+low)/2;
            if (tab[mid] == elem){
                return mid;
            }
            else{
                if (elem > tab[mid]){
                    low = mid;
                }else{
                    high = mid;
                }
            }
        }
        return -1;

    }
}
