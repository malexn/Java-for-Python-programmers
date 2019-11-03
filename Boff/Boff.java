import java.util.*;
import java.util.stream.*;

public class Boff {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = new String();
        int a,b;
        try {
            n = sc.next();
            a = Integer.parseInt(sc.next());
            b = Integer.parseInt(sc.next());
        } finally {
            if(sc != null) {
                sc.close();
            }
        }

        
        int c = Integer.parseInt(n);
        int counter = 0;
    
        int[] arr = IntStream.rangeClosed(a,b).toArray(); // skapar en array med startvärde a & slutvärde b,
        for (int i = 0; i < arr.length; ++i) { // itererar över varje element i våran array,
            String res = String.valueOf(arr[i]); // konverterar int till string,

            if ( arr[i] % c == 0) { // om elementet är jämnt delbart med n,
                counter ++;
            } else if (res.endsWith(n)){ // om sista karaktären i res = n,
                counter ++;
            }
            
        }

        System.out.println(counter);

    }
}
