import java.util.*;
import java.util.stream.*;
import java.util.Collections;

public class SumSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, num = 0, max = 0, sum = 0;
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        try {
            n = sc.nextInt();
            int a[] = new int[n]; //storlek på array baserat på indata n som heltal
            for(int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);

            for (int i : a) { list.add(i); }
            Collections.sort(list);
        } finally {
            if(sc != null) {
                sc.close();
            }
        }
        
        if( n % 2 == 0) {
            num = n/2;
        }
        else if( n % 2 != 0) {
            num = (n+1)/2;
        }        

        for(int i = 0; i < num;i++)
        {
            max = list.get(list.size() - 1);
            list2.add(max);
            list.remove(list.size() -1);
        }
        
        for (int i = 0; i < list2.size(); i++) {
            sum += list2.get(i);
        }

        System.out.println(sum);

    }
}
