package maharishi.recursions.easy;
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class NumberOfSteps {
    static int counter(int number, int steps){
        if (number == 0) {
            return  steps;
        }
        if(number % 2 == 0) {
            return counter(number / 2, steps+1);
        }
        return counter(number -1, steps +1);
    }
    public static void main(String[] args) {
        System.out.println(counter(1, 0));
    }
}
