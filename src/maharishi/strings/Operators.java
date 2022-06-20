package maharishi.strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+ 'b'); //195 // it will be converted into numbers
        System.out.println("a"+"b");  //ab
        System.out.println((char)('a' + 3)); //d // everything will converted into character {a,b,c ....z}
        System.out.println( "a" +1);  //a1 // since one entry is string then output will be a1
        System.out.println("Janvier" + new ArrayList<>()); // Janvier[]
        System.out.println("Janvier" + new Integer(56)); // Janvier56, since one entry is string then everything has changed to string
        String ans = new Integer(56) +""+ new ArrayList<>();
        System.out.println(ans);

        /**
         * Notes when
         * whW
         */
    }
}
