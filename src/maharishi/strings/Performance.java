package maharishi.strings;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i <26 ; i++) {
            char ch = (char) ('a' + i);
            series =  series + ch;

        }
        System.out.println(series);
        // Surprisingly time complexity is 0(n*n)
        // Disadvantage every iteration make new heap memory to arrocate new value
        // like:
       /*
           i= 0; then a
           i= 1; then ab
           i= 3; then abc
            .
            .
            .
           i=n then abc ....z
        */
    }
}
