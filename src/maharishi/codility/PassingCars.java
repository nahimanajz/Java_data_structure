package maharishi.codility;

public class PassingCars {
    public  static int count(int[] arr){
        int east = 0;
        int west = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                east++;
            } else {
                west +=east;
            }
            if(west> 1_000_000_000){
                return -1;
            }
        }
        return west;

    }
    public static void main(String[] args) {
        int[] arr = {0,1,0, 1,1};
         int result = PassingCars.count(arr);
        System.out.println(result);
    }
}
