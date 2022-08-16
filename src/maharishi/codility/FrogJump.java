package maharishi.codility;
//https://app.codility.com/c/run/trainingNWUZU8-AS3/
public class FrogJump {
    public static int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int count = 1;
        int td =X+D; // travelled distance
        if(td >= Y){
            return 1;
        }
        while(td < Y){
            td +=D;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(FrogJump.solution(10,85, 30));
    }
}
