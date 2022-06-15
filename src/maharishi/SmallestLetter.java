package maharishi;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = new char[]{'c', 'f', 'j'};
        char target = 'a';
        System.out.println(nearlestSmallLetter(letters, target)); //output should be target

    }

    private static char nearlestSmallLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length -1;
        while(start <= end) {
            int mid = start + (end- start) / 2;
            if(target < letters[mid]) {
                end = mid -1;
            }else if (target > letters[mid]){
                start= mid+1;
            }

        }
        return letters[start];
    }

}
