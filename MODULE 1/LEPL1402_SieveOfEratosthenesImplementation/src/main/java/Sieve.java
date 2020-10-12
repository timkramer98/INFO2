import java.util.BitSet;

public class Sieve{
    
    public static BitSet bits; //You should work on this BitSet
    
    public static int numberOfPrime(int n){
        if ( n < 2 ) {
            return 0;
        }

        BitSet amount = new BitSet( n + 1 );
        amount.flip( 2, n + 1 );
        for ( int i = 2; i <= Math.sqrt( n ); ++i ) {
            if ( amount.get( i ) ) {
                for ( int j = i * i; j <= n; j += i ) {
                    amount.set( j, false );
                }
            }
        }

        return amount.cardinality();
    }
    
}