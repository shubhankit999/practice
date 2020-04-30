import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GenerateOtp {


    public static void main(String[] args) {
        //System.out.println(generateNumericOtp(6));
        //Scanner
        String s = "abs \"ktl cc\" kl";

        //Pattern.matches("[amn]", "abcd");

        //String[] ss = s.split("()");

        //if()

        String regex = "\"([^\"]*)\"|(\\S+)";

        Matcher m = Pattern.compile(regex).matcher(s);
        while (m.find()) {
            if (m.group(1) != null) {
                System.out.println("Quoted [" + m.group(1) + "]");
            } else {
                System.out.println("Plain [" + m.group(2) + "]");
            }

//        int count = 0;
//
//        List<String> lis = new ArrayList<>();
//        for (String st : ss) {
//            if (st.contains("\"")) {
//                System.out.print(st + " ");
//            } else {
//                System.out.println(st);
//            }
//
//
//        }

        }


    }
}
