public class Fibonacci {


    public static int fiboRecursive(int index){
        if (index == 1 || index == 0){
            return 1;
        }
        else{
            return fiboRecursive(index-1) + fiboRecursive(index-2);
        }
    }


    public static int fiboIterative(int index){
        if (index == 0 || index == 1){
            return index;
        }
        int a = 0; int b= 1; int c = 0;
        for (int i = 1; i <= index; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return a;
    }

}
