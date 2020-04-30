package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayInversion {

    public static void main(String args[]) {
        String[] ar = {"apple", "ape", "april"};
                // {"geeksforgeeks", "geeks", "geek", "geezer"};

        String s = "ankitjain";

        List list = new ArrayList();
        list.add(7);
        list.add("an");

        System.out.println(list.get(1));

        int i = ar[0].length();
        //String s = "";

        for(int j=1; j<ar.length; j++) {
            if(ar[j].length() < i) {
                i = ar[j].length();
                s = ar[j];
            }
        }

        int count = 0;

        for(int j=0; j<i; j++) {

            boolean flag = true;
            for(int k=0; k<ar.length; k++) {

                if(! (ar[k].substring(0, j+1).contains(s.substring(0,j+1)))) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                count++;
            } else {
                break;
            }
        }

        System.out.println(count);


    }
}
