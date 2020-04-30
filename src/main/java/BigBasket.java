import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BigBasket {

    public static void main(String[] args) throws Exception {

        List<Integer> skills = new ArrayList<>();


        String s= "absabs";

        String s1 = "absabsabsabs";


        //m = re.match(r'^(.{%d})\1+$'%3, s);
        System.out.println(findMax(s));

    }

    public static String findMax(String s) {

        String temp = s;

        List<Integer> list = findCofactors(s.length());
        System.out.println(list);

        for(Integer i : list) {
            //System.out.println(s.substring(0, i));


            if(s.substring(0, i).equals(s.substring(i, 2*i))) {

                temp = s.substring(0,i);
                continue;
            } else {
                break;
            }
        }



        return temp;
    }

    public static List findCofactors(int l) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<l; i++) {
            if(l%i==0) {
                list.add(i);
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }
}
