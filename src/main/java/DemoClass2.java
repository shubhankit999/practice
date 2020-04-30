import org.apache.logging.log4j.util.Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoClass2 {

    public static void main(String[] args) {

        List<Integer> coders = new ArrayList<>();
        //10, 1, 9, 8, 6, 2, 3, 5, 7, 4
        coders.add(1);
        coders.add(2);
        coders.add(3);
        coders.add(4);
        coders.add(4);
        Map<Integer, List<Integer>> map = new HashMap();

        String s = "";
        char b = 'a';
        s.replace(s.charAt(0), s.charAt(0));

        int counter = 0;

        for(int i=0; i<coders.size()-2; i++) {

            int c = coders.get(i);


            for(int j=i+1; j<coders.size(); j++) {
                int cc = fun(j, coders.size(), coders.get(i), coders);
                System.out.println("cc : " +cc + " i :" + i + " j : "+j);
                counter = counter + cc;
            }
        }

        System.out.println(counter);


    }

    private static int fun(int n, int l, int c, List<Integer> coders) {

        int incCounter = 1;
        int decCounter = 1;

        int inc = c;
        int dec = c;

        int counter = 0;


        for(int j=n; j<l; j++) {
            if(dec<=coders.get(j)) {
                dec = coders.get(j);
                decCounter++;
            }


            if(decCounter == 3) {
                counter++;
                decCounter =1;
            }

        }

        for(int j=n; j<l; j++) {
            if(inc>=coders.get(j)) {
                inc = coders.get(j);
                incCounter++;
            }
            if(incCounter == 3) {
                counter++;
                incCounter =1;
            }
        }
        return counter;

    }
}
